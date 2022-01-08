package com.example.szczurtv.szczurtv.uc.Account;

import com.example.szczurtv.szczurtv.model.dao.AccountDao;
import com.example.szczurtv.szczurtv.model.dao.UserDao;
import com.example.szczurtv.szczurtv.model.entity.AccountEntity;
import com.example.szczurtv.szczurtv.model.entity.UserEntity;
import com.example.szczurtv.szczurtv.model.eto.RegistrationDataEto;
import com.example.szczurtv.szczurtv.model.enums.Role;
import com.example.szczurtv.szczurtv.model.eto.UserEto;
import com.example.szczurtv.szczurtv.model.mapper.AccountMapper;
import com.example.szczurtv.szczurtv.model.mapper.UserMapper;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

//@Documented
//@Retention(RetentionPolicy.RUNTIME)
//@Qualifier
@Component
@Validated
public class UcMaintainAccountImpl implements UcMaintainAccount {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private UserMapper userMapper;

    public ResponseEntity<String> register(RegistrationDataEto data) {
        if (!accountDao.isLoginOrEmailBusy(data.getLogin(), data.getEmail())) {
            String hashPassword= BCrypt.hashpw(data.getPassword(),BCrypt.gensalt(10));
            AccountEntity accountEntity = AccountEntity.builder()
                    .id(0L)
                    .login(data.getLogin())
                    .email(data.getEmail())
                    .password(hashPassword)
                    .role(Role.USER)
                    .build();
            UserEntity userEntity = UserEntity.builder()
                    .id(0L)
                    .name(data.getLogin())
                    .account(accountEntity)
                    .build();
            accountEntity.setUser(userEntity);
            accountDao.save(accountEntity);
            return new ResponseEntity<>("successfully registered", HttpStatus.OK);
        }
        return new ResponseEntity<>("login is already taken", HttpStatus.OK);
    }

    public UserEto login(@NotBlank String login, @NotBlank String password) {
        UserEntity userEntity = userDao.getUserEntityByAccountLogin(login);
        if (Objects.nonNull(userEntity)) {
            if (BCrypt.checkpw(password, userEntity.getAccount().getPassword())) {
                return userMapper.userEntityToUserEto(userEntity);
            }
            return null;
        }
        return null;
    }
}

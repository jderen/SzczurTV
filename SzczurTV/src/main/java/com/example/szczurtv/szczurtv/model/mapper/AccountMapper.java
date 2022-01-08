package com.example.szczurtv.szczurtv.model.mapper;

import com.example.szczurtv.szczurtv.model.cto.AccountCto;
import com.example.szczurtv.szczurtv.model.entity.AccountEntity;
import com.example.szczurtv.szczurtv.model.eto.AccountEto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface AccountMapper {
    AccountCto accountEntityToAccountCto(AccountEntity accountEntity);

    AccountEntity accountCtoToAccountEntity(AccountCto accountCto);

    AccountEto accountEntityToAccountEto(AccountEntity accountEntity);

    @Mappings(
            @Mapping(target="password", ignore = true)
    )
    AccountEntity accountEtoToAccountEntity(AccountEto accountEto);
}

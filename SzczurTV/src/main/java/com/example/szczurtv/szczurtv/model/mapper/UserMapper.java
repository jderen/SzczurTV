package com.example.szczurtv.szczurtv.model.mapper;

import com.example.szczurtv.szczurtv.model.cto.UserCto;
import com.example.szczurtv.szczurtv.model.entity.UserEntity;
import com.example.szczurtv.szczurtv.model.eto.UserEto;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = AccountMapper.class)
public interface UserMapper {
    @Mappings(
            @Mapping(target="userChannels", ignore=true)
    )
    UserCto userEntityToUserDto(UserEntity userEntity);

    @Mappings(
            @Mapping(target="userChannels", ignore = true)
    )
    UserEntity userDtoToUserEntity(UserCto userCto);

    @Mappings(
            @Mapping(target="userChannels", ignore = true)
    )
    UserEto userEntityToUserEto(UserEntity userEntity);

    @Mappings(
            @Mapping(target="userChannels", ignore = true)
    )
    UserEntity userEtoToUserEntity(UserEto userEto);
}

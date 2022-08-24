package com.returnorder.managment.authorizationservice.mapper;

import com.returnorder.managment.authorizationservice.dto.UserRegisterDetailsDTO;
import com.returnorder.managment.authorizationservice.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-24T15:06:10+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class UserRegisterDetailsMapperImpl implements UserRegisterDetailsMapper {

    @Override
    public User userRegisterDetailsDtoToUserEntity(UserRegisterDetailsDTO userRegisterDetailsDTO) {
        if ( userRegisterDetailsDTO == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( userRegisterDetailsDTO.getEmail() );
        user.setFullName( userRegisterDetailsDTO.getFullName() );
        user.setPassword( userRegisterDetailsDTO.getPassword() );
        user.setPhone( userRegisterDetailsDTO.getPhone() );
        user.setUsername( userRegisterDetailsDTO.getUsername() );

        return user;
    }
}

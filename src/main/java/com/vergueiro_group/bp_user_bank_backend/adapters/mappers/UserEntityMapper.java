package com.vergueiro_group.bp_user_bank_backend.adapters.mappers;

import com.vergueiro_group.bp_user_bank_backend.domain.entities.User;
import com.vergueiro_group.bp_user_bank_backend.infrastructure.db.entity.UserEntity;

public class UserEntityMapper {
    public static UserEntity toEntity(User user) {
        if (user == null) return null;

        UserEntity entity = new UserEntity();
        entity.setFullName(user.getFullName());
        entity.setCpf(user.getCpf());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        return entity;
    }

    public static User toDomain(UserEntity entity) {
        if (entity == null) return null;

        User user = new User();
        user.setFullName(entity.getFullName());
        user.setCpf(entity.getCpf());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        return user;
    }
}

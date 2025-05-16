package com.vergueiro_group.bp_user_bank_backend.infrastructure.db.repository;
import com.vergueiro_group.bp_user_bank_backend.infrastructure.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<UserEntity, UUID> {
}

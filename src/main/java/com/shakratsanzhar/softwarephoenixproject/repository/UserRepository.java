package com.shakratsanzhar.softwarephoenixproject.repository;

import com.shakratsanzhar.softwarephoenixproject.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsUserByLogin(String login);

    boolean existsUserByLoginAndPassword(String login, String password);
}

package org.example.springsecurityhandmade.repository;

import org.example.springsecurityhandmade.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String name);
}

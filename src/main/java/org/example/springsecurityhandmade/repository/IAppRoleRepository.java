package org.example.springsecurityhandmade.repository;

import org.example.springsecurityhandmade.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}

package org.example.springsecurityhandmade.repository;

import org.example.springsecurityhandmade.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}

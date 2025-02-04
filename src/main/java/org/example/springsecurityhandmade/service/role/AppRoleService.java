package org.example.springsecurityhandmade.service.role;

import org.example.springsecurityhandmade.model.AppRole;
import org.example.springsecurityhandmade.model.AppUser;
import org.example.springsecurityhandmade.repository.IAppRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppRoleService implements IAppRoleService {
    @Autowired
    private IAppRoleRepository appRoleRepository;

    @Override
    public Iterable<AppRole> findAll() {
        return appRoleRepository.findAll();
    }

    @Override
    public AppRole save(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }

    @Override
    public void delete(Long id) {
        appRoleRepository.deleteById(id);
    }

    public AppRole findByName(String name) {
        return appRoleRepository.findByName(name);
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return appRoleRepository.findById(id);
    }

}

package org.example.springsecurityhandmade.service.role;

import org.example.springsecurityhandmade.model.AppRole;
import org.example.springsecurityhandmade.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}

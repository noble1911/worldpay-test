package com.worldpay.test.service.impl;

import com.worldpay.test.dl.RoleRepository;
import com.worldpay.test.domain.Role;
import com.worldpay.test.service.RoleService;
import org.springframework.beans.factory.annotation.Required;

/**
 * Implementation of {@code RoleService}
 */
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Required
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Role getRole(int id) {
        return roleRepository.findOne(id);
    }
}

package com.worldpay.test.service;

import com.worldpay.test.domain.Role;

/**
 * Get Role by id
 */
public interface RoleService {

    /**
     * Get role by id
     *
     * @param id identifier
     *
     * @return {@code Role}
     */
    Role getRole(int id);
}

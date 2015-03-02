package com.worldpay.test.dl;

import com.worldpay.test.domain.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Access to {@code Role}s
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {
}

package com.worldpay.test.dl;

import com.worldpay.test.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Data Access for {@code User}
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    /**
     * Find user by login name
     *
     * @param login user name
     *
     * @return {@code User}
     */
    User findOneByLogin(String login);
}

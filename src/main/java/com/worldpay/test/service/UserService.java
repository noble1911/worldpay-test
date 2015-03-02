package com.worldpay.test.service;

import com.worldpay.test.domain.User;

/**
 * Get User by login
 */
public interface UserService {

    /**
     * Get user by login name
     *
     * @param login user name
     *
     * @return {@code User}
     */
    User getUser(String login);
}

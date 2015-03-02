package com.worldpay.test.service.impl;

import com.worldpay.test.dl.UserRepository;
import com.worldpay.test.domain.User;
import com.worldpay.test.service.UserService;
import org.springframework.beans.factory.annotation.Required;

/**
 * Implementation of {@code UserService}
 */
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Required
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(String login) {
        return userRepository.findOneByLogin(login);
    }
}

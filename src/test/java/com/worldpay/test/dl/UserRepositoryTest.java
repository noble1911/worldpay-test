package com.worldpay.test.dl;

import com.worldpay.test.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Test for {@code UserRepository}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:db/worlpday-ds-ctx.xml")
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void canFindOneByLoginName() {
        final User user = userRepository.findOneByLogin("moder");
        assertThat(user, notNullValue());
    }
}

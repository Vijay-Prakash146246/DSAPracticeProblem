package com.batch.tectes.config;

import com.batch.tectes.entities.User;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User,User> {
    @Override
    public User process(User user) throws Exception {
        return user;
    }
}

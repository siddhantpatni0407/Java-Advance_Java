package com.sid.reactor.sec4.helper;

import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class UserService {

    public static Flux<User> getUsers() {
        return Flux.range(1, 2)
                .map(i -> new User(i));
    }
}
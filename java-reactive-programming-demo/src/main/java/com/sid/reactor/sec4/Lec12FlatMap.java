package com.sid.reactor.sec4;

import com.sid.reactor.sec4.helper.OrderService;
import com.sid.reactor.sec4.helper.UserService;
import com.sid.reactor.util.Util;

import java.io.BufferedReader;

/**
 * @author Siddhant Patni
 */
public class Lec12FlatMap {

    public static void main(String[] args) {

        BufferedReader reader;

        UserService.getUsers()
                //.map(user -> OrderService.getOrders(user.getUserId())) //flux
                .flatMap(user -> OrderService.getOrders(user.getUserId())) // mono / flux
                // .filter(p -> p > 10)
                .subscribe(Util.subscriber());

        Util.sleepSeconds(60);
    }
}
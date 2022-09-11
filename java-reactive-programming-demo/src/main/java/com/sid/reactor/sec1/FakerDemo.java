package com.sid.reactor.sec1;

import com.github.javafaker.Faker;

/**
 * @author Siddhant Patni
 */
public class FakerDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            System.out.println(
                    Faker.instance().name().fullName()
            );
        }
    }
}

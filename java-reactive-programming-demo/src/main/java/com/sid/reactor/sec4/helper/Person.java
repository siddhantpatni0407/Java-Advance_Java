package com.sid.reactor.sec4.helper;

import com.sid.reactor.util.Util;
import lombok.Data;
import lombok.ToString;

/**
 * @author Siddhant Patni
 */
@Data
@ToString
public class Person {

    private String name;
    private int age;

    public Person() {
        this.name = Util.faker().name().firstName();
        this.age = Util.faker().random().nextInt(1, 30);
    }
}
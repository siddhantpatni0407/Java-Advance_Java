package com.sid.reactor.sec4.helper;

import com.sid.reactor.util.Util;
import lombok.Data;
import lombok.ToString;

/**
 * @author Siddhant Patni
 */
@Data
@ToString
public class User {

    private int userId;
    private String name;

    public User(int userId) {
        this.userId = userId;
        this.name = Util.faker().name().fullName();
    }
}

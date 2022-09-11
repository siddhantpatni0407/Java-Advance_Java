package com.sid.reactor.sec2;

import com.sid.reactor.sec2.helper.NameGenerator;
import com.sid.reactor.util.Util;

/**
 * @author Siddhant Patni
 */
public class Lec07FluxVsList {

    public static void main(String[] args) {

       // List<String> names = NameGenerator.getNames(5);
       // System.out.println(names);

        NameGenerator.getNames(5)
                .subscribe(Util.onNext());
    }
}

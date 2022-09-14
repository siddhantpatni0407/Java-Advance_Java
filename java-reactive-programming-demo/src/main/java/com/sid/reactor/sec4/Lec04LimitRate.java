package com.sid.reactor.sec4;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec04LimitRate {

    public static void main(String[] args) {

        Flux.range(1, 1000)   //175
                .log()
                //.limitRate(100)  //75%
                .limitRate(100, 0)  //75%
                //.limitRate(100, 100)  //75%
                //.limitRate(100, 99)  //75%
                .subscribe(Util.subscriber());

    }
}
package com.sid.reactor.sec4;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec01Handle {

    public static void main(String[] args) {

        //handle = filter + map

        Flux.range(1,20)
                .handle((integer, synchronousSink) -> {
                    if(integer % 2 == 0)
                        synchronousSink.next(integer);  //filter
                    else
                        synchronousSink.next(integer+"a");  // map
                })
                .subscribe(Util.subscriber());

        System.out.println("******************");

        Flux.range(1,20)
                .handle((integer, synchronousSink) -> {
                    if(integer == 7)
                        synchronousSink.complete();  //filter
                    else
                        synchronousSink.next(integer);  // map
                })
                .subscribe(Util.subscriber());
    }
}

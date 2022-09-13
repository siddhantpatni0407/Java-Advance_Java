package com.sid.reactor.sec3;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

/**
 * @author Siddhant Patni
 */
public class Lec03FluxTake {

    public static void main(String[] args) {

        // map
        // filter

        Flux.range(1, 10)
                .log()
                .take(3) // cancels the upstream subscription after 3rd item
                .log()
                .subscribe(Util.subscriber());

    }
}
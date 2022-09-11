package com.sid.reactor.sec2;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * @author Siddhant Patni
 */
public class Lec08FluxInterval {

    public static void main(String[] args) {

        Flux.interval(Duration.ofSeconds(1))
                .subscribe(Util.onNext());

        Util.sleepSeconds(5);
    }
}

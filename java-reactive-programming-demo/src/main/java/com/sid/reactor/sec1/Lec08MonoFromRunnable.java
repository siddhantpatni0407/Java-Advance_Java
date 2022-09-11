package com.sid.reactor.sec1;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Mono;

/**
 * @author Siddhant Patni
 */
public class Lec08MonoFromRunnable {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("");

        // Sometimes there will be some time-consuming operations,
        // and you want to be notified then we are using Mono from Runnable

        Mono.fromRunnable(timeConsumingOperations())
                .subscribe(Util.onNext(),
                        Util.onError(),
                        () -> {
                            System.out.println("Process is done. Sending emails...");
                        });
    }

    private static Runnable timeConsumingOperations() {
        return () -> {
            Util.sleepSeconds(3);
            System.out.println("Operation completed");
        };
    }
}

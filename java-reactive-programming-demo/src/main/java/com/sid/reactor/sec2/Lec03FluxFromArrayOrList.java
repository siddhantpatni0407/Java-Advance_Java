package com.sid.reactor.sec2;

import com.sid.reactor.util.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Lec03FluxFromArrayOrList {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b", "c", "d");

        Flux.fromIterable(strings)
                .subscribe(Util.onNext());

        Integer[] integersArray = {2, 5, 7, 8};

        Flux.fromArray(integersArray)
                .subscribe(Util.onNext());

    }
}
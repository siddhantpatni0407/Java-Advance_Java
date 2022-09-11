package com.sid.reactor.sec1;

import com.sid.reactor.sec1.assignment.FileService;
import com.sid.reactor.util.Util;

/**
 * @author Siddhant Patni
 */
public class Lec09AssignmentDemo {

    public static void main(String[] args) {

        //Read content of file 1
        FileService.read("file01.txt")
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());

        //Read content of file 2
        FileService.read("file02.txt")
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());

        //write content into file
        FileService.write("file01.txt", "This is content of file 1")
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());

        FileService.write("file02.txt", "This is content of file 2")
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());

        FileService.write("file03.txt", "This is content of file 3")
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());

        FileService.delete("file03.txt")
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());
    }

}

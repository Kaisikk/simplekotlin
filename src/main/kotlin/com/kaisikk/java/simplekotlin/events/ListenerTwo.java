package com.kaisikk.java.simplekotlin.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class ListenerTwo
//        implements ApplicationListener<ImportEvent>
{
//    @Override
//    public void onApplicationEvent(ImportEvent event) {
//        long timeout = ThreadLocalRandom.current().nextLong(5000L, 20000L);
//        System.out.println(Thread.currentThread().getName() + " " + timeout);
//        try {
//            Thread.sleep(timeout);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("ListTwo - DONE");
//    }
}

package com.kaisikk.java.simplekotlin.events;

import org.springframework.context.ApplicationListener;

import java.util.concurrent.ThreadLocalRandom;

public class ListenerOne implements ApplicationListener<ImportEvent> {
    @Override
    public void onApplicationEvent(ImportEvent event) {
        long timeout = ThreadLocalRandom.current().nextLong(5000L, 20000L);
        System.out.println(Thread.currentThread().getName() + " " + timeout);
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ListOne - DONE");
    }
}

package com.kaisikk.java.simplekotlin.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Обработчик ивентов в листенере
 */
@Component
public class ModernAndAsyncListener {

    @Async
    @EventListener
    public void handleImportEvent(ImportEvent event){
        long timeout = ThreadLocalRandom.current().nextLong(5000L, 20000L);
        System.out.println(Thread.currentThread().getName() + " " + timeout);
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("AsyncListener - DONE");
    }
}

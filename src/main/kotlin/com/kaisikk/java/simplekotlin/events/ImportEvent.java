package com.kaisikk.java.simplekotlin.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Дефолтный ивент для передачи сообщений в приложении
 */
public class ImportEvent extends ApplicationEvent {

    @Getter
    private final String message;

    /**
     * Метод для создания ивента и передачи сообщений в приложении
     *
     * @param source
     * @param message
     */
    public ImportEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}

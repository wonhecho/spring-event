package com.example.eventlistener.Event;

import com.example.eventlistener.Event.FileEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FileEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public void notifyComplete(FileEvent fileEvent)
    {
        applicationEventPublisher.publishEvent(fileEvent);
    }
    public void notifyError(FileEvent fileEvent)
    {
        applicationEventPublisher.publishEvent(fileEvent);
    }
}

package com.example.eventlistener.Event;

import com.example.eventlistener.Event.FileEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FileEventListener {
    @EventListener
    public void onFileEventHandler(FileEvent fileEvent)
    {
        log.info("fileEvent receive type : {} data : {}",fileEvent.getData());
    }
}

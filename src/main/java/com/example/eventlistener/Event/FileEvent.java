package com.example.eventlistener.Event;

import lombok.Builder;
import lombok.Getter;
import com.example.eventlistener.Event.FileEvent;
import java.util.Map;
import java.util.UUID;

@Getter
@Builder
public class FileEvent {
    private String eventId;
    private Map<String,Object> data;

    public static FileEvent toCompleteEvent(Map data)
    {
        return FileEvent.builder()
                .eventId(UUID.randomUUID().toString())
                .data(data)
                .build();
    }
    public static FileEvent toErrorEvent(Map data)
    {
        return FileEvent.builder()
                .eventId(UUID.randomUUID().toString())
                .data(data)
                .build();
    }
}


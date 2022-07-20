package com.example.eventlistener.Event;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class FileService {

    private final FileEventPublisher fileEventPublisher;

    public void fileUpload(Map<String, Object> data)
    {
        try{
            log.info("파일 복사 완료");
            log.info ("DB save complete");
            FileEvent completeEvent = FileEvent.toCompleteEvent(data);
            fileEventPublisher.notifyComplete(completeEvent);
        } catch (Exception e){
            log.error("file upload fail",e);
            FileEvent errorEvent = FileEvent.toErrorEvent(data);
            fileEventPublisher.notifyError(errorEvent);
        }

    }
}

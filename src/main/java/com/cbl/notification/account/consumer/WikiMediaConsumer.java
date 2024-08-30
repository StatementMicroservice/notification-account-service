package com.cbl.notification.account.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WikiMediaConsumer {

    @KafkaListener(topics = "wikimedia_stream", groupId = "city-statement-notification-account-service-wikimedia_stream")
    public void consumeWikiMediaStreamMsg(String msg) throws JsonProcessingException {
        log.info(String.format("#### -> Consuming message from wikimedia_stream topic :: %s", msg));
    }
}

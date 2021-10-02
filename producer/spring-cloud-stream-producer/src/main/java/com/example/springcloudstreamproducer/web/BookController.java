package com.example.springcloudstreamproducer.web;

import com.example.springcloudstreamproducer.model.Book;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

@Slf4j
@RestController
@AllArgsConstructor
//@EnableBinding(Source.class)
public class BookController {

//    private MessageChannel output;

    private StreamBridge streamBridge;

    @PostMapping("/publish")
    public void publishEvent(@RequestBody Book book) {
        log.info(String.format("payload has been sent: [%s]", book));
        streamBridge.send("output-out-0", book);
//        output.send(MessageBuilder.withPayload(book).build());
    }
}

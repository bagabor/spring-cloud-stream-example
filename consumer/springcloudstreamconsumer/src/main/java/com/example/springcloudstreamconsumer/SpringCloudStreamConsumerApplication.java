package com.example.springcloudstreamconsumer;

import com.example.springcloudstreamconsumer.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@Slf4j
@SpringBootApplication
//@EnableBinding(Sink.class)
public class SpringCloudStreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
    }

//    @StreamListener("input")
//    public void consumerMessages(Book book) {
//        log.info(String.format("Consumed payload: [%s]", book));
//    }
}

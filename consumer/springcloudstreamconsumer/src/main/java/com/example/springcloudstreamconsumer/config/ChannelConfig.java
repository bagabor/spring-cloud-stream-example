package com.example.springcloudstreamconsumer.config;

import com.example.springcloudstreamconsumer.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Slf4j
@Configuration
public class ChannelConfig {

    @Bean
    Consumer<Book> input() {
        return book -> log.info(String.format("Consumed payload: [%s]", book));
    }
}

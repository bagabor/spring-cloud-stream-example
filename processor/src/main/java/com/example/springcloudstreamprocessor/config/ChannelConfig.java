package com.example.springcloudstreamprocessor.config;

import com.example.springcloudstreamprocessor.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Slf4j
@Configuration
public class ChannelConfig {

    @Bean
    Function<Book, Book> bookProcessor() {
        return book -> {
            log.info(String.format("Message has been processed: [%s]", book));
            return book;
        };
    }
}

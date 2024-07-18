package com.github.esgoet.hhjava243springweb;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    List<Message> messages = new ArrayList<>();

    @PostMapping
    public void saveMessage(@RequestBody Message clientMessage) {
        System.out.println(clientMessage);
        messages.add(clientMessage);
    }

}

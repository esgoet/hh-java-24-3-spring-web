package com.github.esgoet.hhjava243springweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    List<Message> messages = new ArrayList<>();

    @GetMapping
    public List<Message> getMessages() {
        return messages;
    }

    @GetMapping("/{id}")
    public Message getMessageWithId(@PathVariable String id) {
        return messages.stream().filter(message -> message.getId().equals(id)).findFirst().orElse(null);
    }

    @PostMapping
    public Message saveMessage(@RequestBody Message clientMessage) {
        clientMessage.setId(String.valueOf(messages.size()+1));
        System.out.println(clientMessage);
        messages.add(clientMessage);
        return clientMessage;
    }

    @DeleteMapping("/{id}")
    public boolean deleteMessage(@PathVariable String id) {
        return messages.removeIf(message -> message.getId().equals(id));
    }

}

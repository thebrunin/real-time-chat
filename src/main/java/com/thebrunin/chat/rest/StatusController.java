package com.thebrunin.chat.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping()
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok("Servidor online - ".concat(LocalDateTime.now().toString()));
    }
}

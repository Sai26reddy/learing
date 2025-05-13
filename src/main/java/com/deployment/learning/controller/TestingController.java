package com.deployment.learning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/learning")
public class TestingController {

    @GetMapping
    public ResponseEntity<?> returnObject(){
        Map<String,String> mp = new HashMap<>();
        mp.put("name","sai reddy");
        mp.put("company","walmart");
        return ResponseEntity.ok(mp);
    }
}

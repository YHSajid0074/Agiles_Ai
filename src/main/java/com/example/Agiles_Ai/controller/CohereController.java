package com.example.Agiles_Ai.controller;

import com.example.Agiles_Ai.service.CohereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CohereController {

    @Autowired
    private CohereService cohereService;

    @GetMapping("/ask")
    public String askCreator(@RequestParam String question) {
        return cohereService.askCreator(question+"just write summery");
    }
}

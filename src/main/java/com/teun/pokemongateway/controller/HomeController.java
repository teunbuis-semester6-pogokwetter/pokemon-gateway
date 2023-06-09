package com.teun.pokemongateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping("/Welcome")
    public ResponseEntity<String> welcome(){

        return ResponseEntity.ok().body("Welcome to ✨ PogoKwetter ✨ ");
    }
}

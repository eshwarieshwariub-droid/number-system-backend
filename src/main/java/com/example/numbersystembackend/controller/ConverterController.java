package com.example.numbersystembackend.controller;

import com.example.numbersystembackend.service.ConverterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/convert")
@CrossOrigin
public class ConverterController {

    private final ConverterService converterService;

    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }

    @GetMapping
    public String convert(
            @RequestParam String number,
            @RequestParam String from,
            @RequestParam String to
    ) {
        return converterService.convert(number, from, to);
    }
}

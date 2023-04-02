package com.jimmyvalencia.romannumbers.controller;

import com.jimmyvalencia.romannumbers.dto.input.InputDto;
import com.jimmyvalencia.romannumbers.dto.output.ResponseDto;
import com.jimmyvalencia.romannumbers.service.RomanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/roman-numbers")
public class Controller {
    private RomanService romanService;

    @Autowired
    Controller(RomanService romanService) {
        this.romanService = romanService;
    }

    @PostMapping("/roman-to-integer")
    public ResponseEntity<ResponseDto> romanToIntegerConversion(@RequestBody InputDto roman) {
        return ResponseEntity.status(200).body(romanService.romanToInteger(roman));
    }

    @PostMapping("/integer-to-roman")
    public ResponseEntity<ResponseDto> integerToRomanConversion(@RequestBody InputDto integer) {
        return ResponseEntity.status(200).body(romanService.integerToRoman(integer));
    }
}

package com.jimmyvalencia.romannumbers.controller;

import com.jimmyvalencia.romannumbers.dto.input.InputDto;
import com.jimmyvalencia.romannumbers.dto.output.ResponseDto;
import com.jimmyvalencia.romannumbers.service.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/roman-numbers")
public class Controller {
    private NumbersService romanService;

    @Autowired
    Controller(NumbersService romanService) {
        this.romanService = romanService;
    }

    @PostMapping("/roman-to-integer")
    public ResponseEntity<ResponseDto> romanToIntegerConversion(@RequestBody @Valid InputDto roman) {
        return ResponseEntity
                .status(200)
                .body(romanService.romanToInteger(roman));
    }

    @PostMapping("/integer-to-roman")
    public ResponseEntity<ResponseDto> integerToRomanConversion(@RequestBody @Valid InputDto integer) {
        return ResponseEntity
                .status(200)
                .body(romanService.integerToRoman(integer));
    }
}

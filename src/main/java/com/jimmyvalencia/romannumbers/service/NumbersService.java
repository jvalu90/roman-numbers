package com.jimmyvalencia.romannumbers.service;

import com.jimmyvalencia.romannumbers.dto.input.InputDto;
import com.jimmyvalencia.romannumbers.dto.output.ResponseDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NumbersService implements NumbersServiceInterface {

    @Override
    public ResponseDto integerToRoman(InputDto integer) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        int num = Integer.valueOf(integer.getNumber());

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanLetters[i]);
            }
        }

        return ResponseDto.builder()
                .response("The roman number is: "+ roman)
                .build();

    }

    @Override
    public ResponseDto romanToInteger(InputDto roman) {
        Map<Character, Integer> map = new HashMap<>();
        String s = roman.getNumber();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            number += map.get(s.charAt(i));
        }

        return ResponseDto.builder()
                .response("The integer number is: " + number)
                .build();
    }
}

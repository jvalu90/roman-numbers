package com.jimmyvalencia.romannumbers.service;

import com.jimmyvalencia.romannumbers.dto.input.InputDto;
import com.jimmyvalencia.romannumbers.dto.output.ResponseDto;

public interface RomanServiceInterface {
    ResponseDto integerToRoman(InputDto integer);
    ResponseDto romanToInteger(InputDto roman);
}

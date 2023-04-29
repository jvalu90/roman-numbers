package com.jimmyvalencia.romannumbers.dto.input;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class InputDto {
    @NotEmpty(message = "The body is empty, please send a number")
    @NotNull(message = "The body is null, please send a number")
    @NotBlank(message = "The body has blak spaces, please send a number without spaces")
    @Size(min = 1, message = "The number can't be cero length")
    String number;
}

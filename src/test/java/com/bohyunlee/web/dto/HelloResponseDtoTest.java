package com.bohyunlee.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombok_function_test(){
        //givne
        String name = "test";
        int amount = 1000;

        //when
        //@java.beans.ConstructorProperties({"name", "amount"})
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

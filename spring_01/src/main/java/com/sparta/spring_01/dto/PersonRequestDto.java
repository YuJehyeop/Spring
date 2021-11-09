package com.sparta.spring_01.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PersonRequestDto {
    private String name;
    private String job;
    private int age;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }
}

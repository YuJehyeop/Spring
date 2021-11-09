package com.sparta.spring_01.controller;

import com.sparta.spring_01.domain.ecture.LectureRepository;
import com.sparta.spring_01.dto.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public PersonRequestDto getPerson() {
        PersonRequestDto personRequestDto = new PersonRequestDto();
        personRequestDto.setName("손흥민");
        personRequestDto.setAddress("런던");
        personRequestDto.setAge(28);
        personRequestDto.setJob("대한민국 축구선수");
        return personRequestDto;
    }
}

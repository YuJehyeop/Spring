package com.sparta.spring_07.controller;

import com.sparta.spring_07.LectureRepository;
import com.sparta.spring_07.domain.Lecture;
import com.sparta.spring_07.dto.LectureRequestDto;
import com.sparta.spring_07.service.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor // 의존성 주입용
@RestController
public class LectureController {
    // final: 서비스에게 꼭 필요한 녀석임을 명시
    private final LectureRepository lectureRepository;

    @GetMapping("/api/lectures")
    public List<Lecture> getLectures(){
        return lectureRepository.findAll();
    }

    // PostMapping을 통해서, 같은 주소라도 방식이 다름을 구분합니다.
    @PostMapping("/api/lectures")
    public Lecture createLecture(@RequestBody LectureRequestDto requestDto) {
        // requestDto 는, 생성 요청을 의미합니다.
        // 강의 정보를 만들기 위해서는 강의 제목과 튜터 이름이 필요하잖아요?
        // 그 정보를 가져오는 녀석입니다.

        // 저장하는 것은 Dto가 아니라 Lecture이니, Dto의 정보를 Lecture에 담아야 합니다.ㄹ
        // 잠시 뒤 새로운 생성자를 만듭니다.
        Lecture lecture = new Lecture(requestDto);

        // JPA를 이용하여 DB에 저장하고, 그 결과를 반환합니다.
        return lectureRepository.save(lecture);
    }

    private final LectureService lectureService;

    @PutMapping("/api/lectures/{id}")
    public Long updateLecture(@PathVariable Long id, @RequestBody Lecture requestDto) {
        return lectureService.update(id, requestDto);
    }

    @DeleteMapping("/api/lectures/{id}")
    public Long deleteLecture(@PathVariable Long id){
        lectureRepository.deleteById(id);
        return id;
    }

}

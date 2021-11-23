package com.sparta.spring_07.service;


import com.sparta.spring_07.LectureRepository;
import com.sparta.spring_07.domain.Lecture;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class LectureService {

    // final: 서비스에게 꼭 필요한 녀석임을 명시
    private final LectureRepository lectureRepository;

// @RequiredArgsConstructor의 기능으로 자동 생성 되므로 주석처리됨
//    // 생성자를 통해, Service 클래스를 만들 때 꼭 Repository를 넣어주도록
//    // 스프링에게 알려줌
//    public LectureService(LectureRepository lectureRepository){
//        this.lectureRepository = lectureRepository;
//    }

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public Long update(Long id, Lecture lecture) {
        Lecture lecture1 = lectureRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        lecture1.update(lecture);
        return lecture1.getId();
    }
}

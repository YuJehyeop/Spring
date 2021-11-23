package com.sparta.spring_08;

import com.sparta.spring_08.domain.Lecture;
import com.sparta.spring_08.domain.LectureRepository;
import com.sparta.spring_08.domain.LectureService;
import com.sparta.spring_08.dto.LectureRequestDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing // 시간에 대해서 자동으로 값을 넣어주는 기능
@SpringBootApplication
public class Spring08Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring08Application.class, args);
    }

    // item01Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo(LectureRepository lectureRepository, LectureService lectureService) {
        return (args) -> {
            // 데이터 저장하기
            lectureRepository.save(new Lecture("건대 맛집","연어"));

            // 데이터 전부 조회하기
            List<Lecture> lectureList = lectureRepository.findAll();
            for (int i = 0; i < lectureList.size(); i++) {
                Lecture lecture = lectureList.get(i);
                System.out.println(lecture.getId());
                System.out.println(lecture.getTitle());
                System.out.println(lecture.getTutor());
            }

            // 업데이트 하기
            LectureRequestDto lrquestDto = new LectureRequestDto("웹개발의 봄, Spring", "임민영");
            lectureService.update(1L, lrquestDto);

            // 데이터 전부 조회하기
            lectureList = lectureRepository.findAll();
            for (int i = 0 ; i < lectureList.size() ; i++) {
                Lecture lecture = lectureList.get(i);
                System.out.println(lecture.getId());
                System.out.println(lecture.getTitle());
                System.out.println(lecture.getTutor());
            }
//            // 삭제하기
//            lectureRepository.deleteAll();
        };
    }
}

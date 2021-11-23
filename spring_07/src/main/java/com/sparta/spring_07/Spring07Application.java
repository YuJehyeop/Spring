package com.sparta.spring_07;

import com.sparta.spring_07.domain.Lecture;
import com.sparta.spring_07.service.LectureService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Spring07Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring07Application.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(LectureRepository lectureRepository, LectureService lectureService) {
//        return (args) -> {
//            // 데이터 저장하기
//            lectureRepository.save(new Lecture("프론트엔드의 꽃, 리액트", "임민영"));
//
//            // 잘 되나 확인
//            System.out.println("데이터 인쇄");
//
//            // 데이터 전부 조회하기
//            List<Lecture> lectureList = lectureRepository.findAll();
//            for (int i = 0; i < lectureList.size(); i++) {
//                Lecture lecture = lectureList.get(i);
//                System.out.println(lecture.getId());
//                System.out.println(lecture.getTitle());
//                System.out.println(lecture.getTutor());
//            }
//
////            // 데이터 하나 조회하기
////            Lecture lecture = lectureRepository.findById(1L).orElseThrow(
////                    () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
////            );
//
//            // update
//            Lecture new_lecture = new Lecture("웹개발의 봄, Spring", "임민영");
//            lectureService.update(1L, new_lecture);
//
//            // 데이터 전부 조회하기
//            lectureList = lectureRepository.findAll();
//            for (int i = 0 ; i < lectureList.size() ; i++) {
//                Lecture lecture = lectureList.get(i);
//                System.out.println(lecture.getId());
//                System.out.println(lecture.getTitle());
//                System.out.println(lecture.getTutor());
//            }
//            // deleteAll
////            lectureRepository.deleteAll();
//        };
//    }
}

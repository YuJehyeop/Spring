package com.sparta.spring_01;

import com.sparta.spring_01.domain.ecture.Lecture;
import com.sparta.spring_01.domain.ecture.LectureRepository;
import com.sparta.spring_01.dto.LectureRequestDto;
import com.sparta.spring_01.service.LectureService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@SpringBootApplication
public class Spring01Application {
	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
	}
//	@Bean
//	public CommandLineRunner demo(LectureRepository lectureRepository, LectureService lectureService) {
//		return (args) -> {
//			// Create
//			// 데이터 저장하기
//			lectureRepository.save(new Lecture());
//			System.out.println("데이터 인쇄");
//
//			// Read
//			// 데이터 전부 조회하기
//			List<Lecture> lectureList = lectureRepository.findAll();
//			for (int i = 0; i < lectureList.size(); i++) {
//				Lecture lecture = lectureList.get(i);
//				System.out.println(lecture.getId());
//				System.out.println(lecture.getTitle());
//				System.out.println(lecture.getTutor());
//			}
//			// Read
//			// 데이터 하나 조회하기 + lambda 사용해서 예외처리
//			Lecture lecture = lectureRepository.findById(1L).orElseThrow(
//					() -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
//			);
//
//			// Update
//			// 데이터 수정하기
//			LectureRequestDto requestDto = new LectureRequestDto("웹개발의 봄, Spring", "임민영");
//			lectureService.update(1L, requestDto);
//			lectureList = lectureRepository.findAll();
//			for (int i = 0 ; i < lectureList.size() ; i++) {
//				Lecture lecture = lectureList.get(i);
//				System.out.println(lecture.getId());
//				System.out.println(lecture.getTitle());
//				System.out.println(lecture.getTutor());
//			}
//			//DELETE
//			lectureRepository.deleteAll();
//		};
//	}

}


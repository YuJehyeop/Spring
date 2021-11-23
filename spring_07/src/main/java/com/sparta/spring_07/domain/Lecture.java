package com.sparta.spring_07.domain;

import com.sparta.spring_07.dto.LectureRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // getID 이런것들을 자동생성 해준다.
@Entity // 테이블임을 나타냅니다.
@NoArgsConstructor // 기본 생성자 자동 생성
public class Lecture extends Timestamped{

    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다.
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타냅니다.
    private String title;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함을 나타냅니다.
    private String tutor;

    // controller에서 Lecture의 requestDto 로 받게 되어 쓸모가 없어짐
//    public Lecture(String title, String tutor) {
//        this.title = title;
//        this.tutor = tutor;
//    }

    public void update(Lecture lecture){
        this.title = lecture.title;
        this.tutor = lecture.tutor;
    }

    public Lecture(LectureRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }
}

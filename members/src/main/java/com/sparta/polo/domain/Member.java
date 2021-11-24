package com.sparta.polo.domain;

import com.sparta.polo.dto.MemberRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Member {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    public String membername;

    @Column(nullable = false)
    public int age;

    public Member(String membername, int age) {
        this.membername = membername;
        this.age = age;
    }

    public Member(MemberRequestDto requestDto) {
        this.membername = requestDto.getMembername();
        this.age = requestDto.getAge();
    }

    public void updateMember(String membername, int age) {
        this.membername = membername;
        this.age = age;
    }
}

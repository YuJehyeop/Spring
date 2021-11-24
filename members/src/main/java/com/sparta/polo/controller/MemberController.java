package com.sparta.polo.controller;

import com.sparta.polo.Service.MemberService;
import com.sparta.polo.domain.Member;
import com.sparta.polo.dto.MemberCorrectionRequestDto;
import com.sparta.polo.dto.MemberRequestDto;
import com.sparta.polo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {
    // 멤버 변수 선언
    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @GetMapping("api/members")
    public List<Member> getMembers() throws SQLException {
        return memberRepository.findAll();
    }

    @GetMapping("api/members/{id}")
    public Long getMember(@PathVariable Long id) {
        memberRepository.getById(id);
        return id;
    }

    @PostMapping("api/members/add")
    public Member createMember(@RequestBody MemberRequestDto requestDto) throws SQLException {
        Member member = memberService.createMember(requestDto);
        return member;
    }

    @PutMapping("api/members/{id}")
    public Long updateMember(@PathVariable Long id, @RequestBody MemberCorrectionRequestDto requestDto) throws SQLException {
        Member member = memberService.updateMember(id, requestDto);
        return member.getId();
    }

    @DeleteMapping("api/members/{id}")
    public Long deleteMember(@PathVariable Long id) {
        memberRepository.deleteById(id);
        return id;
    }
}

package com.sparta.polo.Service;


import com.sparta.polo.domain.Member;
import com.sparta.polo.dto.MemberCorrectionRequestDto;
import com.sparta.polo.dto.MemberRequestDto;
import com.sparta.polo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public Member createMember(MemberRequestDto requestDto) {
        Member member = new Member((requestDto));
        memberRepository.save(member);
        return member;
    }

    @Transactional
    public Member updateMember(Long id, MemberCorrectionRequestDto requestDto){
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        String membername = requestDto.getMembername();
        int age = requestDto.getAge();

        member.updateMember(membername, age);
        return member;
    }


}

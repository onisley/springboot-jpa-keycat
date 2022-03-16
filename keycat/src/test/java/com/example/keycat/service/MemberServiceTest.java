package com.example.keycat.service;

import com.example.keycat.domain.Member;
import com.example.keycat.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void testJoin_회원가입_성공() throws Exception {
        // given
        Member member = new Member();
        member.setName("onisley");

        // when
        Long savedId = memberService.join(member);

        // then
        assertEquals(member, memberRepository.findOne(savedId));
    }

    @Test(expected = IllegalStateException.class)
    public void testJoin_중복회원_예외() throws Exception {
        // given
        Member existMember = new Member();
        existMember.setName("kwon");
        memberService.join(existMember);

        Member newMember = new Member();
        newMember.setName("kwon");

        // when
        memberService.join(newMember);

        // then
        fail();
    }

}
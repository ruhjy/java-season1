package home.core;

import home.core.member.*;

public class MemberApp {
	public static void main(String[] args) {
		
		MemberService memberService = new MemberServiceImpl();
		
		Member member = new Member(1L, "memberA", Grade.VIP);
		
		memberService.join(member);
		Member findMember = memberService.findByName(1L);
		
		System.out.println("new Member = " + member.getName());
		System.out.println("find Member = " + findMember.getName());
		
	}
}
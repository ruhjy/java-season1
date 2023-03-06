package home.core.member;

import home.core.repository.*;

public class MemberServiceImpl implements MemberService {

//	MemberRepository memberRepository = new MemoryMemberRepository();
	private final MemberRepository memberRepository;

	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findByName(Long memberId) {
		return memberRepository.findById(memberId);
	}

}

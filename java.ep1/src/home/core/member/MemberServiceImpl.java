package home.core.member;

public class MemberServiceImpl implements MemberService {
	
	MemberRepository memberRepository = new MemoryMemberRepository();

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findByName(Long memberId) {
		return memberRepository.findById(memberId);
	}

}

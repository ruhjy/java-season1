package home.core.member;

public interface MemberService {

	void join(Member member);

	Member findByName(Long memberId);
}

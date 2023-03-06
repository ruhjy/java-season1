package home.core.repository;

import home.core.member.*;

public interface MemberRepository {
	
	void save(Member member);
	
	Member findById(Long memberId);
}

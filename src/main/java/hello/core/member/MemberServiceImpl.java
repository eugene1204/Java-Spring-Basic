package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class MemberServiceImpl implements MemberService{
    // 구현체가 하나만있으면 그냥 뒤에 impl을 붙인다.
    private final MemberRepository memberRepository;
    @Autowired // ex) ac.getBean(MemberRepository.class)
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
    // 테스트 전용

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}

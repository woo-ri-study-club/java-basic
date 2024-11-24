package domain;

import java.util.ArrayList;
import java.util.List;

public class Members {
    private List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public Member login(String id, String password) {
        return members.stream()
                .filter(member -> member.isMatchIdAndPassword(id, password))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("아이디 또는 비밀번호가 일치하지 않습니다."));
    }
}

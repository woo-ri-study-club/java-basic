package domain;

import java.util.ArrayList;
import java.util.List;

public class Members {
    private List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }
}

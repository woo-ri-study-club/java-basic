package section13.member;

import section13.member.config.AdminConifg;
import section13.member.data.LoginData;
import section13.member.data.RegistData;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MemberService {

    private final Map<String, BaseMember> members = new ConcurrentHashMap<>();
    private final Session session = Session.getInstance();

    public void register() {
        RegistData registData = Console.registConsole();
        BaseMember newMember;

        validateDuplicateId(registData.getId());
        if(registData.hasKey()){
            validateAdminKey(registData.getKey());
            newMember = new Admin(registData.getId(), registData.getName(), registData.getPassword());
        } else{
            newMember = new Member(registData.getId(), registData.getName(), registData.getPassword());
        }
        members.put(registData.getId(), newMember);
        System.out.println("회원가입이 완료되었습니다");
    }

    public void login() {
        LoginData loginData = Console.loginConsole();
        BaseMember loginMember = findMemberById(loginData.getId());
        validatePassword(loginMember, loginData);
    }

    private void validatePassword(BaseMember loginMember, LoginData loginData) {
        if(loginMember.verifyPassword(loginData.getPassword())){
            session.registLoginMember(loginMember);
            return;
        }
        throw new IllegalArgumentException("옳지 않은 비밀번호입니다.");
    }

    public void logout() {
        session.clear();
    }

    private BaseMember findMemberById(String id) {
        if (!members.containsKey(id)) {
            throw new IllegalArgumentException("존재하지 않는 id입니다.");
        }
        return members.get(id);
    }

    private void validateDuplicateId(String id) {
        if (members.containsKey(id)) {
            throw new IllegalArgumentException("이미 존재하는 id입니다.");
        }
    }

    private void validateAdminKey(String key) {
        if (!AdminConifg.ADMIN_KEY.equals(key)) {
            throw new IllegalArgumentException("관리자 키가 올바르지 않습니다.");
        }
    }

    public BaseMember getLoginMember() {
        return session.getLoginMember();
    }
}

package domain;

public class Member {
    private String name;
    private String id;
    private String password;
    private MemberType memberType;

    public Member(String name, String id, String password, MemberType memberType) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.memberType = memberType;
    }

    public static Member signUpMember(String signUpName, String signUpId, String signUpPassword, MemberType memberType) {
        return new Member(signUpName, signUpId, signUpPassword, memberType);
    }

    public boolean isMatchIdAndPassword(String id, String password) {
        return this.id.equals(id) && this.password.equals(password);
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return memberType == MemberType.MEMBER;
    }

    public boolean isAdmin() {
        return memberType == MemberType.ADMIN;
    }
}

package domain;

public enum MemberType {
    ADMIN("관리자"),
    MEMBER("일반 회원");

    private final String description;

    MemberType(String description) {
        this.description = description;
    }
}

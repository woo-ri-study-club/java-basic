package mission6.advanced.domain;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void updatePassword(String password){
        validateBlankPassword(password);
        validateSamePassword(password);

        this.password = password;
    }

    private void validateBlankPassword(String password) {
        if (password == null || password.isBlank()){
            throw new IllegalArgumentException("변경하실 패스워드를 입력해야 합니다.");
        }
    }

    private void validateSamePassword(String password) {
        if (password.equals(this.password)){
            throw new IllegalArgumentException("기존 패스워드와 동일합니다.");
        }
    }

    String displayUser() {
        return "사용자 이름: " + userName;
    }
}

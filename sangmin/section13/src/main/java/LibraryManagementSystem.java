import domain.Member;
import domain.MemberType;
import domain.Members;
import io.InputHandler;
import io.OutputHandler;

public class LibraryManagementSystem {
    private Members members;

    public LibraryManagementSystem() {
        this.members = new Members();
    }

    public void start() {
        while (true) {
            OutputHandler.printMainManu();
            String mainMenuSelected = InputHandler.getMenuSelected();
            if (mainMenuSelected.equals("1")) {
                OutputHandler.printSignUpMenu();

                OutputHandler.printSignUpId();
                String signUpId = InputHandler.getSignUpId();
                OutputHandler.printSignUpPassword();
                String signUpPassword = InputHandler.getSignUpPassword();
                OutputHandler.printSignUpName();
                String signUpName = InputHandler.getSignUpName();

                Member newMember = Member.signUpMember(signUpName, signUpId, signUpPassword, MemberType.MEMBER);
                members.addMember(newMember);

                OutputHandler.printSignSuccess(newMember.getName());
                continue;
            }
            if (mainMenuSelected.equals("2")) {
                OutputHandler.printLoginMenu();

                OutputHandler.printLoginId();
                String loginId = InputHandler.getLoginId();
                OutputHandler.printLoginPassword();
                String loginPassword = InputHandler.getLoginPassword();

                Member loginedMember = members.login(loginId, loginPassword);

                OutputHandler.printLoginSuccess(loginedMember.getName());
                if (loginedMember.isMember()) {
                    while (true) {
                        OutputHandler.printMemberMenu();
                        String memberMenuSelected = InputHandler.getMenuSelected();
                        if (memberMenuSelected.equals("1")) {
                            // 책 조회
                        }
                        if (memberMenuSelected.equals("2")) {
                            // 책 대출
                        }
                        if (memberMenuSelected.equals("3")) {
                            // 책 반납
                        }
                        if (memberMenuSelected.equals("4")) {
                            // 대출 목록 조회
                        }
                        if (memberMenuSelected.equals("5")) {
                            // 로그아웃
                            break;
                        }
                        System.out.println("잘못된 입력입니다.");
                    }
                }
                if (loginedMember.isAdmin()) {
                    while (true) {
                        OutputHandler.printAdminMenu();
                        String adminMenuSelected = InputHandler.getMenuSelected();
                        if (adminMenuSelected.equals("1")) {
                            // 책 등록
                        }
                        if (adminMenuSelected.equals("2")) {
                            // 책 조회
                        }
                        if (adminMenuSelected.equals("3")) {
                            // 대출 회원 목록 조회
                        }
                        if (adminMenuSelected.equals("4")) {
                            // 로그아웃
                            break;
                        }
                        System.out.println("잘못된 입력입니다.");
                    }
                }
                continue;
            }
            if (mainMenuSelected.equals("3")) {
                break;
            }

            System.out.println("잘못된 입력입니다.");
        }
    }
}

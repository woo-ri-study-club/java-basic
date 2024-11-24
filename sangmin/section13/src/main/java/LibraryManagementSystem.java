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
            String mainMenuSelected = InputHandler.getMainMenuSelected();
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

                continue;
            }
            if (mainMenuSelected.equals("3")) {
                break;
            }

            System.out.println("잘못된 입력입니다.");
        }
    }
}

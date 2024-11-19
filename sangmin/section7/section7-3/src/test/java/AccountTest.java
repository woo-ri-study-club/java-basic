import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AccountTest {

    @DisplayName("정상적인 입금")
    @Test
    void deposit() {
        // given
        User user = new User("name", "password");
        Account account = new Account(user, 1000);

        // when
        account.deposit(1000);

        // then
        assertSoftly(softly -> {
            softly.assertThat(account.getUserName()).isEqualTo("name");
            softly.assertThat(account.getBalance()).isEqualTo(2000);
        });
    }

    @DisplayName("입금액이 0보다 작으면 IllegalArgumentException 발생")
    @Test
    void depositWithLowerZero() {
        // given
        User user = new User("name", "password");
        Account account = new Account(user, 1000);

        // when & then
        assertThrows(IllegalArgumentException.class,
                () -> account.deposit(-1000));

    }

    @DisplayName("정상적인 출금")
    @Test
    void withdraw() {
        // given
        User user = new User("name", "password");
        Account account = new Account(user, 1000);

        // when
        account.withdraw(1000, "password");

        // then
        assertSoftly(softly -> {
            softly.assertThat(account.getUserName()).isEqualTo("name");
            softly.assertThat(account.getBalance()).isEqualTo(0);
        });
    }

    @DisplayName("잔액보다 큰 금액을 출금하면 IllegalStateException 발생")
    @Test
    void withDrawWithHigherDeposit() {
        // given
        User user = new User("name", "password");
        Account account = new Account(user, 1000);

        // when & then
        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(1100, "password"));
    }

    @DisplayName("비밀번호를 틀리면 IllegalStateException 발생")
    @Test
    void withDrawWithWrongPassword() {
        // given
        User user = new User("name", "password");
        Account account = new Account(user, 1000);

        // when & then
        assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(900, "wrongPassword"));
    }
}
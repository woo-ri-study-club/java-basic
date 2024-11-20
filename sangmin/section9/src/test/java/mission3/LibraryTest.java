package mission3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class LibraryTest {
    @DisplayName("책을 추가한 다음 책의 정보를 출력한다.")
    @Test
    void test1() {
        Library library = new Library();
        library.addBook(new Book("소년이 온다", "한강"));
        library.addBook(new Book("1984", "George Orwell"));
        library.showBooks();

        assertSoftly(softly -> {
            softly.assertThat(library).extracting("books").asList().hasSize(2);
            softly.assertThat(library).extracting("books").asList().element(0).hasFieldOrPropertyWithValue("title", "소년이 온다");
            softly.assertThat(library).extracting("books").asList().element(0).hasFieldOrPropertyWithValue("author", "한강");
            softly.assertThat(library).extracting("books").asList().element(1).hasFieldOrPropertyWithValue("title", "1984");
            softly.assertThat(library).extracting("books").asList().element(1).hasFieldOrPropertyWithValue("author", "George Orwell");
        });
    }

    @DisplayName("책을 5권 추가한 다음 책을 추가하려고 하면 예외를 발생시킨다.")
    @Test
    void test2() {
        // given
        Library library = new Library();
        library.addBook(new Book("소년이 온다", "한강"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("책1", "저자1"));
        library.addBook(new Book("책2", "저자2"));
        library.addBook(new Book("책3", "저자3"));

        // when& then
        assertSoftly(softly -> {
            softly.assertThatThrownBy(() -> library.addBook(new Book("책1", "저자1")))
                    .isInstanceOf(IllegalStateException.class)
                    .hasMessage("책은 최대 5권까지만 추가할 수 있습니다.");
        });
    }
}
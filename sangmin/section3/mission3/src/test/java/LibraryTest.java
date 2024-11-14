import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class LibraryTest {

    @DisplayName("도서 목록을 가져온다.")
    @Test
    void getBook() {
        // given
        Book[] books = new Book[]{
                new Book("title", "author", 10000),
                new Book("title2", "author2", 20000),
                new Book("title3", "author3", 30000),
        };

        Library library = new Library(books);

        // when & then
        assertSoftly(softly -> {
            softly.assertThat(library.getBooks()[0].getTitle()).isEqualTo("title");
            softly.assertThat(library.getBooks()[1].getTitle()).isEqualTo("title2");
            softly.assertThat(library.getBooks()[2].getTitle()).isEqualTo("title3");
        });

    }

    @DisplayName("null인 도서객체를 조회하면 NullPointerException이 발생한다.")
    @Test
    void getNullBook() {
        // given
        Book[] books = new Book[]{
                new Book("title", "author", 10000),
                null
        };

        Library library = new Library(books);

        // when & then
        Assertions.assertThrows(NullPointerException.class, () -> {
            library.getBooks()[1].getTitle();
        });
    }
}
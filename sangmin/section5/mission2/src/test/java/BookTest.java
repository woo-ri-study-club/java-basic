import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class BookTest {
    @DisplayName("책을 생성한다.")
    @Test
    void createBook() {
        //given & when
        Book book = new Book("title", "author", "2024");

        //then
        assertSoftly(softly -> {
            softly.assertThat(book).isInstanceOf(Book.class);
            softly.assertThat(book.getTitle()).isEqualTo("title");
            softly.assertThat(book.getAuthor()).isEqualTo("author");
            softly.assertThat(book.getPublishedYear()).isEqualTo("2024");
        });
    }

    @DisplayName("제목과 저자로 책을 생성한다.")
    @Test
    void createBookWithTitleAndAuthor() {
        //given & when
        Book book = new Book("title", "author");

        //then
        assertSoftly(softly -> {
            softly.assertThat(book).isInstanceOf(Book.class);
            softly.assertThat(book.getTitle()).isEqualTo("title");
            softly.assertThat(book.getAuthor()).isEqualTo("author");
            softly.assertThat(book.getPublishedYear()).isEqualTo("2024");
        });
    }
}
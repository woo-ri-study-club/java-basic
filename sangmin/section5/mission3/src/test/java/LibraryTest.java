import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

class LibraryTest {

    @DisplayName("특정 제목의 도서를 검색")
    @Test
    void searchBookByTitle() {
        //given
        Library library = new Library();
        library.addBook(new Book("title", "author", "2024"));
        library.addBook(new Book("title2", "author2", "2024"));
        library.addBook(new Book("title3", "author3", "2024"));

        //when
        Book book = library.searchBookByTitle("title");

        //then
        assertSoftly(softly -> {
            softly.assertThat(book).isInstanceOf(Book.class);
            softly.assertThat(book.getTitle()).isEqualTo("title");
            softly.assertThat(book.getAuthor()).isEqualTo("author");
            softly.assertThat(book.getPublishedYear()).isEqualTo("2024");
        });
    }
}
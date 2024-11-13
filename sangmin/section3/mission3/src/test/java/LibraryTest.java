import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LibraryTest {
    @DisplayName("null인 인스턴스를 참조하면 NullPointerException이 발생한다.")
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
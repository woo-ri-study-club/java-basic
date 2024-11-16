package mission3;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private String isBn;
    private boolean isCheckedOut;

    private Book(String name, String author, String isBn) {
        validateInput(name, "도서명");
        validateInput(author, "저자명");
        validateInput(isBn, "isBn");

        this.name = name;
        this.author = author;
        this.isBn = isBn;
    }

    private void validateInput(String value, String fieldName) {
        if (!StringUtils.hasText(value)) {
            throw new IllegalArgumentException(fieldName + "은 null이거나 비어 있을 수 없습니다.");
        }
    }

    public static Book createBook(String name, String author, String isBn) {
        return new Book(name, author, isBn);
    }

    public boolean matchName(String name) {
        return this.name.equals(name);
    }

    public boolean matchIsBn(String isBn) {
        return this.isBn.equals(isBn);
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String checkOut() {
        isAvailableForCheckout();
        isCheckedOut = true;
        return name;
    }

    private void isAvailableForCheckout() {
        if (isCheckedOut) {
            throw new IllegalStateException("해당 도서는 이미 대출되었습니다.");
        }
    }

    public String returnBook() {
        isAvailableForReturn();
        isCheckedOut = false;
        return name;
    }

    private void isAvailableForReturn() {
        if (!isCheckedOut()) {
            throw new IllegalStateException("해당 도서 대출 기록이 없습니다.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(isBn, book.isBn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBn);
    }

    @Override
    public String toString() {
        return String.format("도서명: %s, 저자: %s, isBn: %s", name, author, isBn);
    }
}

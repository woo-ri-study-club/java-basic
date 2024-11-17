package mission4;

public enum ErrorCode {
    BOOK_LIMIT_EXCEEDED("추가 가능한 도서 범위를 초과했습니다."),
    BOOK_NOT_FOUND("도서가 존재하지 않습니다."),
    REQUIRE_NOT_NULL_NOT_EMPTY("Null이거나 비어있을 수 없습니다."),
    ALREADY_ADDED("이미 등록된 도서입니다."),
    ;

    private final String defaultMessage;

    ErrorCode(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }
}

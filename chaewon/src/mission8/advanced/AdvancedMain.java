package mission8.advanced;

public class AdvancedMain {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("소년이 온다", "한강"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("채식주의자", "한강"));
        library.addBook(new Book("난 토마토 절대 안 먹어", "로렌 차일드"));
        library.addBook(new Book("난 학교 가기 싫어", "로렌 차일드"));
        library.addBook(new Book("이기적 유전자", "리처드 도킨스"));
        library.addBook(new Book("사피엔스", "유발 하라리"));
        library.addBook(new Book("불편한 편의점", "김호연"));
        library.addBook(new Book("인간실격", "다자이 오사무"));
        library.addBook(new Book("데미안", "헤르만 헤세"));
        library.addBook(new Book("눈물 상자", "한강")); //용량 초과

        library.showBooks();
    }
}

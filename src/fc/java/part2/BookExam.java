package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        // 한 권의 책 데이터를 저장하기 위해 인스턴스를 생성
        Book b = new Book();

        b.title = "Java Starter";
        b.author = "Kim";
        b.price = 10000;
        b.page = 123;
        b.isbn = "1234567890";
        b.company = "publish";

        System.out.println(b.title + " " + b.author + " " + b.price + " " + b.page + " " + b.isbn + " " + b.company);
    }
}

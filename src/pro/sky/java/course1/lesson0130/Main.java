package pro.sky.java.course1.lesson0130;

public class Main {
    public static void main(String[] args) {
        Author ivanov = new Author("Ivan", "Ivanov");
        Author petrov = new Author("Petr", "Petrov");
        Book shekspir = new Book("Shekspir", ivanov, 1896);
        Book borel = new Book("Borel", petrov, 1931);
        System.out.println("shekspir.getBookName() = " + shekspir.getBookName());
        System.out.println("borel.getBookYear() = " + borel.getBookYear());
        borel.setBookYear(1960);
        System.out.println("borel.getBookYear() = " + borel.getBookYear());
    }
}

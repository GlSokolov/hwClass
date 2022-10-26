public class Main {
    public static void space() {
        System.out.println();
    }

    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир", "Лев Николаевич Толстой", 1863);
        System.out.println("Название книги - "+ warAndPeace.bookName);
        space();
    }
}
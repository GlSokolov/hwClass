public class Main {
    public static void space() {
        System.out.println();
    }

    public static void main(String[] args) {
        space();

        Book warAndPeace = new Book("Война и мир", "Лев Толстой", 1863);
        System.out.println("Название книги - "+ warAndPeace.getBookName());
        System.out.println("Имя автора - "+warAndPeace.getAuthorName());
        System.out.println("Дата публикации - "+warAndPeace.getPublicationYear()+ "г.");
        warAndPeace.setPublicationYear(1939);
        System.out.println("Измененная дата публикации = " + warAndPeace.getPublicationYear());
        Author warAndPeaceAuthor = new Author("Лев Толстой");

        space();

        Book artOfWar = new Book("Исскуство войны", "Сунь Цзы", 2000);
        System.out.println("Название книги - "+ artOfWar.getBookName());
        System.out.println("Имя автора - "+artOfWar.getAuthorName());
        System.out.println("Дата публикации - "+artOfWar.getPublicationYear()+ "г.");
        artOfWar.setPublicationYear(2013);
        System.out.println("Измененная дата публикации = " + artOfWar.getPublicationYear());
        Author artOfWarAuthor = new Author("Сунь Цзы");

        space();
    }
}
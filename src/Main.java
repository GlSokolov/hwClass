public class Main {
    public static void space() {
        System.out.println();
    }

    public static void main(String[] args) {
        space();

        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy , 1863);
        System.out.println("Название книги - "+ warAndPeace.getBookName());
        System.out.println("Имя автора - "+levTolstoy.getName()+ " " +levTolstoy.getSurname());
        System.out.println("Дата публикации - "+warAndPeace.getPublicationYear()+ "г.");

        warAndPeace.setPublicationYear(1939);
        System.out.println("Измененная дата публикации - " + warAndPeace.getPublicationYear());

        space();

        Author sunTzu = new Author("Сунь", "Цзы");
        Book artOfWar = new Book("Исскуство войны", sunTzu, 2000);
        System.out.println("Название книги - "+ artOfWar.getBookName());
        System.out.println("Имя автора - "+sunTzu.getName()+ " " +sunTzu.getSurname());
        System.out.println("Дата публикации - "+artOfWar.getPublicationYear()+ "г.");

        artOfWar.setPublicationYear(2013);
        System.out.println("Измененная дата публикации - " + artOfWar.getPublicationYear());

        space();
    }
}
public class Main {
    public static void main(String[] args) {

        Author alexanderPushkin = new Author("Александр", "Пушкин");

        Book skazki = new Book( "Сказки", 2023, alexanderPushkin);
      skazki.setPublicationYear(2024);
        System.out.println(skazki.getName());
        System.out.println(skazki.getPublicationYear());
    }
}
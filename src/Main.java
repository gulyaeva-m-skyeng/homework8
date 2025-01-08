public class Main {
    public static void main(String[] args) {

        Author alexanderPushkin = new Author("Александр", "Пушкин");
        Author alexanderPushkin2 = new Author("Александр", "Пушкин");
        System.out.println(alexanderPushkin.hashCode());
        System.out.println(alexanderPushkin2.hashCode());
        System.out.println(alexanderPushkin.equals(alexanderPushkin2));

        Book skazki = new Book( "Сказки", 2023, alexanderPushkin);
      skazki.setPublicationYear(2024);

        System.out.println(skazki.getAuthor().toString());
        System.out.println(skazki);
    }
}
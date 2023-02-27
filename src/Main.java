public class Main {
    public static void main(String[] args) {

        Book author = new Book("Green mile",1222.2,1200000,new Author("Erkinbek",
                "Koshalieverkinebk@gmail.com",'M'));
        System.out.println(author);
        Book author1 = new Book("shawshenko escape",1500.21,25000,new Author("Stiven Kinng",
                "Stivenking@mail.com",'M'));
        System.out.println(author1);
        Book author2 = new Book("The Old Man and the Sea",12550.15,125999,
                new Author("Ernest Heminguei","ernestMacho906090@mail.com",'M'));
        System.out.println(author2);
        Book author3 = new Book("Великий Гэтсби",1221212.233,125099,new Author("Scot frensis",
                "ScotKrasavchik@mail.com",'M'));
        System.out.println(author3);
    }
}
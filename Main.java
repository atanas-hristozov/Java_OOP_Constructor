public class Main {
    public static void main(String[] args) {
        Humman Eli = new Humman("Eli", 25, 88);
        Humman Rick = new Humman("Rick", 55, 99);

        System.out.println(Eli.name);
        System.out.println(Rick.name);
        Eli.eat();
        Rick.drink();
    }
}
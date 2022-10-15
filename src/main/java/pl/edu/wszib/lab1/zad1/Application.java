package pl.edu.wszib.lab1.zad1;

public class Application {

    public static void main(String[] args) {

        koktajlTruskawkowy cocktail = new koktajlTruskawkowy( 300, RodzajSmaku.BANANOWY, RodzajTroskawki.ANANASOWA);
        koktajlTruskawkowy cocktail1 = new koktajlTruskawkowy( 300, RodzajSmaku.JABŁKOWY, RodzajTroskawki.ANANASOWA);

        cocktail.jedz();
        cocktail.pij();
        cocktail.smak();
        cocktail1.pij();
    }

    public static void test(int myVar) {
        myVar = 10;
    }
}

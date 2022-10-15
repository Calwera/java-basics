package pl.edu.wszib.lab1.zad1;
//Rodzaje truskawek
//Ananasowa
//Honeoye
//Polka
//Kent
//Christine
public class koktajlTruskawkowy extends koktail {

    private final RodzajTroskawki rodzajTroskawki;

    public koktajlTruskawkowy() {}

    public koktajlTruskawkowy(
            final int kcal,
            final RodzajSmaku smak,
            final RodzajTroskawki rodzajTroskawki) {
        super(kcal, smak);
        this.rodzajTroskawki = rodzajTroskawki;

    }


    @Override
    public void pij() {
        System.out.println("Piję koktajl o smaku " + smak() + " o Slodkosci " + smak().getSlodkosc());

    }





}
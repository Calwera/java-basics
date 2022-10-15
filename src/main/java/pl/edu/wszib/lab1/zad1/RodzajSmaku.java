package pl.edu.wszib.lab1.zad1;

public enum RodzajSmaku {
    TROSKAWKOWY(1),
    BANANOWY(3),
    SZPINAKOWY(0),
    CIASTECZKOWY(5),
    JABŁKOWY(2);

    private final int slodkosc;

    RodzajSmaku(int slodkosc){
        this.slodkosc = slodkosc;
    }

    public int getSlodkosc() {
        return slodkosc;
    }
}

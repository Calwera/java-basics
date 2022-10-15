package pl.edu.wszib.lab1.zad1;

public enum RodzajTroskawki {
        ANANASOWA("Białe Owoce"),
        HONEOYE("Wyrazista"),
        POLKA("Najsmaczniejsza"),
        KENT("Dla fanów słodyczy"),
        CHRISTINE("Zaowocuje szybko i obficie");

        private final String cecha;
    RodzajTroskawki(final String cecha) {
        this.cecha = cecha;
    }

    public String cecha() {
        return cecha;
    }
}

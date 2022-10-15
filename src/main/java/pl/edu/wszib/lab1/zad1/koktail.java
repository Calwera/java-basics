package pl.edu.wszib.lab1.zad1;


public abstract class koktail implements Jadalne, Pijalne,Smakowalne {

    private final int kcal;
    private final RodzajSmaku smak;

    protected koktail(final int kcal, final RodzajSmaku smak ) {
        this.smak = smak;
        this.kcal = kcal;
    }

    @Override
    public void jedz() {
        pij();
    }

    public RodzajSmaku smak() {
        return this.smak;
    }

}
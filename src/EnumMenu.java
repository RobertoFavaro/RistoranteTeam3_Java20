package src;

public enum EnumMenu {
    ANTIPASTI("Antipasto"),
    PRIMIPIATTI("Primo piatto"),
    SECONDIPIATTI("Secondo piatto"),
    DESSERT("Dessert"),
    BEVANDE( "Bevanda");
    private final String tipoDiPortata;

    EnumMenu(String tipoDiPortata) {
        this.tipoDiPortata = tipoDiPortata;
    }

    public String getTipoDiPortata() {
        return tipoDiPortata;
    }
}

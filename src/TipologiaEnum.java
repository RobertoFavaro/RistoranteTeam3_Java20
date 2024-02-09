package src;

public enum TipologiaEnum {
    // Aggiunta tipoMenu.
    VEGETARIANO("Menu Vegetariano"),
    VEGAN("Menu Vegan"),
    NORMALE("Menu Del Giorno"),
    CELIACO("Menu Senza Glutine"),
    NOLATTOSIO("Menu Senza Lattosio");

    //aggiunto tipoMenu su per essere richiamato a metodi riguardo il tipo di menu che sceglierà il cliente.
    private final String tipoMenu;
    TipologiaEnum(String tipoMenu){
        this.tipoMenu = tipoMenu;
    }
    public String getTipoMenu() {
        return tipoMenu;
    }

    //TODO enum che sarà inserito su menu, cliente e decidete voi se anche su ristornate
}

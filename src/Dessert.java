package src;

public class Dessert extends Portata{
    private String caldoOFreddo;

    public Dessert (String nome, String descrizione, String ingredienti, Double prezzo, MenuEnum enumMenu, Integer id, String caldoOFreddo) {
        super(nome, prezzo, enumMenu,descrizione, ingredienti, id);
        this.caldoOFreddo = caldoOFreddo;
    }
// metodo per stampare le portate
    @Override
    public void stampaPortate() {
        super.stampaPortate();
        System.out.print(this.getIngredienti()+"   ");

    }
// metodo to string
    @Override
    public String toString() {
        return "Dessert{" +
                "ingredienti='" + this.getIngredienti() + '\'' +
                '}';
    }
}

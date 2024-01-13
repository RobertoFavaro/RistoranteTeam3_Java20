package src;

public class Dessert extends Portata{
    private String descrizione;
    private String ingredienti;


    public Dessert (String nome, String descrizione, String ingredienti, Double prezzo, EnumMenu enumMenu) {
        super(nome, prezzo, enumMenu);
        this.descrizione=descrizione;
        this.ingredienti=ingredienti;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public void stampaPortate() {
        System.out.print(descrizione+ "    ");
        System.out.print(ingredienti+"   ");

    }

}

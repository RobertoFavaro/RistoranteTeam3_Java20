package src;

public class PrimiPiatti extends Portata{

    private String ingredienti;


    public PrimiPiatti(String nome, String descrizione, String ingredienti, Double prezzo, MenuEnum enumMenu) {
        super(nome, prezzo, enumMenu,descrizione);
        this.ingredienti=ingredienti;
    }



    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public void stampaPortate() {
        //TODO sistemare le altre classi
        super.stampaPortate();
        System.out.print(ingredienti+"   ");

    }

    @Override
    public String toString() {
        return "PrimiPiatti{" +
                "ingredienti='" + ingredienti + '\'' +
                '}';
    }
}
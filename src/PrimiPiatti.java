package src;

public class PrimiPiatti extends Portata{


    public PrimiPiatti(String nome, String descrizione, String ingredienti, double prezzo, EnumMenu enumMenu) {
        super(nome, descrizione, ingredienti, prezzo, enumMenu);
    }

    @Override
    public void stampaPortate() {
        System.out.println(getEnumMenu()+":");
        System.out.print(getNome()+"    ");
        System.out.print(getDescrizione()+ "    ");
        System.out.print(getIngredienti()+"   ");
        System.out.println(getPrezzo());
    }
}
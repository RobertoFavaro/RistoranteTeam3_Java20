package src;

public class SecondiPiatti extends Portata{

    public SecondiPiatti(String nome, String descrizione, String ingredienti, double prezzo, EnumMenu enumMenu) {
        super(nome, descrizione, ingredienti, prezzo, enumMenu);
    }

    //todo questo metodo di stampa va messo nella classe padre
    @Override
    public void stampaPortate() {
        System.out.println(getEnumMenu()+":");
        System.out.print(getNome()+"    ");
        System.out.print(getDescrizione()+ "    ");
        System.out.print(getIngredienti()+"   ");
        System.out.println(getPrezzo());
    }
}

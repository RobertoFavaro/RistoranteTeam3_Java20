package src;

public class Bevande extends Portata{

    public Bevande(String nome, String descrizione, String ingredienti, double prezzo, EnumMenu enumMenu) {
        super(nome, descrizione, ingredienti, prezzo, enumMenu);
    }

    @Override
    public void stampaPortate() {
        System.out.println(getEnumMenu()+":");
        System.out.print(getNome()+"    ");
        System.out.println(getPrezzo());
    }
}

package src;

public class Bevande extends Portata{
    public Bevande(String nome, double prezzo, MenuEnum enumMenu,String descrizione) {
        super(nome, prezzo, enumMenu,descrizione);
    }

    @Override
    public String toString() {
        return "Bevande{}";
    }
}

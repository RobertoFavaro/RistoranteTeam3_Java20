package src;

public class SecondiPiatti implements Portata{
    private String nome;
    private String descrizione;
    private String ingredienti;
    private double prezzo;
    private EnumMenu enumMenu;


    public SecondiPiatti(String nome, String descrizione, double prezzo,String ingredienti,EnumMenu enumMenu) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.ingredienti=ingredienti;
        this.enumMenu = enumMenu;
    }

    public EnumMenu getEnumMenu() {
        return enumMenu;
    }

    public void setEnumMenu(EnumMenu enumMenu) {
        this.enumMenu = enumMenu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
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

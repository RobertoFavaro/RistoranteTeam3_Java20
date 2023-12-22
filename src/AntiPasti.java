package src;

public class AntiPasti implements Portata {
    private String nome;
    private String descrizione;
    private String ingredienti;
    private  double prezzo;
    private EnumMenu enumMenu;

    public AntiPasti(String nome, String descrizione, String ingredienti, double prezzo, EnumMenu enumMenu) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
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

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
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
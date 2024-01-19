package src;

public class Portata {
    //todo questa deve essere una classe
    private String nome;
    private Double prezzo;
    private MenuEnum enumMenu;
    private String descrizione;

    //TODO spostare qui descrizione perchè comune a tutti

    public Portata(String nome, double prezzo, MenuEnum enumMenu,String descrizione) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.enumMenu = enumMenu;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public MenuEnum getEnumMenu() {
        return enumMenu;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setEnumMenu(MenuEnum enumMenu) {
        this.enumMenu = enumMenu;
    }

    public void stampaPortate() {
        System.out.println( enumMenu+":");
        System.out.print( nome +"    ");
        System.out.print(prezzo + "    ");
        System.out.println(descrizione + " ");
    }

}

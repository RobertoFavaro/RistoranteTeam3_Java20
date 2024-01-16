package src;

public class Portata {
    //todo questa deve essere una classe
    private String nome;
    private Double prezzo;
    private MenuEnum enumMenu;

    //TODO spostare qui descrizione perchè comune a tutti

    public Portata(String nome, double prezzo, MenuEnum enumMenu) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.enumMenu = enumMenu;
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

    public void setEnumMenu(MenuEnum enumMenu) {
        this.enumMenu = enumMenu;
    }

    public void stampaPortate() {
        System.out.println( enumMenu+":");
        System.out.print( nome +"    ");
        System.out.print(prezzo + "    ");
    }

}

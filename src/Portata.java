package src;

public class Portata {
    //todo questa deve essere una classe
    private String nome;
    private Double prezzo;
    private EnumMenu enumMenu;

    public Portata(String nome, double prezzo, EnumMenu enumMenu) {
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

    public EnumMenu getEnumMenu() {
        return enumMenu;
    }


    public void stampaPortate() {
        System.out.println( enumMenu+":");
        System.out.print( nome +"    ");
        System.out.print(prezzo + "    ");
    }

}

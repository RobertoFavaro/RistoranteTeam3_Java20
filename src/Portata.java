package src;

public class Portata {
    //todo questa deve essere una classe
    private String nome;
    private String descrizione;
    private EnumMenu enumMenu;

    public Portata(String nome, String descrizione, EnumMenu enumMenu) {
        this.nome = nome;
        this.descrizione = descrizione;
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

    public EnumMenu getEnumMenu() {
        return enumMenu;
    }


    public void stampaPortate() {
        System.out.println( enumMenu+":");
        System.out.print( nome +"    ");
        System.out.print(descrizione + "    ");
    }

}

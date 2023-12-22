package src;

public class Bevande implements Portata{
    private String nome;
    private double prezzo;
    private EnumMenu enumMenu;

    public Bevande(String nome, double prezzo,EnumMenu enumMenu) {
        this.nome = nome;
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
        System.out.println(getPrezzo());
    }
}

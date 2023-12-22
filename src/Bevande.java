package src;

public class Bevande extends Portata{
    private String nome;
    private double prezzo;

    public Bevande(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
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
    public void stampaElementiDellaPortata(){
        System.out.print(getNome()+"     ");
        System.out.println(getPrezzo());
    }
}

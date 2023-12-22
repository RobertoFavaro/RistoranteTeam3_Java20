package src;

public class Dessert extends Portata{
    private String nome;
    private double prezzo;

    public Dessert(String nome, double prezzo) {
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

    @Override
    public String toString() {
        return "Dessert{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }


}

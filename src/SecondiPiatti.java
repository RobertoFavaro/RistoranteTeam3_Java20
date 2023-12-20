package src;

public class SecondiPiatti {
    private String nome;
    private String descrizione;
    private String ingredienti;
    private double prezzo;


    public SecondiPiatti(String nome, String descrizione, double prezzo,String ingredienti) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.ingredienti=ingredienti;
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
}

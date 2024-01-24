package src;

import java.time.OffsetDateTime;

public class Cliente {

    //TODO aggiungere il tipo
    private String nome;
    private String cognome;

    // aggiunto getTipo per il debug del main "menu vuoto"
    private TipologiaEnum tipo;

    public Cliente(String nome, String cognome,TipologiaEnum tipo) {
        this.nome = nome;
        this.cognome = cognome;
        this.tipo = tipo;
    }
    public String getCognome(){return cognome;}
    public void setCognome(String cognome){this.cognome = cognome;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // aggiunto getTipo per il debug del main "menu vuoto"
    public TipologiaEnum getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}

package src;

import java.time.OffsetDateTime;

public class Cliente {

    //TODO aggiungere il tipo
    private String nome;
    private String cognome;

    public Cliente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    public String getCognome(){return cognome;}
    public void setCognome(String cognome){this.cognome = cognome;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
}

package src;

import java.time.OffsetDateTime;

public class Cliente {

    //TODO aggiungere il tipo
    private String nome;
    private String cognome;

    // aggiunto getTipo per il debug del main "menu vuoto"
    private TipologiaEnum tipo;
    private AllergieEnum allergieEnum;

    public Cliente(String nome, String cognome,TipologiaEnum tipo,AllergieEnum allergieEnum) {
        this.nome = nome;
        this.cognome = cognome;
        this.tipo = tipo;
        this.allergieEnum = allergieEnum;
    }

    public void setTipo(TipologiaEnum tipo) {
        this.tipo = tipo;
    }

    public AllergieEnum getAllergieEnum() {
        return allergieEnum;
    }

    public void setAllergieEnum(AllergieEnum allergieEnum) {
        this.allergieEnum = allergieEnum;
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
        return nome + " " +cognome;
    }
}

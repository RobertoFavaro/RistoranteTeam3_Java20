package src;

public class Main {

    public static void main(String[] args) {
        // doppiamo stampare il menù qui dentro
        // ognuno di voi deve creare la propria classe (primiPiatti, secondi ecc ecc)
        // che campi ci saranno? nome - prezzo
        // che metodo deve avere ogni classe?  stampare
        // dopo che avete finito, vi dovete chiedere ci sono campi e metodi duplicati per ogni classe differente? classe padre portata
        // dopo che avete stampato il tutto nel main dobbiamo fare una classe che sposta la logica dal main all'oggetto menù
        // dentro il main devono esserci solo le creazioni degli oggetti, no stampe ne altr, tutto deve essere inglobato in un oggetto menù e successivamente in un oggetto ristorante
        // la classe menu deve avere un enumerato per il tipo e la possibilità di aggiungere le portate e stamparle tramite un metodo stampa menu


        Portata antipasto = new AntiPasti("nome: bruschette miste", "descrizione: buono ma giusto", "ingredienti: bruschetta, pomodoro, rosmarino", 3.50,EnumMenu.ANTIPASTI);
        antipasto.stampaPortate();
    }
}

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


        Portata antipasto1 = new AntiPasti("nome: bruschette miste", "descrizione: pomodorini al forno", "ingredienti: bruschetta, pomodoro, rosmarino", 3.50,EnumMenu.ANTIPASTI);
        antipasto1.stampaPortate();
        Portata antipasto2 = new AntiPasti("nome: prosciutto e melone", "descrizione: prosciutto di parma e melone fresco", "ingredienti: prosciutto e melone", 5.00,EnumMenu.ANTIPASTI);
        antipasto2.stampaPortate();
        Portata antipasto3 = new AntiPasti("nome: carpaccio di manzo", "descrizione: piatto a base di fettine di carne cruda di manzo servita con salsa", "ingredienti: manzo", 10.00,EnumMenu.ANTIPASTI);
        Portata primoPiatto1 = new PrimiPiatti("nome: pasta al pesto", "descrizione: pasta corta con basilico pestato", "ingredienti: pasta e basilico", 8.00,EnumMenu.PRIMIPIATTI);
        primoPiatto1.stampaPortate();
        Portata primoPiatto2 = new PrimiPiatti("nome: carbonara", "descrizione: piatto tipico romano a base di guanciale, uova, pecorino e pepe", "ingredienti: spaghetti, uova, pecorino, pepe, guanciale", 9.00,EnumMenu.PRIMIPIATTI);
        primoPiatto2.stampaPortate();
        Portata primoPiatto3 = new PrimiPiatti("nome: fettucine al ragu", "descrizione: fettuccine a uovo col ragù come sugo", "ingredienti: pasta, manzo macinato, pasata di pomodoro, cipolle, carote", 8.00,EnumMenu.PRIMIPIATTI);
        primoPiatto3.stampaPortate();
        Portata secondoPiatto1 = new SecondiPiatti("nome: tagliata", "descrizione: manzo cotto al sangue e tagliato finemente", 15.00,"ingredienti: manzo",EnumMenu.SECONDIPIATTI);
        secondoPiatto1.stampaPortate();
        Portata secondoPiatto2 = new SecondiPiatti("nome: grigliata mista", "descrizione: carni miste cotte sulla griglia", 12.00,"ingredienti: manzo, pollo, maiale",EnumMenu.SECONDIPIATTI);
        secondoPiatto2.stampaPortate();
        Portata secondoPiatto3 = new SecondiPiatti("nome: hamburger", "descrizione: carne di manzo compattata e cucinata sulla piastra", 7.00, "ingredienti: manzo",EnumMenu.SECONDIPIATTI);
        secondoPiatto3.stampaPortate();
        Portata dessert1 = new Dessert("nome: creme caramel", "descrizione: crema ricoperta di caramello", "ingredienti: latte, uova, zucchero, caramello", 4.00,EnumMenu.DESSERT);
        dessert1.stampaPortate();
        Portata dessert2 = new Dessert("nome: parfait di mandorle", "descrizione: semifreddo a base di mandorle caramellate e panna", "ingredienti: uova, zucchero, mandorle caramellate e panna", 4.00, EnumMenu.DESSERT);
        Portata dessert3 = new Dessert("nome: cannolo", "descrizione: dolce tipico siciliano composto da una cialda croccante ripiena di ricotta dolce", "ingredienti: uova, ricotta, farina, zucchero", 3.00, EnumMenu.DESSERT);
        Portata bevande1 = new Bevande("acqua", 1.00, EnumMenu.BEVANDE);
        Portata bevande2 = new Bevande("vino rosso", 4.00, EnumMenu.BEVANDE);
        Portata bevande3 = new Bevande("Coca Cola", 2.00, EnumMenu.BEVANDE);

        //todo eliminare stampaportata
        Menu menu = new Menu();
        menu.aggiungiPortata(primoPiatto1);
        menu.aggiungiPortata(primoPiatto2);
        menu.aggiungiPortata(primoPiatto3);
        menu.stampaMenu();
    }
}

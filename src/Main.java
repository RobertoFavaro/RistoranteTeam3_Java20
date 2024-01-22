package src;

public class Main {

    public static void main(String[] args) throws Exception{
        // doppiamo stampare il menù qui dentro
        // ognuno di voi deve creare la propria classe (primiPiatti, secondi ecc ecc)
        // che campi ci saranno? nome - prezzo
        // che metodo deve avere ogni classe?  stampare
        // dopo che avete finito, vi dovete chiedere ci sono campi e metodi duplicati per ogni classe differente? classe padre portata
        // dopo che avete stampato il tutto nel main dobbiamo fare una classe che sposta la logica dal main all'oggetto menù
        // dentro il main devono esserci solo le creazioni degli oggetti, no stampe ne altr, tutto deve essere inglobato in un oggetto menù e successivamente in un oggetto ristorante
        // la classe menu deve avere un enumerato per il tipo e la possibilità di aggiungere le portate e stamparle tramite un metodo stampa menu


        Portata antipasto1 = new AntiPasti("bruschette miste", "pomodorini al forno", "ingredienti: bruschetta, pomodoro, rosmarino", 3.50, MenuEnum.ANTIPASTI);
        Portata antipasto2 = new AntiPasti("prosciutto e melone", "prosciutto di parma e melone fresco", "ingredienti: prosciutto e melone", 5.00, MenuEnum.ANTIPASTI);
        Portata antipasto3 = new AntiPasti("carpaccio di manzo", "piatto a base di fettine di carne cruda di manzo servita con salsa", "ingredienti: manzo", 10.00, MenuEnum.ANTIPASTI);
        Portata primoPiatto1 = new PrimiPiatti("pasta al pesto", "pasta corta con basilico pestato", "ingredienti: pasta e basilico", 8.00, MenuEnum.PRIMIPIATTI);
        Portata primoPiatto2 = new PrimiPiatti("carbonara", "piatto tipico romano a base di guanciale, uova, pecorino e pepe", "ingredienti: spaghetti, uova, pecorino, pepe, guanciale", 9.00, MenuEnum.PRIMIPIATTI);
        Portata primoPiatto3 = new PrimiPiatti("fettucine al ragu", "fettuccine a uovo col ragù come sugo", "ingredienti: pasta, manzo macinato, pasata di pomodoro, cipolle, carote", 8.00, MenuEnum.PRIMIPIATTI);
        Portata secondoPiatto1 = new SecondiPiatti("tagliata", "manzo cotto al sangue e tagliato finemente", "ingredienti: manzo",15.00, MenuEnum.SECONDIPIATTI);
        Portata secondoPiatto2 = new SecondiPiatti("grigliata mista", "carni miste cotte sulla griglia", "ingredienti: manzo, pollo, maiale",12.00, MenuEnum.SECONDIPIATTI);
        Portata secondoPiatto3 = new SecondiPiatti("hamburger", "carne di manzo compattata e cucinata sulla piastra", "ingredienti: manzo",7.00 , MenuEnum.SECONDIPIATTI);
        Portata dessert1 = new Dessert("creme caramel", "crema ricoperta di caramello", "ingredienti: latte, uova, zucchero, caramello", 4.00, MenuEnum.DESSERT);
        Portata dessert2 = new Dessert("parfait di mandorle", "semifreddo a base di mandorle caramellate e panna", "ingredienti: uova, zucchero, mandorle caramellate e panna", 4.00, MenuEnum.DESSERT);
        Portata dessert3 = new Dessert("cannolo", "dolce tipico siciliano composto da una cialda croccante ripiena di ricotta dolce", "ingredienti: uova, ricotta, farina, zucchero", 3.00, MenuEnum.DESSERT);
        Portata bevande1 = new Bevande("acqua", 1.00,MenuEnum.BEVANDE,"bevanda dissetante che può essere naturale o frizzante" );
        Portata bevande2 = new Bevande("vino rosso", 4.00, MenuEnum.BEVANDE, "vino ricavato da uve ");
        Portata bevande3 = new Bevande("Coca Cola", 2.00, MenuEnum.BEVANDE,"bibita zuccherata accompagnata da una fetta di limone e ghiaccio");



        //todo eliminare stampaportata

        // Creazione del menu

        //aggiunto tipoMenu
        Menu menu1 = new Menu("Menu alla Marc","VEGAN","Marc",TipologiaEnum.VEGAN);
        Menu menuVegetariano = new Menu("Menu Veg", "VEGETARIANO", "CuocoVeg", TipologiaEnum.VEGETARIANO);
        Menu menuVegan = new Menu("Menu Vegan", "NORMALE", "CuocoVegan", TipologiaEnum.NORMALE);

        menu1.aggiungiPortata(antipasto1, MenuEnum.ANTIPASTI);
        menu1.aggiungiPortata(antipasto2, MenuEnum.ANTIPASTI);
        menu1.aggiungiPortata(antipasto3, MenuEnum.ANTIPASTI);
        menu1.aggiungiPortata(primoPiatto1, MenuEnum.PRIMIPIATTI);
        menu1.aggiungiPortata(primoPiatto2, MenuEnum.PRIMIPIATTI);
        menu1.aggiungiPortata(primoPiatto3, MenuEnum.PRIMIPIATTI);
        menu1.aggiungiPortata(secondoPiatto1, MenuEnum.SECONDIPIATTI);
        menu1.aggiungiPortata(secondoPiatto2, MenuEnum.SECONDIPIATTI);
        menu1.aggiungiPortata(secondoPiatto3, MenuEnum.SECONDIPIATTI);
        menu1.aggiungiPortata(dessert1, MenuEnum.DESSERT);
        menu1.aggiungiPortata(dessert2, MenuEnum.DESSERT);
        menu1.aggiungiPortata(dessert3, MenuEnum.DESSERT);
        menu1.aggiungiPortata(bevande1, MenuEnum.BEVANDE);
        menu1.aggiungiPortata(bevande2, MenuEnum.BEVANDE);
        menu1.aggiungiPortata(bevande3, MenuEnum.BEVANDE);
        //STAMPA DEL MENU'
        menu1.stampaMenu();



        //TODO si crea un ristorante
        //si crea un menù e s'inserisce
        //si creano le portate e s'inseriscono

        Ristorante ristorante = new Ristorante("Ristorante al taglio", 45);
        ristorante.aggiungiMenu(menu1);


        ristorante.aggiungiMenu(menuVegetariano);
        ristorante.aggiungiMenu(menuVegan);


        //TODO tutte le operazione si faranno dalla classe ristorante che è il contenitore di tutti i field

        ristorante.stampaMenuRistorante(TipologiaEnum.VEGETARIANO);
        Cliente cliente1 = new Cliente("Mario", "Ostuni");
        ristorante.aggiungiPrenotazione("lunedì 7 ottobre",cliente1);
        ristorante.stampaPrenotazioni();

        //TODO dare la possibilità di prenotare e stampare la lista prenotazione (inserire la capienza massima del ristorante)


    }
}

package src;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
//Creazione Portate : Antipasto/Primo-Piatto/Secondo-Piatto/Dessert/Bevande
        Portata antipastoNormale = new AntiPasti("bruschette miste", "pomodorini al forno", "ingredienti: bruschetta, pomodoro, rosmarino", 3.50, MenuEnum.ANTIPASTI);
        Portata antipastoVegano = new AntiPasti("Insalata mista", "Insalata di stagione con olive e pomodoro", "ingredienti: insalata, olive, pomodoro", 4.50, MenuEnum.ANTIPASTI);
        Portata antipastoVegetariano = new AntiPasti("Caprese", "Mozzarella di bufala, pomodoro e basilico", "ingredienti: mozzarella di bufala, pomodoro, basilico", 6.00, MenuEnum.ANTIPASTI);

        Portata primoPiattoNormale = new PrimiPiatti("pasta al pesto", "pasta corta con basilico pestato", "ingredienti: pasta e basilico", 8.00, MenuEnum.PRIMIPIATTI);
        Portata primoPiattoVegano = new PrimiPiatti("Pasta al pesto vegano", "Pasta con pesto vegano a base di basilico e noci", "ingredienti: pasta, basilico, noci", 9.00, MenuEnum.PRIMIPIATTI);
        Portata primoPiattoVegetariano = new PrimiPiatti("Risotto ai funghi", "Risotto con funghi porcini e parmigiano", "ingredienti: riso, funghi porcini, parmigiano", 10.50, MenuEnum.PRIMIPIATTI);

        Portata secondoPiattoNormale = new SecondiPiatti("tagliata", "manzo cotto al sangue e tagliato finemente", "ingredienti: manzo", 15.00, MenuEnum.SECONDIPIATTI);
        Portata secondoPiattoVegano = new SecondiPiatti("Burger vegano", "Burger a base di lenticchie e quinoa", "ingredienti: lenticchie, quinoa", 8.00, MenuEnum.SECONDIPIATTI);
        Portata secondoPiattoVegetariano = new SecondiPiatti("Melanzane alla parmigiana", "Melanzane grigliate con salsa di pomodoro e formaggio", "ingredienti: melanzane, pomodoro, formaggio", 12.00, MenuEnum.SECONDIPIATTI);

        Portata dessertNormale = new Dessert("creme caramel", "crema ricoperta di caramello", "ingredienti: latte, uova, zucchero, caramello", 4.00, MenuEnum.DESSERT);
        Portata dessertVegano = new Dessert("Torta al cioccolato vegana", "Torta senza uova e latte, solo cioccolato", "ingredienti: cioccolato, farina, zucchero", 5.00, MenuEnum.DESSERT);
        Portata dessertVegetariano = new Dessert("Tiramisù", "Dolce al cucchiaio con savoiardi e crema di mascarpone", "ingredienti: savoiardi, mascarpone", 7.00, MenuEnum.DESSERT);


        Portata bevande1 = new Bevande("acqua", 1.00, MenuEnum.BEVANDE, "bevanda dissetante che può essere naturale o frizzante");
        Portata bevande2 = new Bevande("vino rosso", 4.00, MenuEnum.BEVANDE, "vino ricavato da uve ");
        Portata bevande3 = new Bevande("Coca Cola", 2.00, MenuEnum.BEVANDE, "bibita zuccherata accompagnata da una fetta di limone e ghiaccio");

        //todo eliminare stampaportata

        // Creazione del menu
        Menu menuNormale = new Menu("Menu Normale", "VEGAN", "CuocoMarc", TipologiaEnum.NORMALE, 30.00);
        Menu menuVegetariano = new Menu("Menu Veg", "VEGETARIANO", "CuocoVeg", TipologiaEnum.VEGETARIANO, 40.00);
        Menu menuVegan = new Menu("Menu Vegan", "NORMALE", "CuocoVegan", TipologiaEnum.VEGAN, 45.00);

        //Aggiunta di portate ai menu : Antipasto/Primo-Piatto/Secondo-Piatto/Dessert/Bevande
        //aggiunto menu Vegan/menu Vegetariano per il debug
        menuNormale.aggiungiPortata(antipastoNormale, MenuEnum.ANTIPASTI);
        menuVegan.aggiungiPortata(antipastoVegano, MenuEnum.ANTIPASTI);
        menuVegetariano.aggiungiPortata(antipastoVegetariano, MenuEnum.ANTIPASTI);

        menuNormale.aggiungiPortata(primoPiattoNormale, MenuEnum.PRIMIPIATTI);
        menuVegan.aggiungiPortata(primoPiattoVegano, MenuEnum.PRIMIPIATTI);
        menuVegetariano.aggiungiPortata(primoPiattoVegetariano, MenuEnum.PRIMIPIATTI);

        menuNormale.aggiungiPortata(secondoPiattoNormale, MenuEnum.SECONDIPIATTI);
        menuVegan.aggiungiPortata(secondoPiattoVegano, MenuEnum.SECONDIPIATTI);
        menuVegetariano.aggiungiPortata(secondoPiattoVegetariano, MenuEnum.SECONDIPIATTI);

        menuNormale.aggiungiPortata(dessertNormale, MenuEnum.DESSERT);
        menuVegan.aggiungiPortata(dessertVegano, MenuEnum.DESSERT);
        menuVegetariano.aggiungiPortata(dessertVegetariano, MenuEnum.DESSERT);

        menuNormale.aggiungiPortata(bevande1, MenuEnum.BEVANDE);
        menuVegan.aggiungiPortata(bevande2, MenuEnum.BEVANDE);
        menuVegetariano.aggiungiPortata(bevande3, MenuEnum.BEVANDE);

        //STAMPA DEL MENU'
        menuNormale.stampaMenu();

        //TODO si crea un ristorante
        //si crea un menù e s'inserisce
        //si creano le portate e s'inseriscono

        // Creazione del ristorante
        Ristorante ristorante = new Ristorante("Ristorante al taglio", 45);
        ristorante.aggiungiMenu(menuNormale);
        ristorante.aggiungiMenu(menuVegetariano);
        ristorante.aggiungiMenu(menuVegan);

        //TODO tutte le operazione si faranno dalla classe ristorante che è il contenitore di tutti i field

        // Creazione dei clienti
        Cliente cliente1 = new Cliente("Mario", "Ostuni", TipologiaEnum.VEGAN, AllergieEnum.GLUTINE, menuVegan);
        ristorante.aggiungiPrenotazione(6,"lunedì 1 ottobre", cliente1);

        Cliente cliente2 = new Cliente("Federico", "Gonzales", TipologiaEnum.VEGETARIANO, AllergieEnum.NESSUNAALLERGIA, menuVegetariano);
        ristorante.aggiungiPrenotazione(4,"lunedì 3 ottobre", cliente2);

        //TODO si devono usare i metodi
        //riscrivo le prenotazione per essere calcolato del methodo "calcolaSpesa"
//        cliente1.getPrenotazioni().put("lunedì 2 ottobre", antipastoVegano);
//        cliente2.getPrenotazioni().put("lunedì 3 ottobre", primoPiattoVegano);

        //TODO cliente con la sua preferenza
        //TODO bug menu vuoto

        //Stampa il menu che vuole il cliente
        ristorante.visualizzaMenuAndOrdina(cliente1);
        // Debug ora dovrebbe stampare i menu che il cliente vuole xke ora ce qualcosa dentro "Menu Vegan/Menu Vegetariano"

        //Stampa le prenotazioni
        ristorante.stampaPrenotazioni();

        //Verifica la capienza massima, prenotazione e aggiunge 10 punti per ogni prenotazione
        ristorante.aggiungiPrenotazione(7, "13 ottobre 2024", cliente2);
        ristorante.aggiungiPrenotazione(7, "12 ottobre 2024", cliente1);


        //Stampa le prenotazioni dopo l'aggiunta
        ristorante.stampaPrenotazioni();
        //stampa il calcolo totale della spesa del cliente 1
        ristorante.pagaConto(cliente1);
        //stampa il calcolo totale della spesa del cliente 2
        ristorante.pagaConto(cliente2);

        //TODO dare la possibilità di prenotare e stampare la lista prenotazione (inserire la capienza massima del ristorante)


        cliente1.scegliMenu(TipologiaEnum.VEGAN, ristorante.getMenuSet());
        System.out.println("Costo menu scelto: "+cliente1.costoMenuScelto());
    }
}

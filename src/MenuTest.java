package src;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MenuTest {



    Menu testing = new Menu("Menu di prova", "Tipo di prova", "Cuoco di prova", TipologiaEnum.NORMALE);

    @Test
    void aggiungiPortata() {

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


        testing.aggiungiPortata(antipastoNormale, MenuEnum.ANTIPASTI);
        testing.aggiungiPortata(antipastoVegano, MenuEnum.ANTIPASTI);
        testing.aggiungiPortata(antipastoVegano, MenuEnum.ANTIPASTI);
        testing.aggiungiPortata(antipastoVegetariano, MenuEnum.ANTIPASTI);
        testing.aggiungiPortata(primoPiattoNormale, MenuEnum.PRIMIPIATTI);
        testing.aggiungiPortata(primoPiattoVegano, MenuEnum.PRIMIPIATTI);
        testing.aggiungiPortata(primoPiattoVegetariano, MenuEnum.PRIMIPIATTI);
        testing.aggiungiPortata(secondoPiattoNormale, MenuEnum.SECONDIPIATTI);
        testing.aggiungiPortata(secondoPiattoVegano, MenuEnum.SECONDIPIATTI);
        testing.aggiungiPortata(secondoPiattoVegetariano, MenuEnum.SECONDIPIATTI);
        testing.aggiungiPortata(dessertNormale, MenuEnum.DESSERT);
        testing.aggiungiPortata(dessertVegano, MenuEnum.DESSERT);
        testing.aggiungiPortata(dessertVegetariano, MenuEnum.DESSERT);
        testing.aggiungiPortata(bevande1, MenuEnum.BEVANDE);
        testing.aggiungiPortata(bevande2, MenuEnum.BEVANDE);
        testing.aggiungiPortata(bevande3, MenuEnum.BEVANDE);

        assertTrue(testing.getPortate().contains(antipastoNormale));
        assertTrue(testing.getPortate().contains(antipastoVegano));
        assertTrue(testing.getPortate().contains(antipastoVegetariano));
        assertTrue(testing.getPortate().contains(primoPiattoNormale));
        assertTrue(testing.getPortate().contains(primoPiattoVegano));
        assertTrue(testing.getPortate().contains(primoPiattoVegetariano));
        assertTrue(testing.getPortate().contains(secondoPiattoNormale));
        assertTrue(testing.getPortate().contains(secondoPiattoVegano));
        assertTrue(testing.getPortate().contains(secondoPiattoVegetariano));
        assertTrue(testing.getPortate().contains(dessertNormale));
        assertTrue(testing.getPortate().contains(dessertVegano));
        assertTrue(testing.getPortate().contains(dessertVegetariano));
        assertTrue(testing.getPortate().contains(bevande1));
        assertTrue(testing.getPortate().contains(bevande2));
        assertTrue(testing.getPortate().contains(bevande3));
    }


}
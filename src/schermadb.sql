//TODO per uil db dobbiamo fare un file schermadb.sql dove ognugno di voi inserirà le proprie tabelle, quelle comuni le fate insieme (menu, risto) il resto ve le dividete
//TODO dobbiamo usare lucid app per fare il diagramma ER(entità releazione).
CREATE TABLE SECONDIPIATTI(
 ID_SECONDIPIATTI INT PRIMARY KEY,
 ID_PORTATA INT,
 descrizione VARCHAR(255)
);
CREATE TABLE DESSERT(
ID_DESSERT INT PRIMARY KEY,
ID_PORTATA INT,
descrizione VARCHAR(255)
);
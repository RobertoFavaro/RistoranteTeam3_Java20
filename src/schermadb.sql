//TODO per uil db dobbiamo fare un file schermadb.sql dove ognugno di voi inserirà le proprie tabelle, quelle comuni le fate insieme (menu, risto) il resto ve le dividete
//TODO dobbiamo usare lucid app per fare il diagramma ER(entità releazione).



CREATE TABLE Bevande (
    ID_Bevande INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR(255)
);
ALTER TABLE Bevande ADD FOREIGN KEY (ID_Ristorante) REFERENCES Ristorante(ID_Ristorante);

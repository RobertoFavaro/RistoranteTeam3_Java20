//TODO per uil db dobbiamo fare un file schermadb.sql dove ognugno di voi inserirà le proprie tabelle, quelle comuni le fate insieme (menu, risto) il resto ve le dividete
//TODO dobbiamo usare lucid app per fare il diagramma ER(entità releazione).
CREATE TABLE SecondiPiatti(
    ID_SecondiPiatti INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR(255)
);
CREATE TABLE Bevande (
    ID_Bevande INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR(255)
);
ALTER TABLE Bevande ADD FOREIGN KEY (ID_Ristorante) REFERENCES Ristorante(ID_Ristorante);

CREATE TABLE Antipasti (
    ID_Antipasti INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR
);
CREATE TABLE Dessert(
    ID_Dessert INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR(255)
);

ALTER TABLE Dessert ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);


CREATE TABLE PrimiPiatti (
    ID_PrimiPiatti INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR (255)
);

ALTER TABLE PrimiPiatti ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);

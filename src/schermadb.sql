//TODO per uil db dobbiamo fare un file schermadb.sql dove ognugno di voi inserirà le proprie tabelle, quelle comuni le fate insieme (menu, risto) il resto ve le dividete
//TODO dobbiamo usare lucid app per fare il diagramma ER(entità releazione).

CREATE TABLE Ristorante(
    ID_Ristorante INT PRIMARY KEY,
    NomeRistorante VARCHAR(255),
    CopertiRistorante INT,
    PostiOccupati INT
);
CREATE TABLE Portata (
    ID_Portata INT PRIMARY KEY,
    ID_Ristorante INT,
);
ALTER TABLE Portata ADD FOREIGN KEY (ID_Ristorante) REFERENCES Ristorante(ID_Ristorante);


CREATE TABLE SecondiPiatti(
 ID_SecondiPiatti INT PRIMARY KEY,
 ID_Portata INT,
 descrizione VARCHAR(255)
);
ALTER TABLE SecondiPiatti ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);


CREATE TABLE Bevande (
    ID_Bevande INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR(255)
);
ALTER TABLE Bevande ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);


CREATE TABLE Antipasti (
    ID_Antipasti INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR
);
ALTER TABLE Antipasti ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);


CREATE TABLE Dessert(
ID_Dessert INT PRIMARY KEY,
ID_Portata INT,
descrizione VARCHAR(255)
);
ALTER TABLE Dessert ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);

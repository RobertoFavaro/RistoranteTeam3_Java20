//TODO per uil db dobbiamo fare un file schermadb.sql dove ognugno di voi inserirà le proprie tabelle, quelle comuni le fate insieme (menu, risto) il resto ve le dividete
//TODO dobbiamo usare lucid app per fare il diagramma ER(entità releazione).
CREATE TABLE Ristorante(
    ID_Ristorante INT PRIMARY KEY,
    NomeRistorante VARCHAR(255),
    CopertiRistorante INT,
    PostiOccupati INT
);

CREATE TABLE Cliente(
    ID_Cliente INT PRIMARY KEY,
    ID_Ristorante INT,
    nome VARCHAR(255),
    cognome VARCHAR(255),
    punteggioCliente INT
);
ALTER TABLE Cliente ADD FOREIGN KEY (ID_Ristorante) REFERENCES Ristorante(ID_Ristorante);

CREATE TABLE Menu(
    ID_Menu INT PRIMARY KEY,
    ID_Ristorante INT,
    ID_Portata INT,
    nomeMenu VARCHAR(255),
    tipoMenu VARCHAR(255),
    nomeCuoco VARCHAR(255)
);
ALTER TABLE Menu ADD FOREIGN KEY (ID_Ristorante) REFERENCES Ristorante(ID_Ristorante);
ALTER TABLE Menu ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);


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


CREATE TABLE PrimiPiatti (
    ID_PrimiPiatti INT PRIMARY KEY,
    ID_Portata INT,
    descrizione VARCHAR (255)
);
ALTER TABLE PrimiPiatti ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);

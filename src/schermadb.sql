//TODO per uil db dobbiamo fare un file schermadb.sql dove ognugno di voi inserirà le proprie tabelle, quelle comuni le fate insieme (menu, risto) il resto ve le dividete
//TODO dobbiamo usare lucid app per fare il diagramma ER(entità releazione).
CREATE TABLE Ristorante(
    ID_Ristorante INT PRIMARY KEY,
    NomeRistorante VARCHAR(255),
    CopertiRistorante INT
);
INSERT INTO Ristorante (ID_Ristorante, NomeRistorante, CopertiRistorante) VALUES
(1, "Cracco mi fa un baffo", 150);


CREATE TABLE Cliente(
    ID_Cliente INT PRIMARY KEY AUTO_INCREMENT,
    ID_Ristorante INT,
    nome VARCHAR(255),
    cognome VARCHAR(255),
    punteggioCliente INT
);
ALTER TABLE Cliente ADD FOREIGN KEY (ID_Ristorante) REFERENCES Ristorante(ID_Ristorante);
INSERT INTO Cliente (ID_Ristorante, nome, cognome, punteggioCliente) VALUES
(1, "Mario", "Ostuni", 0),
(1,"Federico", "Gonzales", 0);


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
INSERT INTO Menu (ID_Menu, ID_Ristorante, ID_Portata, nomeMenu, tipoMenu, nomeCuoco) VALUES
(1,1,1,"Menu di terra", "Normale", "Gianfranco"),
(2,1,2,"Menu speciale", "Vegano"; "Marc"),
(3,1,3,"Menu specialissimo", "Vegetariano", "Louis");



CREATE TABLE Portata (
    ID_Portata INT PRIMARY KEY,
    ID_Ristorante INT,
    nome VARCHAR(255)
);
ALTER TABLE Portata ADD FOREIGN KEY (ID_Ristorante) REFERENCES Ristorante(ID_Ristorante);
INSERT INTO Portata (ID_Portata, ID_Ristorante, nome) VALUES
(1,1, "Portata normale"),
(2,1, "Portata vegana"),
(3,1, "Portata vegetariana");

CREATE TABLE SecondiPiatti(
    ID_SecondiPiatti INT PRIMARY KEY AUTO_INCREMENT,
    ID_Portata INT,
    nome VARCHAR(255),
     descrizione VARCHAR(255),
     ingredienti VARCHAR(255),
     prezzo double
);
ALTER TABLE SecondiPiatti ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);
INSERT INTO SecondiPiatti (ID_Portata, nome, descrizione, ingredienti, prezzo) VALUES
(1,"tagliata", "manzo cotto al sangue e tagliato finemente", "manzo", 15.00),
(2,"Burger vegano", "Burger a base di lenticchie e quinoa", "lenticchie, quinoa", 8.00),
(3,"Melanzane alla parmigiana", "Melanzane grigliate con salsa di pomodoro e formaggio", "melanzane, pomodoro, formaggio", 12.00);

CREATE TABLE Bevande (
    ID_Bevande INT PRIMARY KEY AUTO_INCREMENT,
    ID_Portata INT,
    nome VARCHAR(255),
    descrizione VARCHAR(255),
    prezzo double
);
ALTER TABLE Bevande ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);
INSERT INTO SecondiPiatti (ID_Portata, nome, descrizione, prezzo) VALUES
(1,"acqua", "bevanda dissetante che può essere naturale o frizzante", 1.00),
(2,"vino rosso", "vino ricavato da uve", 4.00),
(3,"Coca Cola", "bibita zuccherata accompagnata da una fetta di limone e ghiaccio", 2.00);

CREATE TABLE Antipasti (
    ID_Antipasti INT PRIMARY KEY AUTO_INCREMENT,
    ID_Portata INT,
    nome VARCHAR(255),
    descrizione VARCHAR(255),
    ingredienti VARCHAR(255),
    prezzo double
);
ALTER TABLE Antipasti ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);
INSERT INTO SecondiPiatti (ID_Portata, nome, descrizione, ingredienti, prezzo) VALUES
(1,"bruschette miste", "pomodorini al forno", "bruschetta, pomodoro, rosmarino", 3.50),
(2,"Insalata mista", "Insalata di stagione con olive e pomodoro", "insalata, olive, pomodoro", 4.50),
(3,"Caprese", "Mozzarella di bufala, pomodoro e basilico", "mozzarella di bufala, pomodoro, basilico", 6.00);

CREATE TABLE Dessert(
    ID_Dessert INT PRIMARY KEY AUTO_INCREMENT,
    ID_Portata INT,
    nome VARCHAR(255),
    descrizione VARCHAR(255),
    ingredienti VARCHAR(255),
    prezzo double
);
ALTER TABLE Dessert ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);
INSERT INTO SecondiPiatti (ID_Portata, nome, descrizione, ingredienti, prezzo) VALUES
(1,"creme caramel", "crema ricoperta di caramello", "latte, uova, zucchero, caramello", 4.00),
(2,"Torta al cioccolato vegana", "Torta senza uova e latte, solo cioccolato", "cioccolato, farina, zucchero", 5.00),
(3,"Tiramisù", "Dolce al cucchiaio con savoiardi e crema di mascarpone", "savoiardi, mascarpone", 7.00);

CREATE TABLE PrimiPiatti (
    ID_PrimiPiatti INT PRIMARY KEY AUTO_INCREMENT,
    ID_Portata INT,
    nome VARCHAR(255),
    descrizione VARCHAR(255),
    ingredienti VARCHAR(255),
    prezzo double
);
ALTER TABLE PrimiPiatti ADD FOREIGN KEY (ID_Portata) REFERENCES Portata(ID_Portata);
INSERT INTO PrimiPiatti (ID_Portata, nome, descrizione, ingredienti, prezzo) VALUES
(1,"pasta al pesto", "pasta corta con basilico pestato", "pasta e basilico",8.00),
(2,"Pasta al pesto vegano","Pasta con pesto vegano a base di basilico e noci","pasta, basilico, noci",9.00),
(3,"Risotto ai funghi","Risotto con funghi porcini e parmigiano","riso, funghi porcini, parmigiano",10.50);


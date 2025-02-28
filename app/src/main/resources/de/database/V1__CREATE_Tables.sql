CREATE TABLE Benutzer (
    id varchar(255) PRIMARY KEY,
    benutzername varchar(255),
    passwordHash varchar(255)
);

CREATE TABLE GeburtstagsPerson (
    id varchar(255) PRIMARY KEY,
    vorname varchar(255),
    nachname varchar(255),
    geburtstag DATE,
    benutzer varchar(255),
    constraint fk_benutzer FOREIGN KEY (benutzer) REFERENCES Benutzer(id)
);
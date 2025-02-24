CREATE TABLE Benutzer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    benutzername varchar(255),
    passwordHash varchar(255)
);

CREATE TABLE GeburtstagsPerson (
    id INT AUTO_INCREMENT PRIMARY KEY,
    vorname varchar(255),
    nachname varchar(255),
    geburtstag DATE,
    benutzer int,
    constraint fk_benutzer FOREIGN KEY (benutzer) REFERENCES Benutzer(id)
);
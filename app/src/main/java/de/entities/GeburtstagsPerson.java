package de.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@NamedQuery(name = "getallgp", query = "select gp from GeburtstagsPerson gp")
@Table(name = "GeburtstagsPerson")
public class GeburtstagsPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(length = 50, nullable = false, unique = false)
    private String vorname;
    
    @Column(length = 50, nullable = false, unique = false)
    private String nachname;
    
    @Column(nullable = false, unique = false)
    private LocalDate geburtstag;

    @ManyToOne
    @JoinColumn(name = "benutzer")
    private Benutzer benutzer;

    public GeburtstagsPerson(String vorname, String nachname, LocalDate geburtstag) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = geburtstag;
    }

    public GeburtstagsPerson(){}

    public GeburtstagsPerson(String vorname, String nachname, LocalDate geburtstag, Benutzer benutzer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = geburtstag;
        this.benutzer = benutzer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(LocalDate geburtstag) {
        this.geburtstag = geburtstag;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  

}

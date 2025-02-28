package de.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@NamedQuery(name = "getappbenutzer", query = "select b from Benutzer b")
@Table(name = "Benutzer")
public class Benutzer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(length = 50, nullable = false, unique = false)
    private String benutzername;

    @Column(length = 300, nullable = false, unique = false)
    private String passwordHash;

    @OneToMany(mappedBy = "benutzer")
    private Set<GeburtstagsPerson> personen;

    public Benutzer(String benutzername, String passwordHash) {
        this.benutzername = benutzername;
        this.passwordHash = passwordHash;
    }

    public Benutzer() {
    }

    public String getBenutzername() {
        return benutzername;
    }
    
    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }
    
    public String getPasswordHash() {
        return passwordHash;
    }
    
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Set<GeburtstagsPerson> getPersonen() {
        return personen;
    }

    public void setPersonen(Set<GeburtstagsPerson> personen) {
        this.personen = personen;
    }

    public void addGeburtstagsPerson(final GeburtstagsPerson person){
        this.personen.add(person);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}

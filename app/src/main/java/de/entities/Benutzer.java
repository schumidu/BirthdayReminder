package de.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Benutzer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

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
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    
}

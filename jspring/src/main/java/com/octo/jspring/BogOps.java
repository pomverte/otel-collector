package com.octo.jspring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "bogops")
public class BogOps implements Serializable {

  @Id
  @Column(nullable = false)
  private String id;

  @Column(nullable = false)
  private String nom;

  @Column(nullable = false)
  private String prenom;

  public BogOps() {
    super();
  }

  public BogOps(String id, String nom, String prenom) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
}

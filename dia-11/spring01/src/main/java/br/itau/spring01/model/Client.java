package br.itau.spring01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Client {

  @Id // indica que esse campo sera PK
  @GeneratedValue(strategy = GenerationType.IDENTITY) // INNDOCA QUE
  private long cod;

  @Column(name = "nome", length = 200, nullable = false)
  // lenght tam max em carac, nullable false esse campo é obrigatorio
  private String name;

  @Column(name = "email", length = 100, nullable = false, unique = true)
  private String email;

  public long getCod() {
    return cod;
  }

  public void setCod(long cod) {
    this.cod = cod;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}

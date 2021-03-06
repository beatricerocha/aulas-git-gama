package br.itau.spring01.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "veiculo")
public class Vehicle {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long cod;

  // @collunm diz que nome diferente da tabela
  @Column(name = "modelo", length = 100, nullable = false)
  private String model;

  @Column(name = "ano_de_fabricacao")

  private int yearManufacture;
  @JsonIgnoreProperties("cod_cliente")
  @ManyToOne
  @JoinColumn(name = "cod_cliente")
  private Client owner;

  public long getCod() {
    return cod;
  }

  public void setCod(long cod) {
    this.cod = cod;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYearManufacture() {
    return yearManufacture;
  }

  public void setYearManufacture(int yearManufacture) {
    this.yearManufacture = yearManufacture;
  }

  public Client getOwner() {
    return owner;
  }

  public void setOwner(Client owner) {
    this.owner = owner;
  }

}

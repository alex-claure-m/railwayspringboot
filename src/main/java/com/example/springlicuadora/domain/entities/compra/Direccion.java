package com.example.springlicuadora.domain.entities.compra;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "direccion")
public class Direccion extends PersistenceId {

  private String calle;
  private int altura;
  private String localidad;

  public Direccion() {
  }
}

package com.example.springlicuadora.domain.entities.compra;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comprador")
@Getter
@Setter
public class Comprador extends PersistenceId {
  private String nombre;
  private String apellido;
  private String dni;
  @OneToOne
  @JoinColumn(name = "direccion_id", referencedColumnName = "id")
  private Direccion direccion;

  public Comprador() {
  }
}

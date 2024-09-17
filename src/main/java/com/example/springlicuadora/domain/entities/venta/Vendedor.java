package com.example.springlicuadora.domain.entities.venta;

import com.example.springlicuadora.domain.entities.PersistenceId;
import com.example.springlicuadora.domain.entities.compra.MedioDePago;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "vendedor")
public class Vendedor extends PersistenceId {

  private String nombre;
  private String apellido;

  @ElementCollection(targetClass = MedioDePago.class)
  @Enumerated(EnumType.STRING)
  private List<MedioDePago> unMedio;

  public Vendedor() {
  }
}

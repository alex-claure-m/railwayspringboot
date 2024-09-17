package com.example.springlicuadora.domain.entities.compra;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "carrito")
public class Carrito extends PersistenceId {

  @OneToOne
  @JoinColumn(name = "comprador_id", referencedColumnName = "id")
  private Comprador comprador;

  @OneToMany
  @JoinColumn(name = "item_id", referencedColumnName = "id")
  //por que items? -> por que puedo comprar cantidades de productos
  // y en vez de que el calculo sea por aca, o que este en productos en si, mejor clase intermedia
  private List<Item> items;

  private double precioFinal;

  public Carrito() {
  }
}

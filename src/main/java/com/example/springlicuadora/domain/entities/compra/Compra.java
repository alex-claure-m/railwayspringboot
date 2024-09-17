package com.example.springlicuadora.domain.entities.compra;


import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "compra")
@Getter
@Setter
public class Compra extends PersistenceId {

  private LocalDate fechaCompra;

  //para mi tiene sentido que la compra conozca al carritoDeCompra , estara asociado a la compra se hace
  @OneToOne
  @JoinColumn(name = "carrito_id", referencedColumnName = "id")
  private Carrito carritoDeCompra;

  @Enumerated
  private EstadoCompra estadoCompra;

  //ver como hacer los medios de pago y si vinculo con vendedor!
  @ElementCollection(targetClass = MedioDePago.class)
  @Enumerated(EnumType.STRING)
  private List<MedioDePago> medioDePago;

  public Compra() {
  }
}

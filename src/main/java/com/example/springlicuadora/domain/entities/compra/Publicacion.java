package com.example.springlicuadora.domain.entities.compra;


import com.example.springlicuadora.domain.entities.PersistenceId;
import com.example.springlicuadora.domain.entities.producto.ProductoPersonalizado;
import com.example.springlicuadora.domain.entities.venta.Vendedor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@Table(name = "publicacion")
public class Publicacion extends PersistenceId {

  @OneToOne
  @JoinColumn(name = "vendedor_id", referencedColumnName = "id")
  private Vendedor vendedor;

  @Enumerated
  private EstadoPublicacion estadoPublicacion;

  @OneToOne
  @JoinColumn(name = "producto_id", referencedColumnName = "id")
  private ProductoPersonalizado productos;

  private LocalTime horaAlta;
  private LocalTime horaBaja;
  private LocalDate fechaSubida;
  private LocalDate fechaBaja;

  public Publicacion() {

  }
}

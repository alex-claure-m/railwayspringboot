package com.example.springlicuadora.domain.entities.producto;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
//el producto personalizado en si, es el producto base aplicado la personalizacion

@Getter
@Setter
@Entity
@Table(name = "producto_personalizado")
public class ProductoPersonalizado extends PersistenceId {

  @OneToOne
  @JoinColumn(name = "producto_base_id", referencedColumnName = "id")
  private ProductoBase producto;

  private String nombrePersonalizado;

  private int precioFinal;

  //un productoPersonalizado puede estar compuesto por varias Personalizaciones
  // cada personalizacion en realidad contiene unArea de Personalizacion , precio y el contenido

  // -- del otro lado (Personalizacion, no iria un orm, no necesita conocer el area
  // a que productoPersonalizado sera de utilidad
  // unidireccional
  @OneToMany(cascade = CascadeType.PERSIST)
  // este join column hacia que me cree una tabla union con algo que no tiene relacion!
  //@JoinColumn(name = "personalizacion_id", referencedColumnName = "id")
  private Set<Personalizacion> personalizaciones;

  public ProductoPersonalizado() {
  }
}

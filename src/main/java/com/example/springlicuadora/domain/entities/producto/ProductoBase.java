package com.example.springlicuadora.domain.entities.producto;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "producto_base")
public class ProductoBase extends PersistenceId {

  private String nombre;
  private String descripcion;
  private int precioBase;
  private LocalDate tiempoFabricacion;
  private Boolean esPersonalizable;

  //un producto va a tener areas que seran para la personalizacion, ok?
  // entonces creo un atributo tipo lista de las areas que se pueden personalizar
  @OneToMany
  @JoinColumn(name = "area_personalizacion_id", referencedColumnName = "id")
  private List<AreaPersonalizacion> areaPersonalizable;

  public ProductoBase() {
  }

  public ProductoBase(String nombre, String descripcion, int precioBase, LocalDate tiempoFabricacion,Boolean esPersonalizable) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precioBase = precioBase;
    this.tiempoFabricacion = tiempoFabricacion;
    this.esPersonalizable = esPersonalizable;
  }
  //no solo esto, ya que ademas debo crear SU DTO, sino , tendria que instanciar todo objeto de nuevo
  // asi que hago su constructor

}

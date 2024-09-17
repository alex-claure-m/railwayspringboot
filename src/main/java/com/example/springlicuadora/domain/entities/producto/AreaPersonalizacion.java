package com.example.springlicuadora.domain.entities.producto;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//claro, mi posible Personalizacion en realidad es la zona y area donde se personalizara
@Getter
@Setter
@Entity(name = "area_personalizacion")
public class AreaPersonalizacion extends PersistenceId {

  @Enumerated(EnumType.STRING)
  @Column(name = "area")
  private Zona area;

  @OneToMany
  @JoinColumn(name = "tipo_id", referencedColumnName = "id")
  private List<TipoPersonalizacion> tipoPersonalizacion;

  public AreaPersonalizacion() {

  }
}

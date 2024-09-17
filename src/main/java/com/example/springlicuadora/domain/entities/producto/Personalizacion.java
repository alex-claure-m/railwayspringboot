package com.example.springlicuadora.domain.entities.producto;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "personalizacion")
public class Personalizacion extends PersistenceId {

  @OneToMany
  @JoinColumn(name = "area_personalizacion_id", referencedColumnName = "id")
  private List<AreaPersonalizacion> areasPersonalizables;

  private String contenido;

  private int precioPersonalizacion;

  public Personalizacion() {

  }
}

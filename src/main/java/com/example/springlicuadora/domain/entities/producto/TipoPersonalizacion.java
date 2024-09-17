package com.example.springlicuadora.domain.entities.producto;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TipoPersonalizacion extends PersistenceId {

  private String nombre;
  private String descripcion;

  public TipoPersonalizacion() {
  }
}

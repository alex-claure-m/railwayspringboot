package com.example.springlicuadora.domain.entities.compra;

import com.example.springlicuadora.domain.entities.PersistenceId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter
@Setter
public class Item extends PersistenceId {

  private int cantidad;

  @OneToOne
  @JoinColumn(name = "publicacion_id", referencedColumnName = "id")
  // y los items de donde sale? bueno, de la publicacion en si
  // ya que el enuncioado habla de que el vendedor podra pausar o cancelar las publcaciones
  // de que? -> de los productos que se estan vendiendo por la plataforma
  private Publicacion publicacion;

  private int precioFinal;

  public Item() {
  }
}

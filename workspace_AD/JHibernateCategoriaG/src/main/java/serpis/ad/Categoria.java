package serpis.ad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table( name = "Categoria" )

public class Categoria {

	private String nombre;
    private Long id;
	
    private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private Long getId() {
		return id;
	}
	private void setId(Long id) {
		this.id = id;
	}

	
}
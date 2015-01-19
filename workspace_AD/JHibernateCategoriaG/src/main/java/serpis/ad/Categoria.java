package serpis.ad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


//@Table( name = "Categoria" )
@Entity
public class Categoria {
	
	@Id
	@GeneratedValue (generator="increment")

	private String nombre;
    private Long id;
	
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public  Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
}
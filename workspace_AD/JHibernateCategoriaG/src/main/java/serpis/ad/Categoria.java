package serpis.ad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


//@Table( name = "Categoria" )
@Entity
public class Categoria {
	
	
	private String nombre;
    private Long id;
	
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Id
	@GeneratedValue (generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public  Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
}
package serpis.ad;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class HibernateCategoria {
	
	private static 	EntityManagerFactory entityManagerFactory;
	
	public static void main (String [] args){
		
		entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.jpa.mysql");
		
		showCategorias();
		System.out.println("Añado categorias");
		persistNuevasCategorias();
		showCategorias();
		
		System.out.println("Elimino categorias con id = ?");
		deleteCategoriasbyID();
		
		showCategorias();
		
		entityManagerFactory.close();
		
	}
	
	public static void persistNuevasCategorias(){
		
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Categoria categoria = new Categoria ();
		categoria.setNombre("Hibernate " + new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format (new Date()));
		
		entitymanager.persist(categoria);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
	}
	
	public static void showCategorias(){

		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		
		entitymanager.getTransaction().begin();
		
		List<Categoria> categorias = entitymanager.createQuery("from Categoria", Categoria.class).getResultList();
		for (Categoria categoria : categorias)
			System.out.printf("id=%d nombre=%s\n", categoria.getId(), categoria.getNombre());
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
	}
	
	public static void deleteCategoriasbyID(){
		
		EntityManager entitymanager = entityManagerFactory.createEntityManager();
		
		 Categoria categoria = entitymanager.find(Categoria.class, 1);
		 
		 entitymanager.getTransaction().begin();
		 entitymanager.remove(categoria);
		 entitymanager.getTransaction().commit();
		 entitymanager.close();
	}
	
}

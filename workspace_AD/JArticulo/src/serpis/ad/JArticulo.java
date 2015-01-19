package serpis.ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/*
 * 0-Salir
 * 1-Nuevo
 * 2-Editar
 * 3-Eliminar
 * 4-Visualizar
 * 
 */

public class JArticulo {

	private static Scanner scanner= new Scanner(System.in);
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("/////Menu Principal/////\n");
		System.out.println("Seleccione una opción");
		System.out.println("0- Salir");
		System.out.println("1- Nuevo");
		System.out.println("2- Editar");
		System.out.println("3- Eliminar");
		System.out.println("4- Visualizar");
		
		
		int opcion = scanner.nextInt();
		do {
			switch (opcion){
			    case 0:
			      
			        break;
			    case 1:
			    	Nuevo();
			        break;
			    case 2:

			       
			        break;
			    case 3:
			    	break;
			    
			    
			    case 4:
			    	break;	
	
			}
		}
		
		while (opcion !=5);
  
	}//MAIN
	
	
	
	public void Salir(){}
	
	public static void Nuevo () throws ClassNotFoundException, SQLException{
		
		Statement statement;
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/dbprueba?" +
				"user=root&password=sistemas");
		
		System.out.println ("Introduzca un nombre nuevo");
			String nombre= scanner.nextLine();
		System.out.println ("Introduzca una categoria nueva");
			String categoria= scanner.nextLine();
		System.out.println ("Introduzca una categoria nueva");
			Float precio= scanner.nextFloat();
		
		String sql="INSERT INTO articulo (nombre, categoria, precio) VALUES ('"+nombre+"','"+categoria+"','"+precio+"')";
		
		try {
			
			statement=connection.createStatement();
			statement.executeQuery(sql);
			
			statement.close();
			connection.close();
			
			System.out.println ("Inserción Realizada");
			
		} catch (SQLException e){
			e.printStackTrace();	
		  }
		
	}
	
	
}

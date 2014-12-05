package serpis.ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySql {
		
		private static Scanner scanner= new Scanner(System.in);
		
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.jdbc.Driver"); necesario para driver tipo 3 o anterior
		System.out.println("Hola MySql desde eclipse");
		
		System.out.println("Dime tu nombre");
		String nombre = scanner.nextLine();
		System.out.println("Hola "+ nombre);
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/dbprueba?" +
				"user=root&password=sistemas");
		//Statement statement = connection.createStatement();
		//ResultSet resultSet = statement.executeQuery("select * from categoria");
		
		PreparedStatement preparedStatment = connection.prepareStatement("select * from categoria where id= ?");
		
		//preparedStatment.setObject(1, "%vo%");
		preparedStatment.setLong(1, 2);
		ResultSet resultSet=preparedStatment.executeQuery();
		
		
		while (resultSet.next()) {
			System.out.printf("id=%2s nombre=%2s\n", resultSet.getObject("id"), resultSet.getObject("nombre"));
		}
		
		resultSet.close();
		//statement.close();
		preparedStatment.close();
		connection.close();

	}

	
			
	
	
	
}

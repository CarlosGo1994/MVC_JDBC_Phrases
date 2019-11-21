package com.barbaro.fmmvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	
	private static final String URL_FORMAT ="jdbc:%s://%s:%s/%s?useUnicode=true"+

			
			"&useJDBCCompliantTimezoneShift=true"+
			"&useLegacyDatetimeCode=false"+
			"&serverTimezone=UTC";
	public static Connection getConnection() {
		
		String dbms = "mysql";
		String host = "localhost";
		String port ="3306";
		String databaseName = "frases_matonas";
		String user = "root";
		String password = "admin";
		String url = String.format(URL_FORMAT, dbms,host,port,databaseName);
		
		//0:Driver
		//1:Encargado de conectar con la base de datos
		Connection connection = null;
		
		try {
			//creando instancia del diver en memoria
			//Para poder ser accedida
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Obtener la conexion de la base de datos
			connection = DriverManager.getConnection(url, user, password);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void closeConnection(Connection conn) 
	{
		try
		{
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

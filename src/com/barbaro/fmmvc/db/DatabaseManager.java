package com.barbaro.fmmvc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import java.util.Date;

import com.barbaro.fmmvc.model.Frase;
import com.barbaro.fmmvc.model.Persona;

public class DatabaseManager
{
	
	private Connection conn;
	
	public DatabaseManager(Connection conn) 
	{
		this.conn = conn;
	}
	
	public void crearPersona(Persona persona) 
	{
		String query = "insert into persona(nombre, edad, carrera) "
				+ "values("+ persona.toString()+")";
		Statement stmn = null;
		
		try {
			stmn = conn.createStatement();
			stmn.executeUpdate(query);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void crearFrase(Frase frase) 
	{
		String query= "insert into frase(contenido, cantidad, fechaDesde"+ "values(?,?,?)";
		PreparedStatement stmn = null;
		try 
		{
			stmn = conn.prepareStatement(query);
			stmn.setString(1, frase.getContenido());
			stmn.setInt(2, frase.getCantidad());
			stmn.setDate(3, frase.getFechaDesde());
			
			stmn.executeUpdate();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void crearFrasePersona(int idPersona, int idFrase)
	{
		
	}
	
	public List<Persona> consultarPersonas()
	{
		String query = "select * from persona";
		Statement stmnt = null;
		ResultSet rs = null;
		List<Persona> listPersonas = null;
		
		try
		{
			stmnt = conn.createStatement();
			rs= stmnt.executeQuery(query);
			listPersonas = new ArrayList<>();
			while(rs.next()) 
			{
				Persona persona = new Persona();
				persona.setIdPersona(rs.getInt("idPersona"));
				persona.setNombre(rs.getString("nombre"));
				persona.setEdad(rs.getByte("edad"));
				persona.setCarrera(rs.getString("carrera"));
				persona.setFecha(rs.getDate("fecha"));
				
				//Agregando modelo a la lista
				listPersonas.add(persona);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return listPersonas;
	}
	
	public List<Frase> consultarFrases()
	{
		
		String query = "select * from frase";
		Statement stmnt = null;
		ResultSet rs = null;
		List<Frase> listFrases = null;
		
		try
		{
			stmnt = conn.createStatement();
			rs= stmnt.executeQuery(query);
			listFrases = new ArrayList<>();
			while(rs.next()) 
			{
				Frase frase = new Frase();
				frase.setIdFrase(rs.getInt("idFrase"));
				frase.setContenido(rs.getString("contenido"));
				frase.setCantidad(rs.getInt("cantidad"));
				frase.setFechaDesde(rs.getDate("fechaDesde"));
				frase.setFecha(rs.getDate("fecha"));
				
				//Agregando modelo a la lista
				listFrases.add(frase);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Frase> consultarFrasesPersona(int idPersona)
	{
		return null;
	}
	
}

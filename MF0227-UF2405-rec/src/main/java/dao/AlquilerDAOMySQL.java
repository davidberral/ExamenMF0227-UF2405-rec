package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Alquiler;
import utilidades.ConexionBD;

public class AlquilerDAOMySQL implements AlquilerDAO {
	
	private ConexionBD conexion;
	private Statement consulta = null;
	private PreparedStatement consultaPreparada = null;
	private ResultSet resultado = null;
	
	public AlquilerDAOMySQL() {
		conexion = new ConexionBD();
	}

	

	@Override
	public Alquiler getAlquiler(String matricula) {
		Connection con = conexion.getConexion();
		Alquiler a = null;
		
		try {
			consultaPreparada = con.prepareStatement("select * from alquileres"
					+ " where matricula = ?");
			consultaPreparada.setString(1, matricula);
			resultado=consultaPreparada.executeQuery();
			
			// Bucle para recorrer todas las filas que devuelve la consulta
			if (resultado.next()) {
				boolean alquiler= resultado.getBoolean("alquiler");
				String tipo = resultado.getString("tipo");
				boolean maletero= resultado.getBoolean("maletero");
				double precioDia = resultado.getInt("precio");
				int numDias = resultado.getInt("num_dias");
				
				a = new Alquiler(alquiler, matricula, tipo, maletero, precioDia, numDias);
			}
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta sobre un alquiler: "
		         +e.getMessage());
		} finally {
			try {
				resultado.close();
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return a;
	}

	@Override
	public int insertarAlquiler(Alquiler a) {
		Connection con = conexion.getConexion();
		int resultado=0;
		
		try {
			consultaPreparada = con.prepareStatement("INSERT INTO alquileres\r\n"
					+ "VALUES\r\n"
					+ "(?,?,?,?,?,?)");
			
			consultaPreparada.setBoolean(1, a.isAlquiler());
			consultaPreparada.setString(2, a.getMatricula());
			consultaPreparada.setString(3, a.getTipoVehiculo());
			consultaPreparada.setBoolean(4, a.isMaletero());
			consultaPreparada.setDouble(5, a.getPrecioDia());
			consultaPreparada.setInt(6, a.getNumDias());
			
			resultado=consultaPreparada.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error al realizar la insercion del alquiler: "
		        +e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;

	}

	@Override
	public int eliminarAlquiler(String matricula) {
		Connection con = conexion.getConexion();
		int resultado=0;
		
		try {
			consultaPreparada = con.prepareStatement("DELETE FROM alquileres\r\n"
					+ "WHERE dni = ?");
			
			consultaPreparada.setString(1, matricula);
			resultado=consultaPreparada.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error al realizar el borrado de un alquiler: "+e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;
	}

	@Override
	public int actualizarAlquiler(Alquiler a) {
		Connection con = conexion.getConexion();
		int resultado=0;
		
		try {
			consultaPreparada = con.prepareStatement("UPDATE alquileres\r\n"
					+ "SET alquiler=?, "
					+ "tipo=?, "
					+ "maletero=?, "
					+ "precioDia=?, "
					+ "numDias=? "
					+ "WHERE matricula=?");
			

			consultaPreparada.setBoolean(1, a.isAlquiler());
			consultaPreparada.setString(2, a.getTipoVehiculo());
			consultaPreparada.setBoolean(3, a.isMaletero());
			consultaPreparada.setDouble(4, a.getPrecioDia());
			consultaPreparada.setInt(5, a.getNumDias());
			consultaPreparada.setString(8, a.getMatricula());
			resultado=consultaPreparada.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error al realizar la actualizacion del alquiler: "
					+e.getMessage());
		} finally {
			try {
				consulta.close();
				conexion.desconectar();
			} catch (SQLException e) {
				System.out.println("Error al liberar recursos: "+e.getMessage());
			} catch (Exception e) {
				
			}
		}
		return resultado;

	}

}

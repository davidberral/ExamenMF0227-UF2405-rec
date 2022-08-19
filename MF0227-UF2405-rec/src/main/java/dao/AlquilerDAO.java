package dao;

import java.util.List;

import modelo.Alquiler;

public interface AlquilerDAO {

	List<Alquiler> getListaAlquileres();
	Alquiler getAlquiler(String matricula);
	int insertarAlquiler(Alquiler a);
	int eliminarAlquiler(String matricula);
	int actualizarAlquiler(Alquiler a);
	
}

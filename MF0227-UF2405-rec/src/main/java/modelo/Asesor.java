package modelo;

import java.util.Objects;

/** 
 * Clase que modela los datos de un asesor.
 * 
 * @author David Casas
 *
 */
public class Asesor {
	
	/**
	 * Nombre del asesor
	 */
	private String dni;
	private String nombre;
	private String apellidos;
	private String contrato;
	private boolean coche;
	private boolean hogar;
	private boolean decesos;
	private int numVentas;
	
	/**
	 * Constructor sin parámetros que crea un Asesor vacío
	 */
	public Asesor() {
		this.dni="";
		this.nombre="";
		this.apellidos="";
		this.contrato="";
		this.coche=false;
		this.hogar=false;
		this.decesos=false;
		this.numVentas=15;
	}


	/**
	 * Constructor parametrizado que crea un asesor con todos los datos pasados como parámetro.
	 * @param dni String el dni del asesor
	 * @param nombre String el nombre de pila del asesor
	 * @param apellidos String los apellidos del asesor
	 * @param contrato String el tipo de relación contractual que puede tener el asesor con la empresa, puede ser Autónomo,
	 *        Asalariado fijo o Asalariado a comision
	 * @param coche boolean que indica si el asesor puede dar de alta seguros de coche o no 
	 * @param hogar boolean que indica si el asesor puede dar de alta seguros de hogar o no 
	 * @param decesos boolean que indica si el asesor puede dar de alta seguros de decesos o no 
	 * @param numVentas int número de ventas promedio que debe cumplir el asesor al mes
	 */
	public Asesor(String dni, String nombre, String apellidos, String contrato, boolean coche, boolean hogar,
			boolean decesos, int numVentas) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrato = contrato;
		this.coche = coche;
		this.hogar = hogar;
		this.decesos = decesos;
		this.numVentas = numVentas;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	/**
	 * @return the contrato
	 */
	public String getContrato() {
		return contrato;
	}


	/**
	 * @param contrato the contrato to set
	 */
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}


	/**
	 * @return the coche
	 */
	public boolean isCoche() {
		return coche;
	}


	/**
	 * @param coche the coche to set
	 */
	public void setCoche(boolean coche) {
		this.coche = coche;
	}


	/**
	 * @return the hogar
	 */
	public boolean isHogar() {
		return hogar;
	}


	/**
	 * @param hogar the hogar to set
	 */
	public void setHogar(boolean hogar) {
		this.hogar = hogar;
	}


	/**
	 * @return the decesos
	 */
	public boolean isDecesos() {
		return decesos;
	}


	/**
	 * @param decesos the decesos to set
	 */
	public void setDecesos(boolean decesos) {
		this.decesos = decesos;
	}


	/**
	 * @return the numVentas
	 */
	public int getNumVentas() {
		return numVentas;
	}


	/**
	 * @param numVentas the numVentas to set
	 */
	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asesor other = (Asesor) obj;
		return Objects.equals(dni, other.dni);
	}


	@Override
	public String toString() {
		return "Asesor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", contrato=" + contrato
				+ ", coche=" + coche + ", hogar=" + hogar + ", decesos=" + decesos + ", numVentas=" + numVentas + "]";
	}




	
	
}

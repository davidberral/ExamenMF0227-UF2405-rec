package modelo;

import java.util.Objects;

public class Alquiler {
	
	private boolean alquiler;
	private String matricula;
	private String tipoVehiculo;
	private boolean maletero;
	private double precioDia;
	private int numDias;
	
	
	public Alquiler() {
		this.alquiler = true;
		this.matricula = "";
		this.tipoVehiculo = "Turismo";
		this.maletero = false;
		this.precioDia = 30;
		this.numDias = 1;
	}


	public Alquiler(boolean alquiler, String matricula, String tipoVehiculo, boolean maletero, double precioDia,
			int numDias) {
		this.alquiler = alquiler;
		this.matricula = matricula;
		this.tipoVehiculo = tipoVehiculo;
		this.maletero = maletero;
		this.precioDia = precioDia;
		this.numDias = numDias;
	}


	/**
	 * @return the alquiler
	 */
	public boolean isAlquiler() {
		return alquiler;
	}


	/**
	 * @param alquiler the alquiler to set
	 */
	public void setAlquiler(boolean alquiler) {
		this.alquiler = alquiler;
	}


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}


	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	/**
	 * @return the tipoVehiculo
	 */
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}


	/**
	 * @param tipoVehiculo the tipoVehiculo to set
	 */
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}


	/**
	 * @return the maletero
	 */
	public boolean isMaletero() {
		return maletero;
	}


	/**
	 * @param maletero the maletero to set
	 */
	public void setMaletero(boolean maletero) {
		this.maletero = maletero;
	}


	/**
	 * @return the precioDia
	 */
	public double getPrecioDia() {
		return precioDia;
	}


	/**
	 * @param precioDia the precioDia to set
	 */
	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}


	/**
	 * @return the numDias
	 */
	public int getNumDias() {
		return numDias;
	}


	/**
	 * @param numDias the numDias to set
	 */
	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}


	@Override
	public int hashCode() {
		return Objects.hash(alquiler, maletero, matricula, numDias, precioDia, tipoVehiculo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alquiler other = (Alquiler) obj;
		return alquiler == other.alquiler && maletero == other.maletero && Objects.equals(matricula, other.matricula)
				&& numDias == other.numDias
				&& Double.doubleToLongBits(precioDia) == Double.doubleToLongBits(other.precioDia)
				&& Objects.equals(tipoVehiculo, other.tipoVehiculo);
	}


	@Override
	public String toString() {
		return "Alquiler [alquiler=" + alquiler + ", matricula=" + matricula + ", tipoVehiculo=" + tipoVehiculo
				+ ", maletero=" + maletero + ", precioDia=" + precioDia + ", numDias=" + numDias + "]";
	}
	
	public double calcularImporte() {
		double precio=this.precioDia;
		if (!alquiler) {
			precio = precio*0.8;
		}
		return precio*this.getNumDias();
	}
	

}

package EjercicioParcialFrancoGallo;

public class TanqueCombustible {
		private int capacidadTanque;
		private double cantidadCombustibleTanque;
	public TanqueCombustible(int capacidad) {
	this.capacidadTanque = capacidad;
	this.cantidadCombustibleTanque = 0;
	}
	public  double getCantidadCombustibleTanque() {
		return cantidadCombustibleTanque;
	}
	public void setCantidadCombustibleTanque(int cantidadCombustibleTanque) {
		this.cantidadCombustibleTanque = cantidadCombustibleTanque;
	}
	public void agregarCombustible(double cantidad) {
		if ((cantidad>0) && ((cantidad + this.cantidadCombustibleTanque)<this.capacidadTanque)) {
			this.cantidadCombustibleTanque += cantidad;
		}else {
			System.out.println("Error Cantidad de combustible invalida");
		}
		}
		
	}



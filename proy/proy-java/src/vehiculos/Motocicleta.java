package vehiculos;

public class Motocicleta extends Vehiculo {
	
	private Persona acompañante;
	
	public Motocicleta(Persona chofer, double cantKm, Persona acompañante) {
		super(chofer, cantKm);
		this.setAcompañante(acompañante);
	}
	
	public Motocicleta(Persona chofer, double cantKm) {
		this(chofer, cantKm, null);
	}

	public Persona getAcompañante() {
		return this.acompañante;
	}

	public void setAcompañante(Persona acompañante) {
		this.acompañante = acompañante;
	}
	
	public void setChofer(Persona chofer) {
		if (this.getAcompañante() == null)
			super.setChofer(chofer);
	}
	
	public String toString() {
		String representacion = "-----------------------------" + "\n";
		representacion += super.toString() + "\n" + "Acompañante: ";
		representacion += (this.getAcompañante() == null)? "Sin acompañante" : this.getAcompañante().toString();
		representacion += "\n" + "-----------------------------" + "\n";
		return representacion;
	}
	
}
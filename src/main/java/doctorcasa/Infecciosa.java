package doctorcasa;

public class Infecciosa {

	private int cantCelAmenazadas;

	public void setCantDeCelAmenazadas(int cantCelAmenazadas) {
		this.cantCelAmenazadas= cantCelAmenazadas;
		
	}

	public boolean esAgresiva(Persona enfermo) {
		
		return enfermo.getCantCelulas()* 0.1 < this.cantCelAmenazadas;
	}
		
}

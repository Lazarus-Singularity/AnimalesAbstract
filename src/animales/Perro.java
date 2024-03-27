package animales;

public class Perro extends Canido {

	public Perro() {
	}

	@Override
	public String getNombre() {
		return "Canis Lupus Familiaris";
	}

	@Override
	public String getSonido() {
		return "Ladrido";
	}

	@Override
	public String getAlimentos() {
		return "Carnivoro";
	}

	@Override
	public String getHabitat() {
		return "Domestico";
	}

}

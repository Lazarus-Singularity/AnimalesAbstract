package animales;

public class Lobo extends Canido {

	public Lobo() {
	}

	@Override
	public String getNombre() {
		return "Canis Lupus";
	}

	@Override
	public String getSonido() {
		return "Aullido";
	}

	@Override
	public String getAlimentos() {
		return "Carnivoro";
	}

	@Override
	public String getHabitat() {
		return "Bosque";
	}
}

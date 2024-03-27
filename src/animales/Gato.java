package animales;

public class Gato extends Felino {

	public Gato() {
	}

	@Override
	public String getNombre() {
		return "Felis Silvestris Catus";
	}

	@Override
	public String getSonido() {
		return "Maullido";
	}

	@Override
	public String getAlimentos() {
		return "Ratones/Carnivoro";
	}

	@Override
	public String getHabitat() {
		return "Domestico";
	}
}

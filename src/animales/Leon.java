package animales;

public class Leon extends Felino {

	public Leon() {
	}

	@Override
	public String getNombre() {
		return "Panthera leo";
	}

	@Override
	public String getSonido() {
		return "Rugido";
	}

	@Override
	public String getAlimentos() {
		return "Carnivoro";
	}

	@Override
	public String getHabitat() {
		return "Pradera";
	}

}

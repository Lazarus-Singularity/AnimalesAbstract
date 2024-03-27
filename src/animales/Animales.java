package animales;

import java.util.ArrayList;

public class Animales {

	public static void main(String[] args) {

		ArrayList<Animal> Animales = new ArrayList<>();

		Animales.add(new Perro());
		Animales.add(new Lobo());
		Animales.add(new Leon());
		Animales.add(new Gato());

		for (int i = 0; i < Animales.size(); i++) {
			System.out.println(Animales.get(i).getNombre());
		}

		for (int i = 0; i < Animales.size(); i++) {
			System.out.println(Animales.get(i).getSonido());
		}

		for (int i = 0; i < Animales.size(); i++) {
			System.out.println(Animales.get(i).getAlimentos());
		}

		for (int i = 0; i < Animales.size(); i++) {
			System.out.println(Animales.get(i).getHabitat());
		}
	}

}

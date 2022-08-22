
package Example;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import Example.Planet;

public class PlanetaryData {

	public static int countOfMoons(ArrayList<Planet> PlanetData) {

		int Totalcount = 0;
		for (int i = 0; i < PlanetData.size(); i++) {

			Planet planet = PlanetData.get(i);
		
			
			if(planet.getHasrings()) {
			Totalcount = planet.getNoOfMoons() + Totalcount;
			}
		}

		return Totalcount;
	}

	public static ArrayList<String> getMostFoundGas(ArrayList<Planet> PlanetData) {

		
		int Totalcount = 0;

		Map<String, Integer> surfacegasses = new HashMap<>();

		for (int i = 0; i < PlanetData.size(); i++) {

			Planet planet = PlanetData.get(i);
			String[] gasses = planet.getSurfacegasses();
			if (gasses.length > 0) {

				for (int j = 0; j < gasses.length; j++) {

					if (surfacegasses.containsKey(gasses[j])) {
						surfacegasses.put(gasses[j], surfacegasses.get(gasses[j]) + 1);
						if (Totalcount < surfacegasses.get(gasses[j])) {
							Totalcount = surfacegasses.get(gasses[j]);
						}

					} else {
						surfacegasses.put(gasses[j], 1);
					}
				}

			}
		}

		System.out.println(surfacegasses);
		
		ArrayList<String> mostFoundGassesList=new ArrayList<String>();
		
		for(Map.Entry<String,Integer> entry : surfacegasses.entrySet() ) {
			
			if(Totalcount== entry.getValue()) {
				
				mostFoundGassesList.add(entry.getKey());
			}
			
		}
		
		
		
		return mostFoundGassesList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] P1Gasses = {};
		String[] P2Gasses = { "Corbon Dioxide", "Nitrogen" };
		String[] P3Gasses = { "Nitrogen", "Oxygen" };
		String[] P4Gasses = { "Hydrogen", "Helium" };
		String[] P5Gasses = { "Hydrogen", "Helium" };
		String[] P6Gasses = { "Hydrogen", "Helium", "Methane" };

		Planet P1 = new Planet("Mercury", P1Gasses, 0, false);
		Planet P2 = new Planet("Venus", P2Gasses, 0, false);
		Planet P3 = new Planet("Earth", P3Gasses, 1, false);
		Planet P4 = new Planet("Jupitor", P4Gasses, 79, true);
		Planet P5 = new Planet("Saturm", P5Gasses, 83, true);
		Planet P6 = new Planet("Uranus", P6Gasses, 27, true);

		ArrayList<Planet> PlanetData = new ArrayList<Planet>();
		PlanetData.add(P1);
		PlanetData.add(P2);
		PlanetData.add(P3);
		PlanetData.add(P4);
		PlanetData.add(P5);
		PlanetData.add(P6);

		int count = countOfMoons(PlanetData);
		System.out.println("Total count  of Moons for planets having rings=" + count);

		ArrayList<String> mostFoundGassesList = getMostFoundGas(PlanetData);
		System.out.println("Gas that are found on maximum planets:");
		System.out.println(mostFoundGassesList);

	}

}

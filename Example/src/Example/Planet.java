package Example;
import java.util.Arrays;

public class Planet {

	private String name;
	private String[] surfacegasses;
	private int noOfMoons;
	private Boolean hasrings;
	
	
	public Planet(String name, String[] surfacegasses, int noOfMoons, Boolean hasrings) {
		super();
		this.name = name;
		this.surfacegasses = surfacegasses;
		this.noOfMoons = noOfMoons;
		this.hasrings = hasrings;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getSurfacegasses() {
		return surfacegasses;
	}


	public void setSurfacegasses(String[] surfacegasses) {
		this.surfacegasses = surfacegasses;
	}


	public int getNoOfMoons() {
		return noOfMoons;
	}


	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}


	public Boolean getHasrings() {
		return hasrings;
	}


	public void setHasrings(Boolean hasrings) {
		this.hasrings = hasrings;
	}


	@Override
	public String toString() {
		return "Planet [name=" + name + ", surfacegasses=" + Arrays.toString(surfacegasses) + ", noOfMoons=" + noOfMoons
				+ ", hasrings=" + hasrings + "]";
	}
	
	
	
	
	
	

	

}


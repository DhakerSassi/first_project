package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Categorie {
	
	private Random randomGenerator = new Random();
	public String randomHayawent;
	// ArrayList hayawanet
	List<String> hayawanet = new ArrayList<String>();
	public Categorie () {
		addHayawanet();
	}
	public void addHayawanet() {
		hayawanet.add("lion");
		hayawanet.add("Cat");
		hayawanet.add("Cow");
		hayawanet.add("Dog");
		hayawanet.add("Duck");
		hayawanet.add("Goat");
		System.out.println(hayawanet);
	}
	
	public String anyItem()
    {
        int catChoice = randomGenerator.nextInt(hayawanet.size());
        System.out.println("Managers choice this week" + hayawanet.get(catChoice) + "our recommendation to you");
        return hayawanet.get(catChoice);
    }
	
	

}

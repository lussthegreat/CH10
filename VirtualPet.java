public class VirtualPet {
	
	private String name;
	private int happiness, hunger;
	
	public VirtualPet(String nama) {
		name = nama;
		happiness = 5;
		hunger = 5;
	}
	public VirtualPet(String nama, int hungery, int happinesss) {
		name = nama;
		hunger = hungery;
		happiness = happinesss;
	}
	public String getName() {
		return name;
	}
	public int getHunger() {
		return hunger;
	}
	public int getHappiness() {
		return happiness;
	}
	public void feed() {
	if (hunger > 2) {
		hunger -= 3;
	} else {
		hunger = 0;
	}
	}
	public void play() {
	if (hunger < 10) {
		hunger += 1;
	}
	if (happiness < 9) {
		happiness += 2;
	}
	if (happiness == 9) {
		happiness += 1;
	}
}
	
	public boolean isHappy() {
		return happiness >= 7 && hunger <= 4;
	}
	public String toString() {
		return getName() + " (hunger " + hunger + ", happiness " +
		happiness + ")";
	}
}

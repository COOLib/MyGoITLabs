public class Bunch {

	private String name;
	private int NumberOfFlowers;
	private ArrayList<Flower> flowers = new ArrayList<Flower>;

	public Bunch(String name, int number) {
		this.name = name;
		this.numberOfFlowers = number;
	}

	public String getName() {return name;}
	public int getNumber() {return numberOfFlowers;}

	public void addFlower(){
		flowers.add(new Astra);
		flowers.add(new Tulip);
		flowers.add(new Daisy);
		flowers.add(new Rose);
	}
	
	public void namesOfContainedFlowers()
		for(Flower flower : flowers)
			flower.getName;
}
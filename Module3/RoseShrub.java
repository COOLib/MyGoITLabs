public class RoseShrub {

	private int height;
	private int NumberOfFlowers;
	private ArrayList<Rose> roses;

	public RoseShrub(int height, int number) {
	this.height = height;
	this.numberOfFlowers = number;
	}


	public String getHeight() {return height;}
	public int getNumber() {return numberOfFlowers;}

	public void plant(){}

	public void grow(){
		roses = new ArrayList<Rose>(this.numverOfFlowers);
		for(Rose rose : roses)
			roses.add(new Rose);
	}
}
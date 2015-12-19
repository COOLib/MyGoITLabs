public abstract class MusicInstruments {

	private String name;
	private String style;
	private int size;
	private int weight;

	public MusicInstruments(String name, String style, int size, int weight) {
	this.name = name;
	this.style = style;
	this.size = size;
	this.weight = weight;
	}


	public String getName(){return name;}
	public String getStyle(){return style;}
	public int getSize(){retutn size;}
	public int getWeight() {return weight;}

	public void plant();

	public void grow();
}
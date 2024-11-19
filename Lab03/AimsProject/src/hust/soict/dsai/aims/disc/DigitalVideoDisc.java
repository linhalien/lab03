package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String directory;
	private int length;
	private float cost;
	
	// Class variable to keep track of the number of DVDs created
    private static int nbDigitalVideoDiscs = 0;

    // Instance variable for unique ID
    private int id;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirectory() {
		return directory;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.title = title;
        // Increment the class variable for each new instance
        nbDigitalVideoDiscs++;
        // Assign the unique ID to the current instance
        this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.title = title;
        // Increment the class variable for each new instance
        nbDigitalVideoDiscs++;
        // Assign the unique ID to the current instance
        this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String directory, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.cost = cost;
		this.title = title;
        // Increment the class variable for each new instance
        nbDigitalVideoDiscs++;
        // Assign the unique ID to the current instance
        this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
		this.title = title;
        // Increment the class variable for each new instance
        nbDigitalVideoDiscs++;
        // Assign the unique ID to the current instance
        this.id = nbDigitalVideoDiscs;
	}
	public String toString() {
        return "DVD- " + title + "- " + category + "- " + directory + "- " + length + " mins: " + cost + " $";
    }

    public boolean isMatch(String searchTitle) {
        return title.equalsIgnoreCase(searchTitle);
    }
}



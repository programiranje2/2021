package music;

public class Song {
	
	private String title;
	private Musician author;
	private int year;
	
	public Song(String title, Musician author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public Song() {
		super();
	}
	
	public void play() {
		if (this.title != null) {
			System.out.println("Playing " + this.title + "...");
		} else {
			System.out.println("Can't play this song, title unknown.");
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title + " (" + this.author.getName() + "), " + this.year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Musician getAuthor() {
		return author;
	}

	public void setAuthor(Musician author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}

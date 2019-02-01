
public class Genre {
	public int genreId;
	public String Name;

	public Genre(int i, String string) {
		this.genreId = i;
		this.Name = string;
	}

	public int getGenreId() {
		return genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}

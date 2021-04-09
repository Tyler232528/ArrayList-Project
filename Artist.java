import java.util.ArrayList;

public class Artist {
  public String artistName;
  /**
  @param: String with the Artist's name 
  @return: none 
  */
	public Artist(String name) {
    artistName = name;
	}

	public ArrayList<Song> getSongs() {
    ArrayList<Song> artistSong = new ArrayList<Song>();
    for(i=0; i < Song.length(); i++)
    {
      if(Song.getArtist[i] == artistName)
      {
        artistSong.add[Song[i]];
      }
    }
	}

  /**
  @param: none 
  @return: returns the artist name
  */
	public String getName() {
    return artistName; //returns the name of the artist
	}

  /**
  @param: Artist 
  @return: true or false
  */
	public boolean equals(Artist other) {
  return artistName == other; //actually returns whether the artists are the same
	}

	public void addSong(String song) {
		Song s = new Song(this, song);
	}

	public void removeSong(String song) {

	}

	public String toString() {
	}
}

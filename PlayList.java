import java.util.ArrayList;

public class PlayList {
	public static int MAX_NUMBER_SONGS = 10;
  private String listName;
  private ArrayList<Song> songs;
  private ArrayList<Integer> stars;

	public PlayList(String name) {
	}

	public ArrayList<Integer> getStars() {
	}

	public double averageRating() {

	}

	public double averageRating(Artist artist) {
	}

	public ArrayList<Song> getSongs() {
	}

	public Song[] getSongs(Artist artist) {

	}

	public ArrayList<Artist> getArtist(String songName) {
    ArrayList<Artist>  songArtists = new ArrayList<Artist>();

    for(int i = 0; i < songs.size(); i++)
    {
      if (songs.get(i).getName().equals(songName))
       {
        songArtists.add(songs.get(i).getArtist(););
       }
    }
    return songArtists
	}

	private int indexOf(Song someSong) {

	}

	public void swap(Song song1, Song song2) {
	}

	public boolean add(Song _song, int _stars) {
	}

	public void removeSong(Song song) {

	}

	public void removeArtist(Artist artist) {

	}

	public void removeLowStars(int cutOff) {
	}

	public String toString() {
		String r = "PlayList[ \n ";

		for (int i = 0; i < songs.size(); i++) {
			Song s = songs.get(i);
			int strs = stars.get(i);
			r += "\t [" + i + "] " + s.getName() + " by " + s.getArtist().getName() + ", rating : " + strs + "\n ";
		}
		r += "]";
		return r;
	}

public PlayList shuffle()
{
  PlayList shuffledList = new PlayList("Shuffled");
 shuffledList.songs = getSongs();
 shuffledList.stars = getStars();
}

}
public class Track {
    private double songDuration;
    private String artist;
    private String genre;
    private String date;

    public Track(double songDuration, String artist, String genre, String date) {
        this.songDuration = songDuration;
        this.artist = artist;
        this.genre = genre;
        this.date = date;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(double newSongDuration) {
        this.songDuration = newSongDuration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String newArtist){
        this.artist = newArtist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String newDate) {
        this.date = newDate;
    }


    @Override public String toString() {
        return "Song duration: " + getSongDuration() + ", Artist: " + getArtist() + ", Genre: " + getGenre() + ", Date: " + getDate();
    }
}

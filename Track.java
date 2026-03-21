
public class Track {
    private double song_duration;
    private String artist;
    private String genre;
    private String date;

    public Track(double song_duration, String artist, String genre, String date) {
        this.song_duration = song_duration;
        this.artist = artist;
        this.genre = genre;
        this.date = date;

    }

    public double getSong_duration() {
        return song_duration;
    }

    public void setSong_duration(double newSong_duration){
        this.song_duration = newSong_duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String newArtist) {
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

    @Override
    public String toString() {
        return "Song duration: " + this.song_duration + " " + ", Artist: " + this.artist + " " + ", Genre: " + this.genre + " " + ", Date: " + this.date;
    }
}

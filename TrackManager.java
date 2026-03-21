import java.util.ArrayList;
import java.util.*;

public class TrackManager {
    ArrayList<Track> tracks = new ArrayList<>();

    public Track findByArtist(String nameArtist) {
    for (Track track : tracks) {
        if (track.getArtist().equals(nameArtist)){
            return track;
        }
    }
        return null;
    }

    public void addTrack(Track newTrack) {
        tracks.add(newTrack);
    }

    public void removeTrack(String nameArtist) {
        tracks.removeIf(t -> t.getArtist().equals(nameArtist));
    }

    public void sortTrack() {
       tracks.sort((t1, t2) -> Double.compare(t1.getSong_duration(), t2.getSong_duration()));
    }

    public ArrayList<Track> getTrack() {
        return tracks;
    }
}

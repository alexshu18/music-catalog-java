import java.util.ArrayList;

public class TrackManager implements Catalog<Track>{
    ArrayList<Track> track = new ArrayList<>();

    public void add(Track newT) {
        track.add(newT);
    }

    public Track findByName(String artistName) {
        for (Track track1 : track ) {
            if (artistName.equals(track1.getArtist())) {
                return track1;
            }
        }
        return null;
    }

    public void delete(String artistName) {
        track.removeIf(t -> t.getArtist().equals(artistName));
    }

    public void sort() {
        track.sort((t1, t2) -> Double.compare(t1.getSongDuration(), t2.getSongDuration()));
    }

    public ArrayList<Track> getAll() {
        return track;
    }
}

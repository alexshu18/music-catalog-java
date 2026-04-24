import java.util.ArrayList;

public class TrackManager implements Catalog{
    ArrayList<Track> track = new ArrayList<>();

    public void addTrack(Track newTrack) {
        track.add(newTrack);
    }

    public Track findByArtist(String artistName) {
        for (Track track1 : track ) {
            if (artistName.equals(track1.getArtist())) {
                return track1;
            }
        }
        return null;
    }

    public void deleteTrack(String artistName) {
        track.removeIf(t -> t.getArtist().equals(artistName));
    }

    public void sortTrack() {
        track.sort((t1, t2) -> Double.compare(t1.getSongDuration(), t2.getSongDuration()));
    }

    public ArrayList<Track> getTrack() {
        return track;
    }
}

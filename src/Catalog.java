import java.util.ArrayList;

interface Catalog {

     void addTrack(Track newTrack);  // default public so we may not write the public keyword
     Track findByArtist(String artistName);
     void deleteTrack(String artistName);
     void sortTrack();
     ArrayList<Track> getTrack();
}

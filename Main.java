import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


//        ArrayList<Track> tracks = new ArrayList<>();
//        tracks.add(new Track(2.5, "Adam", "pop", "2025-12-20"));
//        tracks.add(new Track(2.5, "Eva", "pop", "2025-12-20"));
//
//        for (Track track : tracks) {
//            System.out.println(track.getArtist());
//        }
//
//        int userChoice = Menu.menu();

        Scanner myScanner = new Scanner(System.in);
        TrackManager myTrackManager = new TrackManager();

        int choice;
        while ((choice = Menu.menu()) != 5) {
            switch (choice) {
                case 1:
                    System.out.println("Enter song duration: ");
                    double songDur = myScanner.nextDouble();
                    myScanner.nextLine();
                    System.out.println("Enter the artist name: ");
                    String artistName = myScanner.nextLine();
                    System.out.println("Enter the song genre: ");
                    String songGenre = myScanner.nextLine();
                    System.out.println("Enter the song date: ");
                    String songDate = myScanner.nextLine();
                    myTrackManager.addTrack(new Track(songDur, artistName, songGenre, songDate));
                    for (Track track : myTrackManager.getTrack()) {
                        System.out.println(track);
                    }
                    break;
                case 2:
                    System.out.println("Enter the artist name songs you want find: ");
                    String findArtist = myScanner.nextLine();
                    System.out.println(myTrackManager.findByArtist(findArtist));
                    break;
                case 3:
                    System.out.println("Enter the artist name songs you want to delete: ");
                    String deleteTrack = myScanner.nextLine();
                    myTrackManager.removeTrack(deleteTrack);
                    for (Track track : myTrackManager.getTrack()) {
                        System.out.println(track);
                    }
                    break;
                case 4:
                    myTrackManager.sortTrack();
                    for (Track track : myTrackManager.getTrack()) {
                        System.out.println(track);
                    }
                    break;
            }
        }




    }
}
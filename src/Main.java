import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

//        Track myTrack = new Track(2.3, "Bob", "pop", "2025/12/12");

        TrackManager myTrackManager = new TrackManager();
        Scanner myScanner = new Scanner(System.in);



//        System.out.println(myTrack);
        int choice;
        while ((choice = Menu.menu()) !=5) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the song duration");
                    double songDur = myScanner.nextDouble();
                    myScanner.nextLine();
                    System.out.println("Enter the artist");
                    String artist = myScanner.nextLine();
                    System.out.println("Enter genre");
                    String genre = myScanner.nextLine();
                    System.out.println("Enter date");
                    String date = myScanner.nextLine();
                    myTrackManager.addTrack(new Track(songDur, artist, genre, date));
                    for (Track track : myTrackManager.getTrack()) {
                        System.out.println(track);
                    }
                    break;
                case 2:
                    System.out.println("Delete artist");
                    String deleteArtist = myScanner.nextLine();
                    myTrackManager.deleteTrack(deleteArtist);
                    for (Track track : myTrackManager.getTrack()) {
                        System.out.println(track);
                    }
                    break;
                case 3:
                    myTrackManager.sortTrack();
                    for (Track track : myTrackManager.getTrack()) {
                    System.out.println(track);
                }
                    break;
                case 4:
                    System.out.println("Find by artist");
                    String findArtist = myScanner.nextLine();
                    System.out.println(myTrackManager.findByArtist(findArtist));
                    break;
            }
        }
    }
}

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

//        Track myTrack = new Track(2.3, "Bob", "pop", "2025/12/12");

        TrackManager myTrackManager = new TrackManager();
        MovieManager myMovieManager = new MovieManager();
        Scanner myScanner = new Scanner(System.in);


//        System.out.println(myTrack);

        int choiceCatalog;
        while ((choiceCatalog = CatalogMenu.menu()) != 3) {
            switch (choiceCatalog){
                case 1:
                    runMovieCatalog(myMovieManager, myScanner);
                    break;
                case 2:
                    runTrackCatalog(myTrackManager, myScanner);
                    break;
            }

    }

    }
    static void runTrackCatalog (TrackManager manager, Scanner scanner){
        int choice;
        while ((choice = Menu.menu()) != 5) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the song duration");
                    double songDur = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter the artist");
                    String artist = scanner.nextLine();
                    System.out.println("Enter genre");
                    String genre = scanner.nextLine();
                    System.out.println("Enter date");
                    String date = scanner.nextLine();
                    manager.add(new Track(songDur, artist, genre, date));
                    for (Track track : manager.getAll()) {
                        System.out.println(track);
                    }
                    break;
                case 2:
                    System.out.println("Delete artist");
                    String deleteArtist = scanner.nextLine();
                    manager.delete(deleteArtist);
                    for (Track track : manager.getAll()) {
                        System.out.println(track);
                    }
                    break;
                case 3:
                    manager.sort();
                    for (Track track : manager.getAll()) {
                        System.out.println(track);
                    }
                    break;
                case 4:
                    System.out.println("Find by artist");
                    String findArtist = scanner.nextLine();
                    System.out.println(manager.findByName(findArtist));
                    break;
            }
        }
    }
    static void runMovieCatalog (MovieManager manager, Scanner scanner){
        int choice;
        while ((choice = Menu.menu()) != 5) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the movie name");
                    String movName = scanner.nextLine();
                    System.out.println("Enter the director");
                    String director = scanner.nextLine();
                    System.out.println("Enter genre");
                    String genre = scanner.nextLine();
                    System.out.println("Enter year");
                    int year = scanner.nextInt();
                    manager.add(new Movie(movName, director, genre, year));
                    for (Movie movie : manager.getAll()) {
                        System.out.println(movie);
                    }
                    break;
                case 2:
                    System.out.println("Delete director");
                    String deleteDirector = scanner.nextLine();
                    manager.delete(deleteDirector);
                    for (Movie movie : manager.getAll()) {
                        System.out.println(movie);
                    }
                    break;
                case 3:
                    manager.sort();
                    for (Movie movie : manager.getAll()) {
                        System.out.println(movie);
                    }
                    break;
                case 4:
                    System.out.println("Find by director");
                    String findDirector = scanner.nextLine();
                    System.out.println(manager.findByName(findDirector));
                    break;
            }
        }
    }
}

public class Movie {
    private String name;
    private String director;
    private String genre;
    private int year;


    public Movie(String name, String director, String genre, int year){
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.year = year;
    }
    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String newDirector){
        this.director = newDirector;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre){
        this.genre = newGenre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    @Override public String toString() {
        return "Name: " + getName() + ", Director: " + getDirector() + ", Genre: " + getGenre() + ", Year: " + getYear();
    }
}

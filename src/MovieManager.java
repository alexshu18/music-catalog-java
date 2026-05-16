import java.util.ArrayList;

public class MovieManager implements Catalog<Movie>{
    ArrayList<Movie> movie = new ArrayList<>();

    public void add(Movie newT){
        movie.add(newT);
    }

    public Movie findByName(String TName){
        for (Movie movie1 : movie){
            if(TName.equals(movie1.getName())){
                return movie1;
            }
        }
        return null;
    }

    public void delete(String TName){
        movie.removeIf(m -> (m.getName().equals(TName)));
    }

    public void sort(){
        movie.sort((m1,m2) -> Integer.compare(m1.getYear(), m2.getYear()));
    }

    public ArrayList<Movie> getAll(){
        return movie;
    }
}

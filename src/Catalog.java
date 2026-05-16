import java.util.ArrayList;

interface Catalog<T> {

     void add(T newT);  // default public so we may not write the public keyword
     T findByName(String TName);
     void delete(String TName);
     void sort();
     ArrayList<T> getAll();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieknight;

/**
 *
 * @author HP PAVILION
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package movieknight;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class InitializeMovies {

    ArrayList<Movie> moviesDatabase = new ArrayList<>();

    public InitializeMovies() {

        //Action Movies
        moviesDatabase.add(new Movie("Mission Impossible", "Brian De Palm", "Action", "Thriller", 1996));
        moviesDatabase.add(new Movie("The Avangers", "Joss Whedon", "Action", "Superhero", 2012));
        moviesDatabase.add(new Movie("Justice League", "Zack Snyder", "Action", "Superhero", 2017));
        moviesDatabase.add(new Movie("Skyfall", "Sam Mendes", "Action", "Thriller", 2012));
        moviesDatabase.add(new Movie("Fate Of The Furious", "F. Gary Gray", "Action", "Thriller", 2017));

        //Romance Movies
        moviesDatabase.add(new Movie("Notebook", "Nick Cassavetes", "Romance", "Drama", 2004));
        moviesDatabase.add(new Movie("A Walk To Remember", "Adam Shankman", "Romance", "Drama", 2002));
        moviesDatabase.add(new Movie("Me Before You", "Thea Sharrock", "Romance", "Drama", 2016));
        moviesDatabase.add(new Movie("The Fault In Our Stars", "Josh Boone", "Romance", "Comedy-Drama", 2014));
        moviesDatabase.add(new Movie("Perks Of Being A Wallflower", "Stephen Chbosky", "Romance", "Comedy-Drama", 2012));

        //Fantasy Movies
        moviesDatabase.add(new Movie("Lord Of The Rings", "Peter Jackson", "Fantasy", "Action", 2001));
        moviesDatabase.add(new Movie("Harry Potter", "Chris Coloumbus", "Fantasy", "Action", 2001));
        moviesDatabase.add(new Movie("Howl Moving Castle", "Hayao Miyazaki", "Fantasy", "Drama", 2004));
        moviesDatabase.add(new Movie("The Wizard Of OZ", "Victor Fleming", "Fantasy", "Adventure", 1939));
        moviesDatabase.add(new Movie("Charlie And The Chocolate Factory", "Tim Burton", "Fantasy", "Adventure", 2005));

        //Drama Movies
        moviesDatabase.add(new Movie("The Godfather", "Francis Ford Coppola", "Drama", "Crime", 1972));
        moviesDatabase.add(new Movie("Forrest Gump", "Robert Zemeckis", "Drama", "Comedy-Drama", 1994));
        moviesDatabase.add(new Movie("Boyhood", "Richard Linklater", "Drama", "Fiction", 2014));
        moviesDatabase.add(new Movie("Dunkrik", "Christopher Nolan", "Drama", "Thriller", 2017));
        moviesDatabase.add(new Movie("Hacksawridge", "Mel Gibson", "Drama", "Thriller", 2016));

        //Comedy Films
        moviesDatabase.add(new Movie("Mean Girls", "Mark Waters", "Comedy", "Comedy-Drama", 2004));
        moviesDatabase.add(new Movie("American Pie", "Paul Weitz", "Comedy", "Romance", 1999));
        moviesDatabase.add(new Movie("The Hangover", "Todd Phillips", "Comedy", "Comedy-Drama", 2009));
        moviesDatabase.add(new Movie("The Disaster Artist", "James Franco", "Comedy", "Drama", 2017));
        moviesDatabase.add(new Movie("The Interview", "Seth Rogen", "Comedy", "Action", 2014));

        //Horror Movies
        moviesDatabase.add(new Movie("Orphan", "Jaune Collet-Serra", "Horror", "Thriller", 2009));
        moviesDatabase.add(new Movie("Saw", "James Wan", "Horror", "Crime", 2004));
        moviesDatabase.add(new Movie("Grudge", "Takashi Shimizu", "Horror", "Thriller", 2004));
        moviesDatabase.add(new Movie("It", "Andres Muschietti", "Horror", "Thriller", 2017));
        moviesDatabase.add(new Movie("The Exorcist", "William Friedkin", "Horror", "Crime", 1973));

    }

    ArrayList<Movie> searchAccordingToGenre(String genre, String subGenre) {
        ArrayList<Movie> moviesFound = new ArrayList<>();
        for (int i = 0; i < moviesDatabase.size(); i++) {
            if (moviesDatabase.get(i).genre.equalsIgnoreCase(genre)) {
                if (moviesDatabase.get(i).subGenre.equalsIgnoreCase(subGenre)) {
                    moviesFound.add(moviesDatabase.get(i));
                }
            }
        }
        return moviesFound;
    }

}

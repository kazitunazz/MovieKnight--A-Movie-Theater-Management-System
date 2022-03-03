/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieknight;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Movie  implements Serializable{
    protected String name, director, genre, subGenre;
    private int yearOfRelease;
/*
    public Movie(String name, String director, String genre, int yearOfRelease) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.yearOfRelease = yearOfRelease;
    }
*/
    public Movie(String name, String director, String genre, String subGenre, int yearOfRelease) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.subGenre = subGenre;
        this.yearOfRelease = yearOfRelease;
    }
    
    
}

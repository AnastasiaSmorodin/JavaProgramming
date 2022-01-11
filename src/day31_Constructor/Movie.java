package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country,title,Genre,releaseDate,director;

    ArrayList<String > castsList = new ArrayList<>();

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String cast){
    castsList.add(cast);
    }
    public void addCasts(String[] cast){
        castsList.addAll(Arrays.asList(cast));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", castsList=" + castsList.size()+
                '}';
    }
}




package com.realdolmen.examen.examenprogrammeren2.domain;

public class Movie {

private int id;
private String title;
private String genre;

//lege constructor
    public Movie() {
    }

//alle attributen constructor
    public Movie(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
   
    @Override
    public String toString() {
        return "**********************\n"+
                "Title=" + title +"\n"+
                "Genre=" + genre +"\n"+
                "**********************\n" ;
    }
    
}

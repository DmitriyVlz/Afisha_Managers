package ru.netology.domain;

public class PosterItem {

    private int id;
    private int MovieId;
    private String MovieName;
    private String MovieGenre;
    private int MovieImage;

    public PosterItem(int id, int movieId, String movieName, String movieGenre, int movieImage) {
        this.id = id;
        MovieId = movieId;
        MovieName = movieName;
        MovieGenre = movieGenre;
        MovieImage = movieImage;
    }

}

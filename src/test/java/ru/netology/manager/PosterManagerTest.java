package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    @Test
    public void displayLastTenMovies() {
        PosterManager manager = new PosterManager();

        PosterItem first = new PosterItem(1, 238634, "Movie first", "crime", 1);
        PosterItem second = new PosterItem(2, 397412, "Movie second", "fantasy", 1);
        PosterItem third = new PosterItem(3, 393236, "Movie third", "action", 1);
        PosterItem fourth = new PosterItem(4, 104389, "Movie fourth", "crime", 1);
        PosterItem fifth = new PosterItem(5, 326608, "Movie fifth", "drama", 1);
        PosterItem sixth = new PosterItem(6, 457112, "Movie sixth", "fantasy", 1);
        PosterItem seventh = new PosterItem(7, 907159, "Movie seventh", "action", 1);
        PosterItem eighth  = new PosterItem(8, 246100, "Movie eighth", "fantasy", 1);
        PosterItem ninth = new PosterItem(9, 908472, "Movie ninth", "action", 1);
        PosterItem tenth  = new PosterItem(10, 172543, "Movie tenth", "drama", 1);
        PosterItem eleventh  = new PosterItem(11, 385145, "Movie eleventh", "action", 1);
        PosterItem twelve  = new PosterItem(12, 504162, "Movie twelve", "fantasy", 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};


        assertArrayEquals(expected, actual);
    }

    @Test
    public void displayLastMoviesLessTen() {
        PosterManager manager = new PosterManager();

        PosterItem first = new PosterItem(1, 238634, "Movie first", "crime", 1);
        PosterItem second = new PosterItem(2, 397412, "Movie second", "fantasy", 1);
        PosterItem third = new PosterItem(3, 393236, "Movie third", "action", 1);
        PosterItem fourth = new PosterItem(4, 104389, "Movie fourth", "crime", 1);


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{fourth, third, second, first};


        assertArrayEquals(expected, actual);
    }

    @Test
    public void displayThreeMovies() {
        PosterManager manager = new PosterManager(3);

        PosterItem first = new PosterItem(1, 238634, "Movie first", "crime", 1);
        PosterItem second = new PosterItem(2, 397412, "Movie second", "fantasy", 1);
        PosterItem third = new PosterItem(3, 393236, "Movie third", "action", 1);
        PosterItem fourth = new PosterItem(4, 104389, "Movie fourth", "crime", 1);
        PosterItem fifth = new PosterItem(5, 326608, "Movie fifth", "drama", 1);
        PosterItem sixth = new PosterItem(6, 457112, "Movie sixth", "fantasy", 1);
        PosterItem seventh = new PosterItem(7, 907159, "Movie seventh", "action", 1);
        PosterItem eighth  = new PosterItem(8, 246100, "Movie eighth", "fantasy", 1);
        PosterItem ninth = new PosterItem(9, 908472, "Movie ninth", "action", 1);
        PosterItem tenth  = new PosterItem(10, 172543, "Movie tenth", "drama", 1);
        PosterItem eleventh  = new PosterItem(11, 385145, "Movie eleventh", "action", 1);
        PosterItem twelve  = new PosterItem(12, 504162, "Movie twelve", "fantasy", 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{twelve, eleventh, tenth};

        assertArrayEquals(expected, actual);
    }


}
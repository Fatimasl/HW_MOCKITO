package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MoviePosterManagerTest {

    MovieItem item1 = new MovieItem(1, "Зеленая миля", 1999);
    MovieItem item2 = new MovieItem(1, "Побег из Шоушенка", 1994);
    MovieItem item3 = new MovieItem(1, "Интерстеллар", 2014);
    MovieItem item4 = new MovieItem(1, "Бойцовский клуб", 1999);
    MovieItem item5 = new MovieItem(1, "Властелин колец", 2003);
    MovieItem item6 = new MovieItem(1, "Криминальное чтиво", 1994);
    MovieItem item7 = new MovieItem(1, "Терминатор 2", 1991);


    @Test
    public void testFindAll() {
        MoviePosterManager myPoster = new MoviePosterManager();
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);

        MovieItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        MovieItem[] actual = myPoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastDefault5() {
        MoviePosterManager myPoster = new MoviePosterManager();
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);

        MovieItem[] expected = {item7, item6, item5, item4, item3};
        MovieItem[] actual = myPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast0() {
        MoviePosterManager myPoster = new MoviePosterManager(0);
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);

        MovieItem[] expected = {};
        MovieItem[] actual = myPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast1() {
        MoviePosterManager myPoster = new MoviePosterManager(1);
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);

        MovieItem[] expected = {item7};
        MovieItem[] actual = myPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast6() {
        MoviePosterManager myPoster = new MoviePosterManager(6);
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);
        MovieItem[] expected = {item7, item6, item5, item4, item3, item2};
        MovieItem[] actual = myPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast7() {
        MoviePosterManager myPoster = new MoviePosterManager(7);
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);
        MovieItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        MovieItem[] actual = myPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast8() {
        MoviePosterManager myPoster = new MoviePosterManager(8);
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);
        MovieItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        MovieItem[] actual = myPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastNegative() {
        MoviePosterManager myPoster = new MoviePosterManager(-1);
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);
        MovieItem[] expected = {};
        MovieItem[] actual = myPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
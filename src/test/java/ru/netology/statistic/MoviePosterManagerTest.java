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
    MoviePosterManager myPoster = new MoviePosterManager();

    @BeforeEach
    public void setup() {
        myPoster.save(item1);
        myPoster.save(item2);
        myPoster.save(item3);
        myPoster.save(item4);
        myPoster.save(item5);
        myPoster.save(item6);
        myPoster.save(item7);
    }

    @Test
    public void testFindAll() {

        MovieItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        MovieItem[] actual = myPoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastDefault5() {

        MovieItem[] expected = {item7, item6, item5, item4, item3};
        MovieItem[] actual = myPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast0() {
        MovieItem[] expected = {};
        MovieItem[] actual = myPoster.findLast(0);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast1() {
        MovieItem[] expected = {item7};
        MovieItem[] actual = myPoster.findLast(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast6() {
        MovieItem[] expected = {item7, item6, item5, item4, item3, item2};
        MovieItem[] actual = myPoster.findLast(6);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast7() {
        MovieItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        MovieItem[] actual = myPoster.findLast(7);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast8() {
        MovieItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        MovieItem[] actual = myPoster.findLast(8);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastNegative() {
        MovieItem[] expected = {};
        MovieItem[] actual = myPoster.findLast(-1);

        Assertions.assertArrayEquals(expected, actual);
    }
}
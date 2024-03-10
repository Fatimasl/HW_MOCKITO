package ru.netology.statistic;

public class MoviePosterManager {
    private MovieItem[] items = new MovieItem[0];
    private int quantityOfItems;

    public MoviePosterManager(int quantityOfItems) {
        this.quantityOfItems = quantityOfItems;
    }

    public MoviePosterManager(){
        quantityOfItems = 5;
    }


    public void save(MovieItem item){
        MovieItem[] tmp = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++){
            tmp[i] = items[i];
        }
        tmp[items.length] = item;
        items = tmp;
    }

    public MovieItem[] findAll(){
        return items;
    }
//    
    public MovieItem[] findLast(){

        if (items.length < quantityOfItems){
            quantityOfItems = items.length;
        } else if (quantityOfItems < 0) {
            quantityOfItems = 0;
        }
        MovieItem[] tmp = new MovieItem[quantityOfItems];
        for (int i = 0; i < quantityOfItems; i++){
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}

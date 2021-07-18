package com.bootcamp.coremodule.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProductRating {
ZERO(0),ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5);
    int rating;
    ProductRating(int rating){
        this.rating=rating;
    }

    @JsonValue
    public int getRating() {
        return rating;
    }

}

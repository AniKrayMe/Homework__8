package com.company;

public class Cat {
    private String breed;

    //region Constructor
    public Cat(String breed) {
        this.breed = breed;
    }

    public Cat() {
    }
    //endregion

    //region Getter and Setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    //endregion

}

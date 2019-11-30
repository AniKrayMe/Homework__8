package com.company;

public class Dog {
    private String breed;

    //region Constructor
    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog() {
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

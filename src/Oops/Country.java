package Oops;

public class Country{
    String countryName;
    int f = 0;

    public Country(String name){
        this.countryName = name;
    }

    public Country(){

    }

    public int isVisited(){
        return f;
    }

    public void changeState(){
        this.f = 1;
    }

    public void printCountry(){
        System.out.println("Hey I am in " + countryName);
    }

}

class Place extends Country{
    String placeName;
    public Place(Country c, String name) {
        super();
        this.countryName = c.countryName;
        this.placeName = name;
    }

    @Override
    public void printCountry(){
        System.out.println("I am in the place " + placeName + ", " + countryName);
    }
}

package Oops;

public class Pillars {
    //Inheritance
//    public void inheritance(){
//        Country abc = new Country("India");
//        abc.printCountry();
//        Place xyz = new Place(abc, "Bangalore");
//        xyz.printCountry();
//    }
//
//    public void inf(){
//        Check number = new Check();
//        number.printCount();
//    }

//    public void polymorphism(){
//        Learn abc = new Learn();
//        Forget xyz = new Forget();
//        xyz.fun(444, "");
//    }

    public void abstraction(){
        LevelOne one = new LevelOne("hello", "Hi");
        LevelTwo two = new LevelTwo("I am", "Groot");

        one.getLevel();
        two.getLevel();
        two.getHint(2);
    }
}

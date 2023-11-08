package Oops;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class pillars {
    //Inheritance
    public void inheritance(){
        Country abc = new Country("India");
        abc.printCountry();
        Place xyz = new Place(abc, "Bangalore");
        xyz.printCountry();
    }

    public void polymorphism(){

    }
}

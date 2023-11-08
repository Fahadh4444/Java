package Oops;

public interface Product {
    int count = 4444;
    public void printCount();
}

class Check implements Product{
    public void printCount(){
        System.out.println("Hey count is " + count);
    }
}
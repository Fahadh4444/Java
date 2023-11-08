package Oops;

public class Learn{
    protected int a, c;
    protected String b;

    Learn(){
        a = 999;
        b = "I am here in Java world";
        c = 111;
    }

    public void fun(){
        System.out.println("I have nothing to do!!!");
    }


    public void fun(int a, String b){
        this.a = a;
        this.b = b;
    }

    public void fun(int a, int c){
        this.a = a;
        this.c = c;
    }
}

class Forget extends Learn{
    Forget(){
        super();
        System.out.println(a + "-" + b + "-" + c);
    }
    @Override
    public void fun(int a, String b){
        this.b = "I dont remember any thing!!!";
        this.a = a;
        System.out.println(a + "-" + b + "-" + c);
    }
}

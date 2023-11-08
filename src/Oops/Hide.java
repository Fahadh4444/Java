package Oops;

abstract class Hide {
    private String hint1;
    private String hint2;

    Hide(String a, String b){
        this.hint1 = a;
        this.hint2 = b;
    }

    public abstract void getLevel();

    public void getHint(int l){
        if(l == 1){
            System.out.println(hint1);
        }else{
            System.out.println(hint2);
        }
    }
}


class LevelOne extends Hide{
    LevelOne(String a, String b) {
        super(a, b);
    }

    @Override
    public void getLevel() {
        System.out.println("one");
    }
}


class LevelTwo extends Hide{
    LevelTwo(String a, String b) {
        super(a, b);
    }

    @Override
    public void getLevel() {
        System.out.println("two");
    }
}
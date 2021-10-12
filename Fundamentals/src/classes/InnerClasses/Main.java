package classes.InnerClasses;

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x); // 15
    }
}


class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }

}
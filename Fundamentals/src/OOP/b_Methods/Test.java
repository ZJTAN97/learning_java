package OOP.b_Methods;


class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        Test obj2 = new Test();

        obj.method1();
        obj.method2();

        obj2.method1();
        obj2.method2();

        int no_of_objects = Test.get();

        System.out.print("No of instances created ");
        System.out.println(no_of_objects);


    }
}


class Test {
    
    public static int i = 0;

    // Constructor which counts the
    // number of objects of the class
    Test() {
        i ++;
    }

    public static int get() {
        return i;
    }


    public void method1() {
        System.out.println("Method 1");
        this.method2(); // calling method 2 within the same class
    }


    public void method2() {
        System.out.println("Method 2");
    }

}

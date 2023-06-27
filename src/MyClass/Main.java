package MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass<String> instance1 = MyClass.factoryMethod("Hello");
        System.out.println("Instance 1 data: " + instance1.getData());

        MyClass<Integer> instance2 = MyClass.factoryMethod(123);
        System.out.println("Instance 2 data: " + instance2.getData());

        MyClass<Boolean> instance3 = MyClass.factoryMethod(true);
        System.out.println("Instance 3 data: " + instance3.getData());
    }
}



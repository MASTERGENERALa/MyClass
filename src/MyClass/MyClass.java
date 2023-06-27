package MyClass;

public class MyClass<T> {
    private T data;

    public MyClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static <T> MyClass<T> factoryMethod(T data) {
        return new MyClass<>(data);
    }
}


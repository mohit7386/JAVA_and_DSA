class Test {
    Test getInstance() {
        return this;
    }

    void show() {
        System.out.println("Hello from Test class!");
    }
}

public class Keyword1 {
    public static void main(String[] args) {
        Test obj = new Test().getInstance();
        obj.show();
    }
}

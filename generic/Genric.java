package generic;

//T denote -> type
class Password<T> {
    private T pass;

    public void setPass(T pass) {
        this.pass = pass;
    }

    public T getPass() {
        return pass;
    }
}

public class Genric {
    // make a Generic Method
    static <T> void print(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        // useCase
        // object 1 pass string value
        Password<String> pass = new Password<>();
        pass.setPass("hellolooki");
        print(pass.getPass());
        // object 2 pass Int value
        Password<Integer> pass2 = new Password<>();
        pass2.setPass(123);
        print(pass2.getPass());

    }
}

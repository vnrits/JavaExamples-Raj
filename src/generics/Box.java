package generics;
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        // Create a Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setContent(123);
        System.out.println("Integer content: " + intBox.getContent());

        // Create a Box for String
        Box<String> strBox = new Box<>();
        strBox.setContent("Hello, Generics!");
        System.out.println("String content: " + strBox.getContent());
    }
}

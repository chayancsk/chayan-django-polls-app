// Java Task 1: Null Pointer Exception

public class Task1 {
    public static void main(String[] args) {
        String str = null;
        // Bug: Dereferencing a null object.
        // Fix: Add a null check before using the object.
        System.out.println(str.length());
    }
}

// Java Task 2: ArrayIndexOutOfBoundsException

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        // Bug: Accessing array with invalid index.
        // Fix: Use proper indices within array bounds.
        System.out.println(numbers[3]);
    }
}

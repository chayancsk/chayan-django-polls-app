// Java File 3: Incorrect Prime Number Check

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Is 9 a prime number? " + isPrime(9));
    }

    public static boolean isPrime(int number) {
        // Bug: Incorrectly identifies some non-prime numbers as prime.
        // Fix: Correct the loop condition and check for factors properly.
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

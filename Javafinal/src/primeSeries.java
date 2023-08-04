
public class primeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers between 1 and 100:");

        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number less than itself
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print the number if it is prime
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}


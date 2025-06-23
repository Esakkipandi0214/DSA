public class timeComplexity {

    // O(1)
    public static void sampleOne() {
        int stepCount = 0;
        long startTime = System.currentTimeMillis();

        System.out.println("Hello World!");
        stepCount++;

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("\nOperations executed (step count): " + stepCount);
        System.out.println("Theoretical Time Complexity: O(1)");
        System.out.println("Execution Time: " + duration + " ms");
    }

    // O(log n)
    public static void sampleTwo() {
        int i, n = 8;
        int stepCount = 0;
        long startTime = System.currentTimeMillis();

        for (i = 1; i <= n; i = i * 2) {
            System.out.println("Hello World!");
            stepCount++;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("\nOperations executed (step count): " + stepCount);
        System.out.println("Theoretical Time Complexity: O(log n)");
        System.out.println("Execution Time: " + duration + " ms");
    }

    // O(n)
    public static void sampleThree() {
        int i, n = 8;
        int stepCount = 0;
        long startTime = System.currentTimeMillis();

        for (i = 1; i <= n; i++) {
            System.out.printf("Hello World !!!\n");
            stepCount++;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("\nOperations executed (step count): " + stepCount);
        System.out.println("Theoretical Time Complexity: O(n)");
        System.out.println("Execution Time: " + duration + " ms");
    }

    public static void main(String[] args) {
        sampleOne();
        System.out.println("\n---------------------------\n");
        sampleTwo();
        System.out.println("\n---------------------------\n");
        sampleThree();
    }
}

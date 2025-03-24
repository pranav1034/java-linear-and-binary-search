public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        // Measuring performance of StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Measuring performance of StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbd.append(text);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Printing results (dividing by 1_000_000 to convert nanoseconds to milliseconds)
        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000 + " ms");

        // Comparing performance
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster by " + (durationBuffer - durationBuilder) / 1_000_000 + " ms.");
        } else {
            System.out.println("StringBuffer is faster by " + (durationBuilder - durationBuffer) / 1_000_000 + " ms.");
        }
    }
}

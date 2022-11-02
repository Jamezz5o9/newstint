package Chapter17;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        firstStream();
        secondStream();
        thirdStream();
    }

    private static void secondStream() {
       int result =  IntStream.rangeClosed(1, 10).map((int x) -> {return x * 2;}).sum();
        System.out.println(result);
    }

    private static void firstStream() {
        int sumOfDigit = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sumOfDigit);
        int sumOfDigit2 = IntStream.range(1, 10).sum();
        System.out.println(sumOfDigit2);
    }
}

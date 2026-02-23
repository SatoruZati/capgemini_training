package capgemini_19022026.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class CustomList<T extends Number> {
    // <T> is a generic type parameter that allows the class to work with any type of data.
    // Number is a superclass of all numeric types in Java (like Integer, Double, etc.), so this class can only work with numeric types.
}

public class StreamsSample {

    public static void main(String[] args) {
        CustomList<Integer> list01 = new CustomList();

        Integer[] arr01 = new Integer[10];

        fillArray(arr01);

        List<Integer> remain = filterOdd(arr01);
        System.out.println(remain);
    }

    public static void fillArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    private static List<Integer> filterOdd(Integer[] arr) {

        // Integer [] arr1 = {1, 2, 3, ..., 9, 10};
        // output: 2, 4, 6, 8, 10

        Stream<Integer> stream = Arrays.stream(arr);

        Predicate<Integer> predicate = (Integer i) -> i % 2 == 0;

        Stream<Integer> filtered = stream.filter(predicate);

        stream = stream.filter(i -> i % 2 == 0);

        return  stream.toList();
    }
}

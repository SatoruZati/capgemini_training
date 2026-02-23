package capgemini_18022026.lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class AnonymousImpl {

    interface Compare {
        int compare(int a, int b);
    }

    interface StringCompare {
        int compare(String a, String b);
    }

    public static void main(String[] args) {

        // Constructor reference
        Supplier<List> supplier12 = ArrayList::new;

        // Static method reference
        Compare compares = Integer::compare;
        System.out.println(compares.compare(17, 10));

        // Instance method reference
        String str1 = "Hello";
        String str2 = "World";

        StringCompare stringCompare = String::compareTo;
        System.out.println(stringCompare.compare(str1, str2));
    }
}

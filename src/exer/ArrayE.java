package exer;


import java.util.ArrayList;
import java.util.List;

public class ArrayE {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
//        int[] numbers = {1,3,4,5,6,7,7,8,9,10};
        numbers.add(1);
        numbers.add(2);
        numbers.add(12);
        numbers.add(22);
        numbers.add(13);
        numbers.add(23);
        numbers.add(14);
        numbers.add(24);
        numbers.add(145);
        numbers.add(25);
        System.out.println(numbers);
//    public addEven() {
        Integer sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += numbers.get(number);
            }
        System.out.println(sum);
//        }
    }
    }
}




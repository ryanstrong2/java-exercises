package exer;

public class Array {
    public static void main(String [] args){
        int[] numbers = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i< numbers.length; i++){
            System.out.println(getElement(numbers, i));
            getElement(numbers,i);

        }}
    public static int getElement(int[] numbers, int i) {
        return numbers[i];
    }


}

package Loopers;

public class tf3 {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (i != 2) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        int szukane = 2;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i]==szukane){
                System.out.print(i + " " + numbers[i] + " ");
            }
        }
    }
}



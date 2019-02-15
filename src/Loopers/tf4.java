package Loopers;

public class tf4 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9, 2};
        int szukane = 2;
        int licznik = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == szukane) {
                licznik++;
            }
        }
        System.out.println(szukane + " wystepuje" + licznik + " razy");
        int suma_mniejsze = 0;
        int suma_wieksze = 0;
        for (int k : numbers) {
            if (k > szukane) {
                suma_wieksze += k;
            } else if (k < szukane) {
                suma_mniejsze += k;
            }
        }
        System.out.println(suma_wieksze - suma_mniejsze);

        int max_value = numbers[0];
        int max_value2 = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max_value) {
                max_value = numbers[i];
                index = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max_value2 && index != i) {
                max_value2 = numbers[i];
            }
        }
        System.out.println(max_value);
        System.out.println(max_value2);
        System.out.println(max_value * max_value2);


        int sum = 0;
        for (int element : numbers) {
            sum = sum + element;
        }
        System.out.println(((double) sum) / numbers.length;





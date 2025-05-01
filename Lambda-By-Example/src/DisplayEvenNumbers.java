import java.util.ArrayList;

public class DisplayEvenNumbers {

    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");

        ArrayList<Integer> evenNumbers = new ArrayList<>(Arrays.asList(
            2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
            22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
            42, 44, 46, 48, 50, 52, 54, 56, 58, 60,
            62, 64, 66, 68, 70, 72, 74, 76, 78, 80,
            82, 84, 86, 88, 90, 92, 94, 96, 98
        ));

        evenNumbers.forEach(number -> {
           // System.out.print(number + " ");
            if(number % 2 == 0) {
                System.out.println("number is even", number);
            }
            else {
                System.out.println("number is odd", number);
            }
        });
        Integer[] numbersArray = {1, 4,5, 6, 7, 8, 9, 10};


        List<Integer> numbersArrayList = new ArrayList<>(Arrays.asList(numbersArray));

        numbersArrayList.forEach(number -> {
            if (number % 2 == 0) {
                System.out.println("number is even", number);
            } else {
                System.out.println("number is odd", number);
            }
        });
        numbersArrayList.stream().
                filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println("number is even", number));
        numbersArrayList.stream().
                filter(number -> number % 2 != 0)
                .forEach(number -> System.out.println("number is odd", number));

        int sum = numbersArrayList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of all numbers: " + sum);
        // 3. Sort the numbers using Lambda

        numbers.stream.sorted((a,b)->a.compareTo(b))
                .forEach(System.out::println);
    }
}


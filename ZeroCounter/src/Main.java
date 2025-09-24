// ZeroCounter
// Autore: Marco Del Core
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        int ZeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            if (numbers[i] == 0) {
                ZeroCount++;
            }
            System.out.println("numbers["+ i + "] = " + numbers[i]);
        }
        System.out.println("The number 0 is present " + ZeroCount + " times");
    }
}
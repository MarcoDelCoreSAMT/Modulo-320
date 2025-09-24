public class Main {
    public static void main(String[] args) {

        float number1 = Float.parseFloat(args[0]);
        float number2 = Float.parseFloat(args[1]);
        float number3 = Float.parseFloat(args[2]);

        float minValue = Math.min(number1, Math.min(number2, number3));
        float maxValue = Math.max(number1, Math.max(number2, number3));
        float midValue = number1 + number2 + number3 - minValue - maxValue;

        if (midValue - minValue == maxValue - midValue) {
            float distance = midValue - minValue;
            System.out.println(minValue + " " + midValue + " " + maxValue +
                    " are in arithmetic progression (constant difference of " + distance + ")");
        } else {
            System.out.println(minValue + " " + midValue + " " + maxValue +
                    " are not in arithmetic progression");
        }
    }
}
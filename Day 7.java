class MathClassExample {
    public static void main(String[] args) {
        // Deklarasi variabel
        double num1 = 15.5;
        double num2 = 10.8;
        float floatNumber = 7.3f;
        double negativeDouble = -25.4;

        // Maximum of 2 numbers
        double max = Math.max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);

        // Minimum of 2 numbers
        double min = Math.min(num1, num2);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + min);

        // Square root of a number
        double sqrt = Math.sqrt(num1);
        System.out.println("Square root of " + num1 + " is: " + sqrt);

        // Floor and Ceil of a float
        double floor = Math.floor(floatNumber);
        double ceil = Math.ceil(floatNumber);
        System.out.println("Floor of " + floatNumber + " is: " + floor);
        System.out.println("Ceil of " + floatNumber + " is: " + ceil);

        // Absolute value of a double
        double absValue = Math.abs(negativeDouble);
        System.out.println("Absolute value of " + negativeDouble + " is: " + absValue);
    }
}

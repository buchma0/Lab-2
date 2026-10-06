public class SyntaxDrills {
    public static void main(String[] args) {

        // Identifier Validation
        int scoreCount = 10;
        int _total = 20;
        int $money = 30;

        // int 1place = 1;
        // int class = 2;
        // int user-id = 3;

        // Case Sensitivity
        int score = 10;
        int Score = 20;
        int SCORE = 30;
        System.out.println("score: " + score + ", Score: " + Score + ", SCORE: " + SCORE);

        // The Constant
        final int number = 10;

        // Floating Point Suffixes
        // float myFloat = 10.5;
        float myFloat= 10.5f;
        System.out.println("Float: " + myFloat);

        // String vs Char
        char c = 'A';
        String s = "A";
        // c = s;
        // s = c;
        System.out.println("Char: " + c + ", String: " + s);

        // Integer Truncation
        int a = 10;
        int b = 3;
        double result = a / b;
        System.out.println("Result a / b: " + result);
        System.out.println("Result (double) a / b: " + (double) a / b);

        // Implicit Widening
        byte smallNum = 50;
        long bigNum  = smallNum;
        System.out.println("Result: " + bigNum);

        // Explicit Narrowing
        double d = 9.99;
        int i = (int) d;
        System.out.println("int " + i);

        // The Modulus Logic
        int num = 157;
        int remainder = num % 2;
        System.out.println("Remainder of 157 % 2: " + remainder);

        // Escape Formatting
        System.out.println("1\t2\t3\n4\t5\t6\n7\t8\t9");

        // Array Bounds
        int[] arr = new int [3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("Arr lenght: " + arr.length);

        // Array Shortcut
        int[] myNumbers = {10, 25, 41, 56, 91};
        System.out.println("First: " + myNumbers[0]);
        System.out.println("Last: " + myNumbers[myNumbers.length - 1]);

    }
}

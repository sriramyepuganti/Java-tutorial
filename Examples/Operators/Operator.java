class Operator {
    public static void main(String args[]) {
        /**
         * Arithmetic operators
         */
        System.out.println("+:" + (30 + 30));
        System.out.println("-:" + (30 - 30));
        System.out.println("/:" + (30 / 29));
        System.out.println("*:" + (30 * 30));
        System.out.println("%:" + (30 % 28));
        int val = 30;
        System.out.println("++:" + (++val));
        System.out.println("--:" + (--val));
        // ++someValue; // pre increment
        // someValue; // post increment
        // without assign operator both are equal with assign operator it has differnt
        // value
        // int someValue = 9;
        // int test = someValue++;
        // System.out.println(test); // 9

        /**
         * Assignment operators
         */
        int assignment1 = 10;
        assignment1 += 10;
        System.out.println("+=" + assignment1);
        assignment1 -= 10;
        System.out.println("-=" + assignment1);
        assignment1 *= 10;
        System.out.println("*=" + assignment1);
        assignment1 /= 10;
        System.out.println("/=" + assignment1);
        assignment1 %= 10;
        System.out.println("%=" + assignment1);
        assignment1 = 10;
        assignment1 <<= 2;
        System.out.println("<<=" + assignment1);
        assignment1 >>= 2;
        System.out.println(">>=" + assignment1);
        assignment1 |= 2;
        System.out.println("|=" + assignment1);
        assignment1 &= 2;
        System.out.println("&=" + assignment1);
        assignment1 ^= 2;
        System.out.println("^=" + assignment1);

        /**
         * Comparison Operators
         */

        System.out.println("==:" + (100 == 101)); // there is no ===
        System.out.println("!=:" + (100 != 101));
        System.out.println(">:" + (100 > 101));
        System.out.println("<:" + (100 < 101));
        System.out.println(">=:" + (100 >= 101));
        System.out.println("<=:" + (100 <= 101));

        /**
         * Logical Operators
         */

        System.out.println("&&:" + (true && false));
        System.out.println("||:" + (true || false));
        System.out.println("&&:" + (!true));

    }
}
class Strings {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println("string length:" + str.length());
        System.out.println("string concat:" + str.concat("using java"));
        System.out.println("To uppercase:" + str.toUpperCase());
        System.out.println("To lowercase:" + str.toLowerCase());
        System.out.println("Find character in string:" + str.indexOf("y")); // not found returns -1

        // special character
        String s1 = "Test for special\" characters\\";
        System.out.println(s1);
        // \n - new line
        // \r - carriage return
        // \t - tab
        // \b - backspace
        // \f - formfeed
        String nextLine = "Hello\nWorld!"; // it moves text to next line
        System.out.println("next line:" + nextLine);
        String carriageReturn = "\rR"; // it replace character in starting of string
        System.out.println("Test:" + carriageReturn);
        String tabs = "Hello \t world"; // it adds tab space
        System.out.println("Tabs:" + tabs);
        String backSpace = "Hello\bWorld"; // it removes one letter
        System.out.println("backspace:" + backSpace);
        System.out.println("Hello world \f test the form feed");
    }
}

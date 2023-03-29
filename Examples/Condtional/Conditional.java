class Conditional {
    public static void main (String args[]) {
        if (true)
         System.out.println("Do not need {}. if it has single statement");


        if (true) {
            // excute
        } else if (true) {
            // excute
        } else {
            // excute
        }

        switch (3) {
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            default:
            break;
        }

        String a = (5 == 5) ? "hello": "bye";
        System.out.println(a);

        for ( int index = 0; index <=5; index++) {
            System.out.println(index);
        }

        int whileStart = 0;
        while (whileStart < 5) {
            System.out.println(whileStart);
            whileStart++;
        }

        do {
            System.out.println(whileStart);
            whileStart--;
        } while(whileStart > 0);

        String []strArray = { "str-1", "str-2", "str-3"};
        for(String str: strArray) {
            System.out.println(str);
        }
        // break: it is used to exit from loop
        // continue: it is used to skip the current loop

    }
}
class DataTypes {
    public static void main(String args[]) {
        /**
         * Declartions
         */

        int declare1; // if you try to print this local varaible without intialization you will get an
                      // error
        declare1 = 30;
        int declare2 = 50;
        int declare3, declare4, declare5;
        int declare6 = 10, declare7 = 25, declare8 = 1;
        int declare9, declare10, declare11 = 15;
        System.out.println("************");
        System.out.println(declare11);

        /**
         * Primitive data types
         */
        System.out.println("************");
        byte byteValue = 30;
        short shortValue = 30;
        int intValue = 50;
        long longValue = 50;
        System.out.println("byte:" + byteValue);
        System.out.println("short:" + shortValue);
        System.out.println("int:" + intValue);
        System.out.println("long:" + longValue);

        System.out.println("************");
        float floatValue = 50.0f;
        double doubleValue = 50;
        System.out.println("float:" + floatValue);
        System.out.println("doublt:" + doubleValue);

        System.out.println("************");
        char charValue = 'k';
        System.out.println("char:" + charValue);

        System.out.println("************");
        boolean booleanValue = true;
        System.out.println("boolean:" + booleanValue);

        /**
         * Non-primitive data types
         * Strings, interfaces, classes
         */

        System.out.println("************");
        String str = "hello world";
        System.out.println("String:" + str);

        /**
         * Binary, octa, hexa numbers
         */

        System.out.println("************");
        int binaryValue = 0b101;
        int octaValue = 012;
        int hexaValue = 0xAB;
        System.out.println("binary:" + binaryValue);
        System.out.println("octa:" + octaValue);
        System.out.println("hexa:" + hexaValue);

        /*
         * Number with more zeros representation
         */
        System.out.println("************");
        int bigNum = 100_00_000;
        System.out.println(bigNum);

        /**
         * Decimal representation
         */

        System.out.println("************");
        double ePoints = 3e3;
        System.out.println(ePoints);

        /**
         * Type conversions
         */
        float floatConversionValue = 123.f;
        byte byteConversionValue = 127;
        int intConversionValue = byteConversionValue;
        byteConversionValue = (byte) intConversionValue;
        System.out.println("byte to int:" + intConversionValue);
        System.out.println("int to byte:" + byteConversionValue);
        intConversionValue = (int)floatConversionValue;
        System.out.println("float to int" + intConversionValue);
        char characterConversionValue = 'c';
        int charToInt = characterConversionValue;
        System.out.println("chat to int:" + charToInt);
        characterConversionValue = (char)charToInt;
        System.out.println("int to char:" + characterConversionValue);

        /**
         * Type promotions
         */
        System.out.println("************");
        byte promo1 = 127;
        byte promo2 = 127;
        int result = promo1 + promo2;
        System.out.println(result);

        /**
         * Float default values
         */
         float floatDefaultValue1 = 124; // it works. type is float
         // float floatDefaultValue2 = 124.0; // throws error. default is double
         float floatDefaultValue3 = 124.0f; // it works. type is float

    }
}
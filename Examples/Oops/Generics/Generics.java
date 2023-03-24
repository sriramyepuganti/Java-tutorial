class Test<T> {
    T a;
    public void getData(T val) {
        System.out.println(val);
    }
}


class Generics {
    /*
     * Generics means parameterized types. 
     * The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics
     * T - Type
     * E - Element
     * K - Key
     * N - Number
     * V - Value
     * * Wildcard in Java Generics
     * We can use a wildcard as a type of a parameter, field, return type, or local variable
     * However, it is not allowed to use a wildcard as a type argument for a generic method invocation a generic class instance creation, or a supertype.
     */
    public static void main(String[] args) {
        Test<Integer> obj = new Test<Integer>();
        obj.a = 5;
        System.out.println(obj.a);
        obj.getData(null);
    }
}

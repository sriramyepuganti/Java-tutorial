class Student {
    int id;
    String name;
}

class Array {
    public static void main(String a[]) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        String[] str = {"sri", "ram", "sai"};
        System.out.println(str[0]);

        int list[] = {1,2,3,4,5};
        System.out.println(list);
        for (String each: str) {
            System.out.println(each);
        }

        int lis1[] = new int[5]; // 0`s array with length 5
        System.out.println(lis1);
        // multi dimensional array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };   

        Student studentList[] = new Student[3]; // Not creating object for Student. just creating Array refernces. you have to manually cerate object
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        for (Student s: studentList) {
            System.out.println(s.name); // null 
        }
    }
}
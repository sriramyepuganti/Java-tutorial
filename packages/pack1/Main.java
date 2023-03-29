package packages.pack1;

public class Main {
    public Main() {
        System.out.println("Message from Main class");
        Def obj = new Def();
        Pub obj1 = new Pub();
        obj.showMessage();
        obj1.showMessage();
        // Access values
        System.out.println(obj.defDef);
        System.out.println(obj.pubDef);
        System.out.println(obj.protectDef);
        // System.out.println(obj.priDef); throws error, private variable


        // System.out.println(obj1.priDef); throws error, private varaiable
        System.out.println(obj1.defPub);
        System.out.println(obj1.protectPub);
        System.out.println(obj1.pubPub);


    }
}

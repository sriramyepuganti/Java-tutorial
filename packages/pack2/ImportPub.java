package packages.pack2;

import packages.pack1.Pub;

public class ImportPub extends Pub {
    public ImportPub() {
        System.out.println("Message from Import Pub class");
        Pub obj = new Pub();
        obj.showMessage();
        System.out.println(obj.pubPub);
        // System.out.println(obj.protectPub); // can not access protected through object creation
        System.out.println(protectPub); // can access protected through sub class
    }
}

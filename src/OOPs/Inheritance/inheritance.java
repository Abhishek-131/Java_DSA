package OOPs.Inheritance;


import com.sun.security.jgss.GSSUtil;

class SuperClass {
    String superField = "Super class field";

    void superMethod() {
        System.out.println("Super class method");
    }
}

class SubClass extends SuperClass {
    String subField = "Subclass field";

    void subMethod() {
        System.out.println("Sub class Method");
    }
}

public class inheritance {
    public static void main(String[] args) {
        SubClass subclass = new SubClass();
        subclass.subMethod();
        System.out.println(subclass.subField);

        System.out.println("_________________");

        subclass.superMethod();
        System.out.println(subclass.superField);
    }
}

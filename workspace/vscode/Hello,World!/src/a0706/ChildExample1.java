public class ChildExample1 {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
           Parent.field2 = "data2"; // 불가능
           parent.method3(); // 불가능
         */

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}

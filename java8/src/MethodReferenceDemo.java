public class MethodReferenceDemo {

    public static void main(String[] args) {
        CustomFunctionalInterface functionalInterface = Test::testImplementation;
        functionalInterface.singleAbstractMethod();
    }
}

class Test {
    static void testImplementation() {
        System.out.println(" implementation");
    }
}

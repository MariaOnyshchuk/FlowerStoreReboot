package ua.edu.ucu;

@FunctionalInterface
public interface TestFunctionalInterface {
    public boolean testMethod(String a);
    default void testDefaultMethod(){
        System.out.println("Default method");
    }
    static void testStaticMethod(){
        System.out.println("Static method");
    }

}

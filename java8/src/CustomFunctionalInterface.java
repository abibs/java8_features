
@FunctionalInterface
// Even if you are not adding this annotation with one abstract java treated as functional interface
//Basically @FunctionalInterface provides additional verification for functional interface.
public interface CustomFunctionalInterface {

    void singleAbstractMethod();

    default void  printOne(){
        System.out.println("One");
    }

    default void  printTwo(){
        System.out.println("Two");
    }

}

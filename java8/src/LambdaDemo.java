import java.util.function.BiConsumer;

public class LambdaDemo {

    public static void main(String[] args) {

        //Addition of two numbers

        /* Before Java 8*/
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.add(1,2);

        /*JAVA 8*/
        BiConsumer<Integer,Integer>  biConsumer =(a,b) -> System.out.println(a+b);
        biConsumer.accept(1,2);


    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
}

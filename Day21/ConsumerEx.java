package Day21;

/*
Built in Functional Interfaces

2. CONSUMER
    - An interface which takes input and do something with it and return nothing
    - consumer<T>
    - Input->Action->return Nothing
    Ex: Print number, update value;

    - Methods present -> accept();
 */

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args){

        Consumer<String> printString = (s) -> System.out.println(s);
        Consumer<String> printName = (s) -> System.out.println("Name: " + s);
        printName.accept("From Consumer");
        List<String> names = List.of("abc","def","ghi");
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
        Consumer<String> combined = printString.andThen(printName);
        combined.accept("Chaining Example");
    }
}
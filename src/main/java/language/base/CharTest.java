package language.base;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CharTest {

    public static void main(String[] args) throws Exception{


        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(()-> System.out.println("hello"));
    }
}

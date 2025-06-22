public class SimpleRunnableExample {

    public static void main(String[] args){
        Runnable r = () -> System.out.println("Running inside from the runnable...");
        new Thread(r).start();
    }
}

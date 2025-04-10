public class MyPrinter implements Runnable {

    String text;
    int id;

    public MyPrinter(String text, int id) {
        this.text = text;
        this.id = id;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            System.out.println("MyPrinter2, id:"+id+", text:"+text);
        }
    }
}

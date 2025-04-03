public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public static MyException showExc() {
        return new MyException("Access denied");
    }

    public void printExc() throws MyException {
        System.out.println(this.getMessage());
        throw this;
    }
}

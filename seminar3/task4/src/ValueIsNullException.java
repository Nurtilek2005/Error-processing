public class ValueIsNullException extends Exception {
    public ValueIsNullException() {
        super("Элемент внутри массива пустой!");
    }

    public ValueIsNullException(String message) {
        super(message);
    }
}
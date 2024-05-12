package ch.zhaw.iwi.devops.Sonar;

public class SimpleOperation {
    // Privater Konstruktor, um die Instanziierung zu verhindern
    private SimpleOperation() {
        throw new IllegalStateException("Utility class");
    }

    public static int doubleNumber(int number) {
        return number * 2;
    }
}
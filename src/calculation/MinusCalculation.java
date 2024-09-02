package calculation;

public class MinusCalculation extends Calculation {
    @Override
    public String calculate(String firstElement, String secondElement) {
        if (secondElement.startsWith("\"")) {
            return firstElement.replace(secondElement.replace("\"",""), "");
        }
        throw new IllegalArgumentException("Второй операнд должен быть строкой");
    }
}

package utils;

public class StringCalculatorUtils {
    public boolean isValidArgument(String str) {
        str = str.trim();
        if (str.matches("\"[^\"]{1,10}\"\\s*[+\\-*/]\\s*(\"[^\"]{1,10}\"|\\d{1,2})")) {
            return true;
        }
        throw new IllegalArgumentException("Некорректный формат ввода");
    }

    public String[] prepareString(String str) {
        String[] elements = str.split(" \\s*[+\\-*/]\\s* ");
        String firstElement = elements[0].replace("\"", "").trim();
        String operation = str.substring(elements[0].length(), str.length() - elements[1].length()).trim();
        String secondElement = elements[1].trim();
        return new String[] {firstElement, operation, secondElement};
    }
}

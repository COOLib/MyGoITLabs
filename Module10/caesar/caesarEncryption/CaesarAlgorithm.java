package caesar.caesarEncryption;

public class CaesarAlgorithm {

    private static int step = 15;
    private static int lettersAmount = 26;
    private MyIntCharStringTransformer transform = new MyIntCharStringTransformer();

    // Кодирую строку методом Цезаря
    public String encoding(String string) {

        char[] chars = string.toCharArray();
        int[] charsToInt = transform.charsToInts(chars);
        int[] cases = transform.getUpperCases(chars);
        for (int i = 0; i < chars.length; i++) {
            charsToInt[i] = (charsToInt[i] + step) % (lettersAmount);
        }
        chars = transform.intsTochars(charsToInt);
        String myNewString = transform.makeString(chars).toLowerCase();
        return myNewString;
    }

    // Дескодирую закодированную мной строку методом Цезаря
    public String decoding(String string) {

        char[] chars = string.toCharArray();
        int[] charsToInt = transform.charsToInts(chars);
        for (int i = 0; i < chars.length; i++) {
            if (charsToInt[i] < ('a')) {
                charsToInt[i] = (charsToInt[i] - step + lettersAmount) % lettersAmount;
            } else {
                charsToInt[i] = (charsToInt[i] - step) % lettersAmount;
            }
        }
        chars = transform.intsTochars(charsToInt);
        String myNewString = transform.makeString(chars);
        return myNewString;
    }


}

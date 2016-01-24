package caesar.caesarEncryption;

public class MyIntCharStringTransformer {

    private int[] cases;

    public int[] getCases() {
        return cases;
    }

    // Записываю в массив все случаи попадания символов в диапазон больших и маленьких букв.
    // Остальные символы оставляю в массиве без изменений
    public int[] getUpperCases(char[] array) {

        cases = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                cases[i] = 1;
            } else if (Character.isLowerCase(array[i])) {
                cases[i] = 2;
            } else {
                cases[i] = array[i];
            }
        }
        return cases;
    }

    // Преобразую символьный массив в числовой для дальнейшего его закодирования
    public int[] charsToInts(char[] myChars) {

        int[] myInts = new int[myChars.length];
        for (int i = 0; i < myChars.length; i++) {
            if (Character.isUpperCase(myChars[i])) {
                myInts[i] = (myChars[i] - (int) 'A');
            } else if (myChars[i] >= 'a' && myChars[i] <= 'z') {
                myInts[i] = (myChars[i] - (int) 'a');
            } else {
                myInts[i] = myChars[i];
            }
        }
        return myInts;
    }
    // Преобразую полученный числовой массив обратно в символьный
    public char[] intsTochars(int[] myInts) {

        char[] myChars = new char[myInts.length];
        for (int i = 0; i < myChars.length; i++) {
            if (cases[i] == 1) {
                myChars[i] = (char) (myInts[i] + ((int) 'A'));
            } else if (cases[i] == 2) {
                myChars[i] = (char) (myInts[i] + ((int) 'a'));
            } else {
                myChars[i] = (char) cases[i];
            }
        }
        return myChars;
    }
    // Собираю строку из полученного символьного массива
    public String makeString(char[] myChars) {

        StringBuilder myString = new StringBuilder();
        for (char i : myChars) {
            myString.append(i);
        }
        String myNewString = myString.toString();
        return myNewString;
    }
}

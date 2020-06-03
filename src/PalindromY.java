public class PalindromY {

    boolean isPalindrom(int[] array) {
        int compare = array.length / 2;
        for (int i = 0; i < compare; i++) {
            if (array[i] != array[array.length - 1 - i])
                return false;
        }
        return true;
    }
}


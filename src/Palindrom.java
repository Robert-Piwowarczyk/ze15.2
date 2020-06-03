import java.util.Arrays;

class Palindrom {
    public static void main(String[] args) {
        int[] notPalindrom = {1, 2, 3, 4, 5,};
        int[] palindrom = {1, 2, 3, 5, 3, 2, 1};


        PalindromY palindromY = new PalindromY();
        boolean isPalindromY = palindromY.isPalindrom(palindrom);
        if (isPalindromY)
            System.out.println("tablica " + Arrays.toString(palindrom) + " jest palindromem");

        boolean isPalindromN = palindromY.isPalindrom(notPalindrom);
        if (isPalindromN)
            System.out.println("tablica " + Arrays.toString(notPalindrom) + " nie jest palindromem");
    }
}
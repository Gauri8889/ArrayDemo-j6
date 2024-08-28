public class CountTheVowel {
    // WAP to count the vowel in the array
// arr = {V,a, I, b,H, A, V, ,D, i, w, a, n}
    public static void main(String[] args) {
        char[] array = {'V', 'a', 'I', 'b', 'H', 'A', 'V', 'D', 'i', 'w', 'a', 'n'};
        int count = 0;
        for (int index = 0; index < array.length; index++) {

            char temp = array[index];
            if (temp >= 65 && temp <= 90) {
                temp = (char) (temp + 32);
            }
            if (temp == 'a' ||
                    temp == 'e' ||
                    temp == 'i' ||
                    temp == 'o' ||
                    temp == 'u') {
                count++;

            }
        }
    }
}
// WAP to count the vowel in the array
// arr = {V,a, I, b,H, A, V, ,D, i, w, a, n}
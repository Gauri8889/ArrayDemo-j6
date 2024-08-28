public class CharArrayCountingVowels {
    public static void main(String[] args){
        char[] array = {'v', 'a', 'i', 'b', 'h', 'a', 'v'};
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 'a' ||
                    array[index] == 'e' ||
                    array[index] == 'i' ||
                    array[index] == 'o' ||
                    array[index] == 'u' ){
                count++;

            }
        }
        System.out.println("Number of vowel in give array = " + count);
    }
}

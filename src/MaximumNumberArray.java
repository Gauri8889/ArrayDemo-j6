// Write a program
public class MaximumNumberArray {
    public static void main(String[] args){
     int[] numbers = {1,2,3,4,5,56,1,2,1,3,3,6,8,7,1,1,2,1};
     int count = 0;
     int NumberArray = 0;
     for(int i = 0; i < numbers.length; i++) {
         count = 0;
         for (int j = 0; j < numbers.length; j++) {
             if(numbers[i] == numbers[j]) {
                 count++;
             }
         }
         if(NumberArray <= count){
             NumberArray = count;
             System.out.println("NumberArray chenged");
             System.out.println("number["+ i +"] = " + numbers[i]);
         }
     }
        System.out.println("NumberArray = " + NumberArray);
    }
}

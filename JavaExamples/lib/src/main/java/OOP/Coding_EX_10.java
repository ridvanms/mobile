package OOP;

public class Coding_EX_10 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,8};

        // Calculate the sum of all elements
        int sum = 0;
        for(int i = 0; i< numbers.length;i++){
            sum += numbers[i];

        }
        //calculate the average value
        double average =(double) sum/numbers.length;
        System.out.println(average+" is the average!");
    }
}

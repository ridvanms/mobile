package OOP;

public class Coding_EX_7 {
    public static void main(String[] args) {
        int[] nums = {5,7,2,4,9};
        int even_counter = 0;
        int odd_counter = 0;

        for(int i = 0; i < nums.length;i++){
            int current_num = nums[i];

            if(current_num % 2 == 0){
                even_counter++;
            }else{
                odd_counter++;
            }
        }
        System.out.println("The event numbers: "+ even_counter);
        System.out.println("The odd numbers: "+ odd_counter);
    }
}

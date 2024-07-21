package OOP;

public class Coding_EX_6 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,-5,4};
        int[] arr2 = {1,4,-5,-2};
        String result = "";

        System.out.println("-----");

        for(int i = 0;i < arr1.length;i++){

            int num1 = arr1[i];
            int num2 = arr2[i];

            result += (num1 * num2)+" ";
        }
        System.out.println(result);
    }
}

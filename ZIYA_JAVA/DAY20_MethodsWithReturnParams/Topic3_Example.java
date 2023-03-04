package ZIYA_JAVA.DAY20_MethodsWithReturnParams;

public class Topic3_Example {

    // write a method where it gets array of int as input parameter and returns to the max number in the array

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,87,890,90,13,24,43};
        System.out.println("The max value is: "+MaxNumber(numbers));

        System.out.println("The other way of printing it: "+ MaxNumber(numbers));

    }
    //method starts here
    public static int MaxNumber(int[] arr){
        int max = arr[0];
        for (int a: arr){
            if (max<a){
                max=a;
            }
        }
        return max;
    }
}

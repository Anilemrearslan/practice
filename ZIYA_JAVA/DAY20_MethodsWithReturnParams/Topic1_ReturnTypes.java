package ZIYA_JAVA.DAY20_MethodsWithReturnParams;

public class Topic1_ReturnTypes {

    public static void Count(int[] name){

        System.out.println("The Count of items in the array is: "+name.length);

        int[] name2 ={2,3,4};
        Sum(name2);
    }

    public static void Sum(int[] name1){

        int sum=0;
        for(int a: name1){
            sum = sum+a;
        }
        System.out.println("The sum of all the items in the array is: "+sum);

    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        Count(arr);
        Sum(arr);
    }

}

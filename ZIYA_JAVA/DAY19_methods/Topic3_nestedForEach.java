package ZIYA_JAVA.DAY19_methods;

public class Topic3_nestedForEach {
    public static void main(String[] args) {
        int [][][] array3={ { {56} , {78,98,9,23}  ,{93,24,56}} , { {89,90,23} } ,{ {87,45,6} , {0,1} }, { {1,2} ,{45,6} } };

        for(int[][]arr2 : array3){
            for(int[]arr1:arr2){
                for(int a: arr1){
                    System.out.println("The values: "+a);
                }
            }
        }
    }
}

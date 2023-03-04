package ZIYA_JAVA.DAY20_MethodsWithReturnParams;

public class Topic2_ReturnType1 {
    //public            static          void            main            (String [] args)
    //access_modifier   specifier       return_type     Method_name       (parameter)
    public static String Name(int a, int b){

        if (a>b){
            return "Ozlem";
        }else if(a==b){
            return "Anil";
        }else{
            return "Gizem";
        }
    }

    public static void main(String[] args) {
        String name = Name(5,5 );
        String lahmacun = Name(-97,-737);
        String lahmacun2 = Name(-977,-737);
        System.out.println("The name is: "+name);
        System.out.println("The name is: "+lahmacun);
        System.out.println("The name is: "+lahmacun2);


    }


}

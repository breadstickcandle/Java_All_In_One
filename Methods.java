public class Methods {
    public static void main(String... args){
        //A METHOD IS A WAY THAT YOU CAN TAKE CODE AND PUT IT INTO ITS OWN CONTAINER AND REUSE, ETC...
        //IN JAVA, ALL CODE IS INSIDE OF METHOD. E.G. MAIN IS THE METHOD THAT GETS EXECUTED WHEN YOU RUN.

        int sum = addNumbers(4, 60);
        //SUM = VARIABLE
        //addNumbers IS A METHOD CREATED BELOW, ADDING 4 AND 60
        System.out.println(sum);
    }

    public static int addNumbers(int num1, int num2){
        //PUBLIC = SECURITY MODIFIER (DETERMINES WHAT CAN ACCESS)
        //STATIC = METHOD BELONGS TO APP CLASS; IF YOU'RE MAKING A METHOD NEXT TO MAIN METHOD, YOU HAVE TO PUT STATIC.
        //INT = RETURN TYPE
        //(NUM1, NUM2) = PARAMETERS YOU CAN INPUT.

        return num1 + num2;
    }
}
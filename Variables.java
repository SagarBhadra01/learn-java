public class Variables {
    public static void main(String[] args) {
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        //final variable    
        final int myFinalNum = 10;
        //myFinalNum = 11; // will generate an error because we cannot change the value of a final variable
        System.out.println(myFinalNum);

        //multiple variables
        int x = 5, y = 6, z = 50;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //variable naming rules
        int _myVar = 1;      // Underscore is allowed
        int $myVar = 2;      // Dollar sign is allowed
        //int 2myVar = 3;    // Not allowed: cannot start with a digit
        int myVar2 = 4;      // Digits are allowed after the first character    
        System.out.println(_myVar);
        System.out.println($myVar);
        System.out.println(myVar2);

        //one value to multiple variables
        int a = 10, b = 20, c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    

    }
}
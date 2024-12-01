package wrapperclass;

public class Wrapperclass {
    // premetive data type
    /*
     * int  | Integer
     * char  | Charactor
     * boolean | Boolean
     * long | Long
     * double | Double
     * short | Short
     */


    public static void main(String[] args) {
//        int number = 10;
//        Integer wrapperNumber = number;
//        System.out.println(wrapperNumber);

//        String number = "123";
//        int convertInt = Integer.parseInt(number);
//        System.out.println(convertInt);
//
        Integer number = Integer.valueOf(10);
        String converts = number.toString();
        System.out.println(converts);
    }
    
}

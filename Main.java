 
 interface PaymentMethod{
    static void pay(int amount , int number){
        System.out.println("your payment pay amount "+amount);
        System.out.println("pay number "+number);
    }
    static void check(int amount , int date , boolean active){
        System.out.println("total amout "+amount);
        System.out.println("date "+date );
        System.out.println("is active "+active);
    }

 }

 interface AttachPayment{
    public void add(int port);
 }
 class web implements AttachPayment{
    @Override
    public void add(int port){
        System.out.println("add in "+port);
    }
 }


public class Main {
   public static void main(String[] args) {
    web w = new web();
    PaymentMethod.pay(10000,12334);
    PaymentMethod.check(1000 , 23 , true);
    w.add(8080);
   } 
}

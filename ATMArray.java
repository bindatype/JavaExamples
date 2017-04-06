import java.util.*;

public class ATMArray {
  public static void main (String[] args) {
  
    ArrayList<ATM> atms = new ArrayList<ATM>();
    
    atms.add(new ATM(100,300) );
    atms.add(new ATM(10,30) );
    atms.add(new ATM(200,200) );
    atms.add(new ATM(400,400) );

    System.out.println(atms.get(0).getSavingsBalance() );
    System.out.println(atms.get(1).getSavingsBalance() );
    System.out.println(atms.get(2).getSavingsBalance() );
    System.out.println(atms.get(3).getSavingsBalance() );



  }
}

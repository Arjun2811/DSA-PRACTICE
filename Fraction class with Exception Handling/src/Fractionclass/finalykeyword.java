package Fractionclass;

public class finalykeyword {

public static void main(String[] args) {
    

    Fraction f1= new Fraction(10, 20);
    try{
    f1.setnumerator(2);
    }
    catch(Exception e){
System.out.println("you can't set numerator as 0");
    }
   finally{
        System.out.println("final keywoword is used");
   }
    
}
}

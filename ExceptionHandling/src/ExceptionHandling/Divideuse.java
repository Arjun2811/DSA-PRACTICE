package ExceptionHandling;

public class Divideuse {



    public static void main(String[]args)
    {
        int i=0;
        Divide d1= new Divide();
        try{
        d1.setnumerator(1);
        d1.setdenominator(0);
        i++;
        }
//         catch(ZeronumeratorException e)
//         {
//             System.out.println("you cant put numerator as 0");
//         }

//         catch(ZeroDenominatorException e){
// System.out.println("You cant put denominator as 0");
//         }
       catch(Exception e)
       {
        System.out.println("you cant put the values as 0");
       }
        System.out.println(d1.getnumerator()+""+"/"+d1.getdenominator());
System.out.println(i);
    }
}

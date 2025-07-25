package Polynomialclass;

public class Polynomialuse {

public static void main(String[]args){
    Polynomial p1= new Polynomial();
    p1.setcoffiecient(2, 3);
    p1.setcoffiecient(3, 4);
    Polynomial p2= new Polynomial();
    p2.setcoffiecient(1,2 );
    p2.setcoffiecient(3,4);
  
    Polynomial p3=p1.multiply(p2);
    p3.print();
}

}

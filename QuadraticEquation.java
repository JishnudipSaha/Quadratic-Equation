import java.util.*;
class QuadraticEquation
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b and c where the equation is ax^2+bx+c=0");
        System.out.println("Enter the vlue of a which is a coeficient of x^2: ");
        double a=sc.nextDouble();
        System.out.println("Enter the vlue of b which is a coeficient of x: ");
        double b=sc.nextDouble();
        System.out.println("Enter the vlue of c which is a constant term: ");
        double c=sc.nextDouble();
        double discri=(b*b - 4*a*c);
        if(discri > 0)
        {
            double r1= (-b+(Math.sqrt(discri)))/2*a;
            int a1=(int)r1;
            double r2= (-b-(Math.sqrt(discri)))/2*a;
            int a2=(int)r2;
            //System.out.println("the roots are: "+"x="+(int)r1+" and "+"x="+(int)r2);
            System.out.println("The solution is:");
          //  System.out.println(a+ "x^2" + "+" + "("+"("+r1+")"+"+" "("+r2+")"+")""+"c "=" + "0" );
            System.out.println((int)a+ "x^2"+"+"+"("+"("+Math.abs(a1)+")"+"+"+"("+Math.abs(a2)+")"+")"+"x"+"+"+(int)c+"="+0);
            System.out.println("(x"+"+"+Math.abs(a1)+")"+"(x"+"+"+Math.abs(a2)+")"+"="+"0");
            System.out.println("The roots are:");
            System.out.println("x"+"="+a1+"and"+"x"+"="+a2);
        }
        else if(discri == 0)
        {
            double r1=-b/2*a;
            int y=(int)r1;
            //System.out.println("the roots are: "+"x="+(int)r1+" and "+"x="+(int)r1);
            System.out.println("The solution is:");
            System.out.println((int)a+ "x^2"+"+"+"("+"("+Math.abs(y)+")"+"+"+"("+Math.abs(y)+")"+")"+"x"+"+"+(int)c+"="+0);
            System.out.println("(x"+"+"+Math.abs(y)+")"+"(x"+"+"+Math.abs(y)+")"+"="+"0");
            System.out.println("The roots are:");
            System.out.println("x"+"="+y+"and"+"x"+"="+y);
        }
        else
        {
            //System.out.println("There are no real roots");
        }
//         System.out.println("The roots are:");
//         System.out.print()
        
    } 
}
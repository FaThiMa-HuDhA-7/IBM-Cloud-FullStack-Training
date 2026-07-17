// package Java;
public class first{
    public static void main(String args[]){
        int a=1;
        int b=3;
        String name="Fathima Hudha";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.substring(1,6));
        
        System.out.println("Sum: " + (a + b));
        System.out.println("Diff: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
        
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a<b){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("a is equal b");
        }

        System.out.print("Hi Fathima Hudha");
        System.out.println("Hi FHF");

    }
}
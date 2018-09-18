import java.util.*;
public class ArrayException{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        try{
            System.out.println("Enter the length of Array1");
            int length1=input.nextInt();
            int array[]=new int[length1];
            array=null;
            array[1]=0;
            array[length1+1]=0;

        }
        catch (NegativeArraySizeException ne){
            System.out.println("Negative Array size Entered");
        }
        catch (IndexOutOfBoundsException ie){
            System.out.println("Array Index gone out of Range");
        }
        catch (NullPointerException npe){
            System.out.println("Array points to Null pointer");
        }
    }
}
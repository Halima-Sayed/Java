package class9;

public class E5Arrays {
    public static void main(String[] args) {
        /*
        Write a loop that starts from 0 it goes till number 5 and print
        only even numbers
         {a,b,c,d,e} -> a c e
        Create an array of chars, and you have to print all the chars on the even indexes
         */

        char[] chars = {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < chars.length; i+=2) {
            //if(i %2==0)

                System.out.println(chars[i]);
            }
        }
    }

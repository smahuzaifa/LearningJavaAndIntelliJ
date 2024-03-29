package test;

public class StringWork {
    public static void main(String[] args) {
        String s1 = "ABC"; //This is string literal
        String s2 = "LSQ";
        String s3 = new String("Welcome"); //This is string object
        String s4 = new String("Welcome Back Again");
        String[] s5= s4.split(" ");
        //This will split the array at mentioned character
        System.out.println(s5[0]);
        System.out.println(s5[1].trim());
        //This will trim any space between words
        System.out.println(s5[2]);
        System.out.println();
        for(int i=0;i<s4.length();i++)
        {
            System.out.println(s4.charAt(i));
            //This will print each individual character of the array
        }
        System.out.println();
        for(int i= s4.length()-1;i>=0;i--)
        {
            System.out.print(s4.charAt(i)+" ");
            //This will print the string array in reverse
        }
        System.out.println();

        int[] a = {1,2,3,4,5,6};
        int[] b = new int[1];
        b[0]=2;
        System.out.println();
        System.out.println(b[0]);
        System.out.println();
        for(int i=a.length-1;i>=0;i--) //Length-1 is used here because array index before its actual size must be
            // used as we start from 0
        {
            System.out.print(a[i]+" ");
            //This will print the integer array in reverse
        }
    }
}



import java.util.*;


public class Main {
    public static void main(String[] args) {
        //my string
        String name = "John Doe";
        String fullname = "Sam";
        //taking string from user
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("your name is:" + input);

        //length
        String name1 = "John Doe";
        String fullname1 = "Sam";
        String fn = name1 + " " + fullname1;
        System.out.println(fn.length());

        //charAt
        for (int i = 0; i < fn.length(); i++) {
            System.out.println(fn.charAt(i));
        }

        //compare
        String n = "james";
        String m = "bond";
        if(n.compareTo(m)==0){
            System.out.println("both are equal");
        }else {
            System.out.println("both are not equal");
        }

        // sub string
        String sen = "My name is Samir";
        String name12 = sen.substring(11,16);
        System.out.println(name12);

        //stringbuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        //chat at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert at index 0
        sb.insert(0,'S');
        System.out.println(sb);

        //insert at a specific location
        sb.insert(5,'T');
        System.out.println(sb);

        //delete the extra
        sb.delete(0,1);
        System.out.println(sb);

        //append
        sb.append(" World");
        System.out.println(sb);
    }
}
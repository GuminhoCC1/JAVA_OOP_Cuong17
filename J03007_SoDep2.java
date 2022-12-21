
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J03007_SoDep2 {
    public static boolean thuanNghich(String s){
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    public static boolean so8(String s){
        if(s.charAt(0)-'0'!=8) return false;
        if(s.charAt(s.length()-1)-'0'!=8) return false;
        return true;
    }
    public static boolean chia10(String s){
        long sum=0;
        
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        if(sum%10!=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s=sc.nextLine();
            if(thuanNghich(s) && so8(s) && chia10(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}

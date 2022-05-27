

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print( "Введіть текст: ");
        String str = sc.nextLine();

        String subStr_all[] = str.split( " ");
        for (int i = 0; i < subStr_all.length; i++) {
            if(subStr_all[i].length()==0){
                continue;
            }else{
                System.out.print(subStr_all[i].substring(0, 1)+ " ");
            }
        }
    }

}

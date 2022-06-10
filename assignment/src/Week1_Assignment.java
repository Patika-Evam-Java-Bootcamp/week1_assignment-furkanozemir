import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Week1_Assignment {
    final static String codeStr ="code";

    public static String findMyString(String[] strArr){
        String returnStr="Aranan değer bulunamadı.";
        for(String str : strArr){
            if(str.contains(codeStr)) returnStr="Tanımlı value yu içeren String deger : " + str;
            break;
        }
        return returnStr;
    }

    public static void main(String[] args) {
        System.out.println("Belirlediğim değer code dir.");
        Scanner sc = new Scanner(System.in);
        String[] strArr = {};
        int adet=0;
        int flag=-1;
        while(flag<0){
            System.out.println("Kaç adet String girişi yapacaksınız ?");
            adet = sc.nextInt();
            if(adet>=5){
                strArr = new String[adet];
                flag = 1;
            }else{
                System.out.println("Girmek istediğiniz String adedi 5 veya 5 ten büyük olmalıdır.");
            }
        }
        for(int i =0;i<adet;i++){
            System.out.println(i+1 +". stringi giriniz.");
            strArr[i]=sc.next();
        }

        sc.close();
        System.out.println(findMyString(strArr));

    }
}

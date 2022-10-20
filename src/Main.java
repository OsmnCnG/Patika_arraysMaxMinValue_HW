
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array= new int[]{10,2,15,27,8,-50,-346,67};
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        int sayi=keyboard.nextInt();
        System.out.println("Girilen sayi:"+ sayi);

        Arrays.sort(array);

        for ( int i=0; i<array.length-1; i++)  {
            if(sayi>MaxMin.max(array)){
                System.out.println("Sayıdan küçük en yakın sayı:" + MaxMin.max(array));
                System.out.println("Sayıdan büyük en yakın sayı: NONE");
                break;
            }
            else if(sayi<MaxMin.min(array)){
                System.out.println("Sayıdan küçük en yakın sayı: NONE");
                System.out.println("Sayıdan büyük en yakın sayı:"+MaxMin.min(array));
                break;
            }
            else if(sayi>array[i] && sayi<array[i+1]){
                System.out.println("Sayıdan küçük en yakın sayı:"+ array[i]);
                System.out.println("Sayıdan büyük en yakın sayı:"+ array[i+1]);
                break;
            }

        }


    }
}
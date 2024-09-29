import java.util.Arrays;
import java.util.Scanner;

public class Bai66 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num;
        System.out.println("Nhap kich thuoc mang: ");
        num = myObj.nextInt();
        int nums[] = new int[num];
        System.out.println("Nhap cac phan tu mang: ");
        int sum = 0;
        for (int i = 0; i < num; ++i){
            nums[i] = myObj.nextInt();
            sum += nums[i]; 
        }
        System.out.println("Chuoi sau khi sap xep: ");
        Arrays.sort(nums);
        for (int a : nums){
            System.out.print(a);
        }
        System.out.println("\nTong chuoi la: " + sum);
        System.out.println("Trung binh day la: " + sum/num);
        myObj.close();
    } 
}

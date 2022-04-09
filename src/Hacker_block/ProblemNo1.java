package Hacker_block;

import java.util.*;
public class ProblemNo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int space = n-1;
        int star = 1;
        int row_val=1;
        while(row <= 2*n-1){
            int i = 1;
            while(i <= space ){
                System.out.print("\t");
                i++;
            }
            int j = 1;
            int count = row_val;
            while(j <= star){
                
                System.out.print(count+"\t");
                count++;
                j++;
            }
            count=count-2;
            while(count>=row_val){
                 System.out.print(count+"\t");
                count--;
              
            }
            
            if(row < n){
                space--;
                star++;
                row_val++;
            }
            else{
                star--;
                space++;
                row_val--;
            }

            System.out.println();
            row++;
        }
    }
}

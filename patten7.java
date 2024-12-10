import java.util.*;

public class patten7 {
    public static void main(String[] args) {
        int i,j,k,space,star;
        System.out.println("Enter the number of stars:");
        Scanner str = new Scanner(System.in);
        k = str.nextInt();
        star = (k/2)+1;
        space = 1;
        for(i=1; i<=k; i++) {
            for(j=1; j<=star; j++) {
                System.out.print("*\t");
            }
            for(j=1; j<=space; j++) {
                System.out.print("\t");
            }
            for(j=1; j<=star; j++) {
                System.out.print("*\t");
            }
            if(i<= k/2) {
                star--;
                space+=2;
            } else {
                star++;
                space-=2;
            }
            System.out.println();
    

    }
}
}


// *       *       *               *       *       *
// *       *                               *       *
// *                                               *
// *       *                               *       *
// *       *       *               *       *       *
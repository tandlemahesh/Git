import java.util.Scanner;

public class patten6 {
    public static void main(String[] args) {
        int i,j,k,spaces,stars;
        System.out.println("enter the number of stars:");
        Scanner str = new Scanner(System.in);
        k = str.nextInt();
        spaces = k/2;
        stars = 1;
        for(i=1; i<=k; i++) {
            for(j=0; j<=spaces; j++) {
                System.out.print("\t");
    }
            for(j=1; j<=stars; j++) {
                System.out.print("*\t");
            }
    if(i<=k/2){
        spaces--;
        stars += 2;
    }
    else{
        spaces++;
        stars -= 2;
    }
    System.out.println();
}
    }
}



//                 *
//         *       *       *
// *       *       *       *       *
//         *       *       *
//                 *

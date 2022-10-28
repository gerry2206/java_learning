import java.util.*;

public class firstSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     if(a == b){
    //         System.out.println("Equal");
    //     }
    //     else if (a > b ){
    //         System.out.println("Greater");
    //     }
    //     else{
    //         System.out.println("Lesser");
    //     }

    // }
    switch(a){
    case 1: System.out.println("Hello");
    break;

    case 2: System.out.println("Nameste");
    break;

    case 3: System.out.println("Bonjour");
    break;

    case 4: System.out.println("Invalid Button");
    }
 }
}
import java.util.Scanner;

public class ActivitySuggestion {
    public static void main(String[] args) {
        Scanner inp = new Scanner((System.in));
        System.out.print("How many degrees is the weather: ");
        double degree= inp.nextDouble();
        if(degree<5)
        System.out.println("Go to skiing");
        if(degree>5 && degree<15)
        System.out.println("Go to cinema");
        if(degree>10 && degree<25)
        System.out.println("Go to picnic");
        if(degree>25)
        System.out.println("Go to swimming");
        
    }
}

import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month, day;
        System.out.print("Enter your date of birth: ");
        day = inp.nextInt();
        System.out.print("Enter your month of birth: ");
        month = inp.nextInt();
        if ((month == 12 && day >= 22) || (month == 1 && day <= 21))
            System.out.print("Your horoscope is: Capricorn ");
        else if ((month == 1 && day >= 22) || (month == 2 && day <= 19))
            System.out.print("Your horoscope is: Acquarius ");
        else if ((month == 2 && day >= 20) || (month == 3 && day <= 20))
            System.out.print("Your horoscope is: Pisces ");
        else if ((month == 3 && day >= 21) || (month == 4 && day <= 20))
            System.out.print("Your horoscope is: Aries ");
        else if ((month == 4 && day >= 21) || (month == 5 && day <= 21))
            System.out.print("Your horoscope is: Taurus ");
        else if ((month == 5 && day >= 22) || (month == 6 && day <= 22))
            System.out.print("Your horoscope is: Gemini ");
        else if ((month == 6 && day >= 23) || (month == 7 && day <= 22))
            System.out.print("Your horoscope is: Cancer ");
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
            System.out.print("Your horoscope is: Leo ");
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
            System.out.print("Your horoscope is: Virgo ");
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
            System.out.print("Your horoscope is: Libra ");
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
            System.out.print("Your horoscope is: Scorpio ");
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
            System.out.print("Your horoscope is: Sagittarius ");
        else {
            System.out.println("Entered invalid value");
        }
    }
}

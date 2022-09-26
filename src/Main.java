public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Your Birth Number!");
        int bNum = 13;

        if (bNum >= 1 && bNum <= 12)
        {
            System.out.println("Your birth number is " + bNum);
        }
        else
        System.out.println("You entered an incorrect number");
    }
}
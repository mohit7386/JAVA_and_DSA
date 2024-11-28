public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Here we are creating a loop
            if (i == 4) {
                break; // here we are using the break statement jo loop ko terminate kar deta hai aur
                       // wahin pe
            }
            System.out.println(i);
        }
    }

}
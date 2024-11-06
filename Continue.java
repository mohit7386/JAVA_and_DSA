public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Here we are creating a loop
            if (i == 3) {
                continue; // here we are using the continue statement which helps to skip the current
                          // iteration and move to the other iteration. So, here it skips the true
                          // condition of the statement and move to the other iteration
            }
            System.out.println(i);
        }
    }

}

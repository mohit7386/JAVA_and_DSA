public class Operator_Precedence {
    public static void main(String[] args) {
        int num = 6 * 5 - 12 / 6; /*
                                   * So here Operator Precedence is (*,/,%) and (+,-) higher precedence is * then
                                   * / then
                                   * % and so on.....
                                   */
        System.out.println(num);
        int num2 = 6 * 5 / 5 + 4 - 2;
        /*
         * Here we are following the ASSOCIATIVITY rule which means when two or more
         * operator having same precedence are align then we need to follow the left to
         * right calculation same here we are seeing the * and / operator of same
         * priority then here system follows left to right calculation
         */
        System.out.println(num2);
    }

}

public class pattern13 {
    public static void main(String[] args) {
        //edcba
        //dcba
        //cba
        //ba
        //a
        int n=5;
        for (int i=5;i>=1;i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print((char) (j + 96));
            }
            System.out.println();
        }
    }
}

public class pattern11 {
    public static void main(String[] args) {
        //abcde
        //bcde
        //cde
        //de
        //e
        int n=5;
        for (int i=1;i<=n;i++) {
            for (int j = i; j <= n; j++) {
                System.out.print((char) (j + 96));
            }
            System.out.println();
        }
    }
}

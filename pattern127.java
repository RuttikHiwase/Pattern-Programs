public class pattern127 {
    public static void main(String[] args) {
        /*
                 E
                dEd
               CdEdC
              bCdEdCb
             AbCdEdCbA
         */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j>=1; j--) {
                if (j % 2 != 0) {
                    System.out.print((char) (n-j + 64+1));
                } else
                    System.out.print((char) (n-j + 96+1));
            }
            for (int j = 2; j<=i; j++) {
                if (j % 2 != 0)
                    System.out.print((char) (n-j + 64+1));
                else
                    System.out.print((char) (n-j + 96+1));

            }
            System.out.println();
        }
    }
}

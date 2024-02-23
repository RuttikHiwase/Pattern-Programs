public class pattern143 {
    public static void main(String[] args) {
        /*
         E
        dEd
       CdEdC
      bCdEdCb
     AbCdEdCbA
      bCdEdCb
       CdEdC
        dEd
         E
         */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = n - i + 1; j <= n; j++) {
                if (j % 2 != 0)
                    System.out.print((char) (j + 64));
                else
                    System.out.print((char) (j + 96));
            }
            for (int j = n + 1 - 2; j >= n - i + 1; j--) {
                if (j % 2 != 0)
                    System.out.print((char) (j + 64));
                else
                    System.out.print((char) (j + 96));
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= n; j++) {
                    if (j % 2 != 0)
                        System.out.print((char) (j + 64));
                    else
                        System.out.print((char) (j + 96));
                }

                for (int j = n - 1; j >= i; j--) {
                    if (j % 2 != 0)
                        System.out.print((char) (j + 64));
                    else
                        System.out.print((char) (j + 96));
                }
                System.out.println();
            }
        }
    }
}






public class pattern126 {
    public static void main(String[] args) {
        /*
                E
               EdE
              EdCdE
             EdCbCdE
            EdCbAbCdE
         */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                if (j % 2 != 0) {
                    System.out.print((char) (n-j + 64+1));
                } else
                    System.out.print((char) (n-j + 96+1));
            }
            for (int j = i-1; j>=1; j--) {
                if (j % 2 != 0)
                    System.out.print((char) (n-j + 64+1));
                else
                    System.out.print((char) (n-j + 96+1));

            }
            System.out.println();
        }
    }
}


























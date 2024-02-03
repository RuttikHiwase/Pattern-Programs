public class pattern39 {
    public static void main(String[] args) {


    //eeeee
    // dddd
    //  ccc
    //   bb
    //    a
    int n=5;
    for(int i=5;i>=1;i--) {
        for (int j = i; j < n; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print((char) (i + 96));
        }
        System.out.println();

    }
    }
}

public class pattern10 {
    public static void main(String[] args) {
        //ABCDE
        //ABCD
        //ABC
        //AB
        //A
        int n=5;
        for(int i=5;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j+ 64));
            }
            System.out.println();
        }
    }
}

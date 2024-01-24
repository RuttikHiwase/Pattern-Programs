public class pattern15 {
    public static void main(String[] args) {
        //E
        //DD
        //CCC
        //DDDD
        //EEEEE
        int n=5;
        for(int i =5;i>=1;i--) {
            for (int j = n; j >= i; j--) {
                System.out.print((char) (i + 64));
            }
            System.out.println();
        }
    }
}

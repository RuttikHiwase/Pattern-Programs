import java.security.spec.EdDSAParameterSpec;

public class pattern12 {
    public static void main(String[] args) {
        //EDCBA
        //EDCB
        //EDC
        //ED
        //E
        int n=5;
        for(int i=1;i<=5;i++) {


            for (int j = 5; j >= i; j--) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }
}

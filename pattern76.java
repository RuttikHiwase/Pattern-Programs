public class pattern76 {

    public static void main(String[] args) {
        /* ERROR
                5
			4	9
		3	8	12
	2	7	11	14
1	6	10	13	15


         */
        int n=5;
        int count=n;
        for(int i=n;i>1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print("\t");
            }int c=count--;
            for(int j=n;j>=i;j--)
            {
                System.out.print(c+"\t");
                c+=j;

            }
            System.out.println();
        }
    }
}

public class pattern75 {
    public static void main(String[] args) {
        /*
                 1
			2	6
		3	7	10
	4	8	11	13
5	9	12	14	15

         */
        int n=5;
        int count=1;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print("\t");
            }int c=count;
            for(int j=n;j>=i;j--)
            {
                System.out.print(c+"\t");
                c+=j-1;
            }count++;
            System.out.println();
        }
    }
}

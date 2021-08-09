public class Perfectnumber {
        public static void main(String args[])
        {
            long n, sum=0;
            Scanner a=new Scanner(System.in);
            System.out.print("Enter the number: ");
            n=a.nextLong();
            int i=1;

            while(i <= n/2)
            {
                if(n % i == 0)
                {

                    sum = sum + i;
                } //end of if

                i++;
            } //end of while

            if(sum==n)
            {

                System.out.println(n+" is a perfect number.");
            } //end of if
            else

                System.out.println(n+" is not a perfect number.");
        }
}

/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

        By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/


public class Euler2 {
    public static void main(String[] args) {
        var sum=0;
        var f1=0;
        var f2=1;
        var val=0;
        while(val<4000000){
            val=f1+f2;
            if(val%2==0){
                sum+=val;
            }
            f1=f2;
            f2=val;
        }

        System.out.println(sum);
    }
}
//Correct o/p :4613732
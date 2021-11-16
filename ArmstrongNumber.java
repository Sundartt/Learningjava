package nov16;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int input=153;
          int orgNum,sum, rem;
          orgNum=input;
          sum=0;
          while(input>0)
          {
        	  rem=input%10;
        	  sum=sum+(rem*rem*rem);
        	  input=input/10;
          }
          if(sum==orgNum) {
        	  System.out.println("Given number is armstrong number");
          }
          else
          {
        	  System.out.println("given number is not armstrong number");
          }
          
	}

}

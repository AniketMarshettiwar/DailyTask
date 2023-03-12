class IfElse2
{
	public static void main(String[] args) {
		int a=2,b=4,c=1,big;
		if(a>b)
		{
			if(a>c)
				big=a;
			else 
				big=c;
		}
		else { 
			if(b>c)
				big=b;
			else
				big=c;
		}
		System.out.println("the Biggest Number is "+big);
	}
}
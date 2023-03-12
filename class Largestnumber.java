public class Largestnumber
{
	public static void main(String[] args){
	int a=4,b=5,c=6,d=7,e=8,big;
	if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					if(a>e)
						big=a;
					else 
				  big=e;
		}
	}
}
		if (b>a) {
				if (b>c) {
					if (b>d) {
						if (b>e) 
							big=b;
						else 
							big=e;
						
					}
				}
			}
			if (c>a) {
				if (c>b) {
					if (c>d) {
						if (c>e) 
							big=c;
						else 
							big=e;
						
					}
				}
			}
			if (d>a) {
				if (d>b) {
					if (d>c) {
						if (d>e) 
							big=d;
						else 
							big=e;
						
					}
				}
			}
			if (e>a) {
				if (e>b) {
					if (e>c) {
						if (e>d) 
							big=e;
						else 
							big=d;
						
					}
				}
			}
			System.out.print("The Biggest Number Is = "+big);
		}
		}
		
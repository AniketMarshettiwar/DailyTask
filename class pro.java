class pro
{
	public static void main(string[] args){
	double s1=60,s2=75,s3=63,s4=84,total,per;
	char grade='';

	   total=s1+s2+s3+s4;
	per=total/4.0;
	if(per>85)
	grade='A';
	else
	if(per<85&&per>75)
grade='B';
else if(per>55&&per<75)
	grade='C';
else if(per>35&&per<55)
	grade='D';
else grade='E';
System.out.println("percentage ="+per+"grade ="+grade);

}
	}
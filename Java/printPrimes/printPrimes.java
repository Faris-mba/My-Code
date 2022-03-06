void printPrimes(int max)
{
	for(int a=2;a<=max;a++)
	{
		int v=0;
		for(int b=2;b<=(int)Math.sqrt(a);b++)
			if(a%b==0)
				v=1;
			{
				if(v==0)
					System.out.println(a+" is prime");
			}
	}
}
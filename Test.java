 class Test
	{
	public static void main(String[] args)
		{
		int[] arr={2,3,5,6,7,8,4};
		for(int n:arr)
		{
			boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			for(n%i==0)
			{
				flag=false;
				break;
			}}}
			if(flag==true)
				System.out.prinln(n+"");
	}
}
	
    class Test
				{
	Public static void main(String[] args)
					{
		int arr1[]={3,5,6,7};
        int arr2[] ={9,4,5,6};
        int size1=arr.length;
        int size2=arr.length;
          arr1=Arrays.copyOf(arr1,size1+size2)
		  int j=0;
	      for(int i=size1;i<arr1.length;i++)
						{
							arr1[i]=arr2[j++];
						}
						Arrays.sort(arr);
						for(int i:arr1);
						{
							System.out.println(i+"");
						}
					}

Write a java program to display most repeating element from given array?

input:
	4 5 1 2 3 1 7 7 9 7 3 7 5 5 

output:
	7 is repeating for 4 times 

ex:

class Test  
{
	public static void main(String[] args) 
	{
		int[] arr={4,5,1,2,3,1,7,7,9,7,3,7,5,5};
		
		int element=0;
		int maxCount=0;
       for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
				}
			}
			if(maxCount<cnt)
			{
				maxCount=cnt;
				element=arr[i];
			}
		}
		System.out.println(element+" is repeating for "+maxCount+" times");
	}
}

Q)Write a java program to display prime elements from given array?

input:
	5 9 13 17 21 23  6  4 

output:
	5 13 17 23  

ex:

0
class Test
							{
	public static void main(String[] args)
								{
		int[] arr={};
		for(int i=0;i<arr.length;i++)
									{
			int cnt=0;
			for(int j=0;j<arr.length;j++)
										{
				if(arr[i]==arr[j])
											{
					cnt++;
											}
											if(cnt==1)
												System.out.println(arr[i]+"");
										}
  */
   class Test
   {
	public static void main(String[] args)
	   {
		String str="prashanth";
		char[] carr=str.toCharArray();
		String rev="";
		for(int i=carr.length-1;i>=0;i--)
		   {
			rev+=carr[i];
		   }
		   System.out.println(rev);
	   }}
	   class Test
	   {
		   public static void main(String[] args)
		   {
			   String str="msm";
			   char[]carr=str.toCharArray();
			   Strng rev="";
			   for(int i=carr.length-1;i>=0;i--)
			   {
				   rev+=carr[i];
			   }
			   if(str.equals(rev));
			   System.out.println("it is palindrome");
			   else
				   System.out.println("it is not palindrome");
		   }}
		   class Test
		   {
			   public static void main(String[] args)
			   {
			
				  String str="This is java class";
				   String[]sarr=str.split("");
				   String rev="";
				   for(int i=carr.length-1;i>=0;i--)
				   {
					   rev+=carr[i]+"";
				   }
				   System.out.println(rev)
			   }
		   }

class Test
{
	public static void main(String[] args)
	{
		String str="This is java class";
		String [] sarr=str.split("");
		String rev="";
		for(String s:sarr)
		{
			char[] carr=s.toCharArray();
			for(int i=carr.length-1;i>=0;i--)
			{
				rev+=carr[i];
			}
			rev+="";
			System.out.println(rev);
	}}


package Question_1;

import java.util.*;



class MyComparator implements Comparator<Object>

{

	public int compare(Object obj1,Object obj2)

	{
		Integer i1=(Integer)obj1;

		Integer i2=(Integer)obj2;

		return i2.compareTo(i1);

	}
}

public class Construction 
{
	public static void main(String[] args)  

	{

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the total no of floors in the building: ");

		int n=sc.nextInt();

		int max=n;

		Queue<Integer> queue=new PriorityQueue<Integer>(new MyComparator());

		int disks[]=new int[n];

		for(int i=0;i<n;i++)

		{
			System.out.println("Enter the floor size given on day-"+(i+1)+": ");

			disks[i]=sc.nextInt();

			queue.add(disks[i]);

			while(!queue.isEmpty() && queue.peek()==max)
			{
				System.out.print(queue.poll()+" ");
				max--;
			}
			System.out.println();
		}
		sc.close();

	}
}
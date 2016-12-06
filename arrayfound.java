import java.util.*;
class arrayfound
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,target,sum=0;
System.out.println("Enter size:");
n=sc.nextInt();
int a[]=new int[n];
int temp[]=new int[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
System.out.println("target:");
target=sc.nextInt();
for(int i=0;i<n;i++)
{
temp[i]=target-a[i];
sum=temp[i]+a[i];
if(sum==target)
{
System.out.print(temp[i]);
System.out.print(",");
System.out.println(a[i]);
break;
}
else
{
continue;
}
}
}
}

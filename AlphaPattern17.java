class AlphaPattern17
{
public static void main(String[] args)
{
int n=5;
for(int i=1;i<=n;i++)
{
char flag='E';
for(int s=1;s<=n-i;s++)
System.out.print(" ");
for(int j=1;j<=i-1;j++)
{
if(i!=1)
{
flag--;
continue;
}
}
if(i==1)
System.out.print(flag);
if(i!=1)
{
for(int l=1;l<=i;l++)
{
System.out.print(flag);
flag++;
}
}
System.out.println("");
}
for(int i=n-1;i>=1;i--)
{
char flag='E';
for(int s=1;s<=n-i;s++)
System.out.print(" ");
for(int j=1;j<=i-1;j++)
{
if(i!=1)
{
flag--;
continue;
}
}
if(i==1)
System.out.print(flag);
if(i!=1)
{
for(int l=1;l<=i;l++)
{
System.out.print(flag);
flag++;
}
}
System.out.println("");
}
}
}
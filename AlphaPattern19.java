class AlphaPattern19
{
public static void main(String[] args)
{
int n=5;
char flag='E';
for(int i=n;i>=1;i--)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
for(int k=1;k<=2*i-1;k++)
{
if(k==1||k==2*i-1)
System.out.print(flag);
else
System.out.print(" ");
}
System.out.println("");
flag--;
}
}
}
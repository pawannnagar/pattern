class AlphaPattern11
{
public static void main(String[] args)
{
int n=5;
char flag='A';
for(int i=1;i<=n;i++)
{
for(int j=n-i;j>=1;j--)
System.out.print(" ");
for(int k=1;k<=i;k++)
System.out.print(flag);
System.out.println("");
flag++;
}
}
}

class AlphaPattern12
{
public static void main(String[] args)
{
int n=5;
for(int i=1;i<=n;i++)
{
char flag='A';
for(int j=n-i;j>=1;j--)
System.out.print(" ");
for(int k=1;k<=i;k++)
{
System.out.print(flag);
flag++;
}
System.out.println("");
}
}
}

class AlphaPattern16
{
public static void main(String[] args)
{
int n=5;
for(int i=1;i<=n;i++)
{
char flag='E';
for(int j=1;j<=i;j++)
{
System.out.print(flag);
flag--;
}
System.out.println("");
}
for(int i=n-1;i>=1;i--)
{
char flag='E';
for(int j=1;j<=i;j++)
{
System.out.print(flag);
flag--;
}
System.out.println("");
}
}
}
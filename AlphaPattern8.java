class AlphaPattern8
{
public static void main(String[] args)
{
int n=5;
for(int i=n;i>=1;i--)
{
char flag='A';
for(int j=1;j<=i;j++)
{
System.out.print(flag);
flag++;
}
System.out.println("");
}
}
}
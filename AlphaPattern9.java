class AlphaPattern9
{
public static void main(String[] args)
{
int n=5;
char flag='A';
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
System.out.print(flag);
System.out.println("");
flag++;
}
}
}
class AlphaPattern15
{
public static void main(String[] args)
{
int n=5;
char flag='E';
for(int i=n;i>=1;i--)
{
for(int j=n-i;j>=1;j--)
System.out.print(" ");
for(int k=1;k<=i;k++)
System.out.print(flag);
for(int l=1;l<=i-1;l++)
System.out.print(flag);
System.out.println("");
flag--;
}
}
}
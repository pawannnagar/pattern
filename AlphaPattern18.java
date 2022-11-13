class AlphaPattern18
{
public static void main(String[] args)
{
int n=5;
char flag='A';
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
for(int k=1;k<=i;k++)
System.out.print(flag+" ");
System.out.println("");
flag++;
}
flag--;
for(int i=n-1;i>=1;i--)
{
flag--;
for(int j=1;j<=n-i;j++)
System.out.print(" ");
for(int k=1;k<=i;k++)
System.out.print(flag+" ");
System.out.println("");

}
}
}


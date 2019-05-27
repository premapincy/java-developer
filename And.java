class And
{
public static void main(String args[])
{
int a= 5, b=10;
System.out.print((a*b)>(b++ * a++)&&(a++ > ++b));
System.out.print(a);
System.out.print(b);
}
}
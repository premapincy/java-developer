class Operator
{
public static void main(String args[])
{
int a= 5, b=10;
System.out.println((a*b)>(b++ * a++)&&(a++ > ++b));
System.out.println(a);
System.out.println(b);
}
}
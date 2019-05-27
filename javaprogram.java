class javaprogram
{
public static void main(String args[])
{
char ch;
int temp;
scanner scan= new scanner(System.in);
System.out.println("Enter a character to lowercase:");
ch= scan.next().charAt(0);
temp= (int)ch;
temp= temp-32;
ch= (char)temp;
System.out.println("Equivalant character in uppercase:");
}
}
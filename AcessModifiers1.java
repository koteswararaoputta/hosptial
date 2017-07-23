class A
{
private int x;
private int y;
private A(int x,int y)
{

System.out.println("X is"+x);
System.out.println("y is"+y);
}
}

class B extends A
{
private int z;
private B(int z,int b,int c)
{
super(b,c);
System.out.println("z is"+z);
}

}

class C extends B
{
private int i;
private C(int i,int a,int b,int c)
{
super(a,b,c);
System.out.println("i is"+i);
}

}

class AcessModifiers1
{
public static void main(String args[])
{
C c = new C(10,20,30,40);
}
}

class Adder
{
 static int add(int a,int b)
 {
  return a+b;
 }
 static int add(int a,int b,int c)
 {
  return a+b+c;
 }
  static float add(float a,float b)
 {
  return a+b;
 }
  static float add(float a,float b,float c)
 {
  return a+b+c;
 }
 
}

class Testoverloading
{
 public static void main(String args[])
 {
  System.out.println(Adder.add(12,12));
  System.out.println(Adder.add(12,12,12));
  System.out.println(Adder.add(1.1,1.1));
  System.out.println(Adder.add(1.1,1.1,1.1));
 }
}
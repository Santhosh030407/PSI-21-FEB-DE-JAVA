class Bank
{
 void sbib()
 {
  System.out.println("8%");
 }
 void hdfcb()
 {
  System.out.println("12%");
 }
 void axisb()
 {
  System.out.println("14%");
 }
}

class sbi extends Bank
{
 public static void main(String args[])
 {
 sbi ob = new sbi();
 ob.sbib();
 }
}

class hdfc extends Bank
{
 public static void main(String args[])
 {
 hdfc ob1 = new hdfc();
 ob1.hdfcb();
 }
}

class axis extends Bank
{
 public static void main(String args[])
 {
 axis ob2 = new axis();
 ob2.axisb();
 }
}

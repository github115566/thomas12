package thermos;

public class thermos {
String liquid;
double qty;
String brand;

 thermos(String liquid,double qty,String brand)
 {
	 this.liquid = liquid;
	 this.qty = qty;
 }
 void add(double val)
 {
	 qty = qty + val;
 }
 void display()
 {
	 System.out.println("Liquid is" + liquid);
 }
 public static void main(String[] args) {
	 // TODO Auto-generated method stub
 }
}

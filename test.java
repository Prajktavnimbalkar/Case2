package senario1;

public class test extends c{
int x = 40;
void m1() {
	int x= 50;
	System.out.println(x);
	System.out.println(this.x);
	System.out.println(super.x);
	b obj = new b();
	System.out.println(obj.x);
	a obj1 = new a();
	System.out.println(obj1.x);
}
public static void main(String[] args) {
	test t = new test();
	t.m1();
}
}


public class Triangle {
	private int a;
	private int b;
	private int c;
	public Triangle(int a, int b, int c) throws Exception{
	if(a<=0||b<=0||c<=0)
	throw new Exception("dữ liệu không hợp lệ");
	this.a = a;
	this.b = b;
	this.c = c;
}
	/**
	* Hàm kiểm tra 1 có phải là tam giác không. Nếu có là loại tam giác gì?
	* @param a
	* @param b
	* @param c
	* @return -1:không phải tam giác
	* 0:tam giác thường
	* 1:tam giác cân
	* 2:tam giác đều
	*/
	public int CheckTriangle(){
	boolean isTriangle=false;
	if(a<b+c&&b<a+c&&c<a+b)
	isTriangle=true;
	if(isTriangle){
	if(a==b&&b==c)
	return 2;//tam giác đều
	else if(a!=b&&a!=c&&b!=c)
	return 0;//tam giác thường
	else
	return 1;//tam giác cân
	}
	return -1;//không phải tam giác
	}
	}
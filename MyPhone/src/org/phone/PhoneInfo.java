package org.phone;

public class PhoneInfo {
private void phoneName() {
	// TODO Auto-generated method stub
String name = "Oppo F11";
System.out.println("Mobile model: "+name);
}
private void phoneImeiNum() {
	// TODO Auto-generated method stub
long imei = 521454879458679l;
System.out.println("IMEI Number : "+imei);
}
private void Camera() {
	// TODO Auto-generated method stub
String camera = "48MP";
System.out.println("Camera :"+camera);
}
private void Storage() {
	// TODO Auto-generated method stub
String storage = "128GB";
System.out.println("Internal Memory : "+storage);
}
private void osName() {
	// TODO Auto-generated method stub
String version = "Android 11";
System.out.println("OS Version is "+version);
}
public static void main(String[] args) {
	PhoneInfo p = new PhoneInfo();
	p.phoneName();
	p.phoneImeiNum();
	p.Storage();
	p.Camera();
	p.osName();
}
}

public class CM{
public static void main (string[] args){
//01 from same class SRM
m1();

//02 from same class NSRM
CM w = new CM();
w.m2();

//03 from Different class SRM
SRM.t1();

//04 from different class NSRM
NSRM r = new NSRM ();
r.t2();
}
public static void m1(){
System.out.println("i am SRM from Class");
}
public void m2(){
System.out.println(" i am NSRM from class");
}
}
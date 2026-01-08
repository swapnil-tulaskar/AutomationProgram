package day14;

public class Gun {
	
	int BulletNo;
	String GunName;
	
	public Gun(String gunName,int bulletNo) {
		
		this.BulletNo = bulletNo;
		this.GunName = gunName;
	}
	
	public void shoot() {
		for(int i =1 ; i<=BulletNo; i ++) {
			System.out.println("Shoot by "+GunName+" Dhiskew"+i);
		}
	}

}

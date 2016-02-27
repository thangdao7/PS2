//Thang Dao
//CISC181
//Feb 26,2016

package base;

public class MyInteger {
	
	//Declare value iValue
	private int iValue;
	
	//Class constructor and setter
	public MyInteger(int iValue){
		this.iValue = iValue;		
	}
	
	//Value getter
	public int getiValue() {
		return iValue;
	}
	//*************************************************
	
	public boolean isEven(){
		if ((getiValue() % 2) == 0){
			return true;
		}
		return false;		
	}
	//*************************************************
	
	public boolean isOdd(){
		if ((getiValue() % 2) == 1){
			return true;
		}
		return false;
	}
	//*************************************************
	
	public boolean isPrime(){
		for (int i = 2; i < getiValue(); i++){
			if (getiValue() % i == 0){
				return false;
			}
		}
		return true;
	}
	//*************************************************
	
	public static boolean isEven(int x){
		if ((x % 2) == 0){
			return true;
		}
		return false;		
	}
	//*************************************************
	
	public static boolean isOdd(int x){
		if ((x % 2) == 1){
			return true;
		}
		return false;
	}
	//*************************************************
	
	public static boolean isPrime(int x){
		for (int i = 2; i < x; i++){
			if ((x % i) == 0){
				return false;
			}
		}
		return true;
	}
	//*************************************************
	
	public static boolean isEven(MyInteger x){
		return x.isEven();	
	}
	//*************************************************
	
	public static boolean isOdd(MyInteger x){
		return x.isOdd();	
	}
	//*************************************************
	
	public static boolean isPrime(MyInteger x){
		return x.isPrime();
	}
	//*************************************************
	
	public boolean equals(int x){
		if (x == getiValue()){
			return true;
		}
	return false;
	}
	//*************************************************
	
	public static boolean equals(MyInteger x){
		return x.equals(x.getiValue());
	}
	



}



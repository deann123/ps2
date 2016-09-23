package base;
//store iValue as an object
public class MyInteger {
	
private int iValue; 

// return the integer's value
public int getiValue(){
	return iValue; 
	


}
//Constructor that creates a MyInteger object
public MyInteger(int number){
	this.iValue = number;
}
// Method that returns true if the given value is even
public boolean isEven(){
	
	if (this.getiValue() % 2 == 0){
		return true;
		}
	else{
			return false;
		}
}
//Method that returns true if the given value is odd
public boolean isOdd(){
		
	if (this.getiValue() % 2 != 0){
			return true;
			}
		else{
				return false;
			}	
	}

//Method that returns true if the given value is prime

public boolean isPrime(){
		
	for(int i=2;i< iValue;i++){
			if(iValue%i==0){
				return false;
			}
		}
		if(iValue==1){
			return false;
		}
		return true;
	}

// Static method that returns true if the given value is odd
public static boolean isOdd(int iValue){
	
	if (iValue % 2 != 0){
			return true;
			}
		else{
				return false;
			}	
	}
//Static method that returns true if the given value is even
public static boolean isEven(int iValue){
	
	if (iValue % 2 == 0){
		return true;
		}
	else{
			return false;}
		}

//Static method that returns true if the given value is prime

	public static boolean isPrime(int iValue){
		
		for(int i=2;i< iValue;i++){
				if(iValue%i==0){
					return false;
				}
			}
			if(iValue==1){
				return false;
			}
			return true;
			}
		

	// Static method that returns true if the MyInteger value is even

public static boolean isEven(MyInteger x ){
	
	if (x.getiValue() % 2 == 0){
		return true;
		}
	else{
			return false;}
		}

// Static method that returns true if the MyInteger value is odd

public static boolean isOdd(MyInteger x){
	
	if (x.getiValue() % 2 != 0){
			return true;
			}
		else{
				return false;
			}	
	}

// Static method that returns true if the MyInteger value is prime

public static boolean isPrime(MyInteger x){
	
	for(int i=2;i< x.getiValue();i++){
			if(x.getiValue()%i==0){
				return false;
			}
		}
		if(x.getiValue()==1){
			return false;
		}
		return true;
		}


// method returns true if the value in the object is equal to the specific value

public boolean equals(int a){
	
	return a == iValue;
	
}

//method returns true if the given value is equal to the specific value
public boolean equals(MyInteger b){
	
	return b.getiValue() == iValue;

}

}


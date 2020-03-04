package homeWork5;

import java.math.BigInteger;

public class HomeWork5 {
	
	public static void main(String[] args) {
		
		double a, b, c, result;
		
		BigInteger p = new BigInteger("c315d99cf91a018dafba850237935b2d981e82b02d994f94db0a1ae40d1fc7ab9799286ac68d620f1102ef515b348807060e6caec5320e3dceb25a0b98356399", 16);
		BigInteger q = new BigInteger("e90bbb3d4f51311f0b7669abd04e4cc48687ad0e168e7183a9de3ff9fd2d2a3a50303a5109457bd45f0abe1c5750edfaff1ad87c13eed45e1b4bd2366b49d97f", 16);
		System.out.println(p.multiply(q));
		
		a = 35;
		b = 77;
		c = 83;
		
		result = dexp(a, b, c);
		System.out.println(result);
		
	}
	
	public static double dexp(double x, double y, double n){
		double result;
		double exponent = y;
		if(exponent % 2 == 1){
			exponent = exponent - 1;
			result = ((dexp(x, exponent, n) * x) % n);
		} else if (exponent == 2) {
			result = (x * x) % n;
		}else{
			result = (dexp(x, exponent/2, n));
			result = (result * result) % n;
		}
		return result;
	}
}

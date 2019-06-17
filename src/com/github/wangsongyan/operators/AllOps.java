package com.github.wangsongyan.operators;

public class AllOps {

	void f(boolean b){}
	void boolTest(boolean x, boolean y){
		// Arithmetic operators:
		//! x = x * y;
		//! x = x /y;
		//! x = x % y;
		//! x = x + y;
		//! x = x- y;
		//! x++;
		//! x--;
		//! x = +y;
		//! x = -y;
		// Relational and logical:
		//! f(x > y);
		//! f(x >= y);
		//! f(x < y);
		//! f(x <= y);
		f(x == y);
		f( x != y);
		f(!x);
		x = x && y;
		x = x || y;
		// Bitwise operators:
		//! x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>> 1;
		// Compound assignment:
		//! x += y;
		//! x -= y;
		//! x *= y;
		//! x /= y;
		//! x %= y;
		//! x <<= 1;
		//! x >>= 1;
		//! x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		//! char c = (char)x;
		//! byte b = (byte)x;
		//! short s = (short)x;
		//! int i = (int)x;
		//! long l = (long)x;
		//! float f = (float)x;
		//! double d = (double)x;
	}
	
	public static void main(String[] args) {
		
	}

}

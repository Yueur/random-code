

class Ackermann {
	/**
	 * 
	 */
	public static int compute(int m, int n){
		if((m < 0) || (n < 0)){
			throw new RuntimeException("M or N negative");
		}
		
		return p_compute(m, n);
	}
	
	/**
	 * @param m Integer. Assuming m >= 0
	 * @param n Integer. Assuming n >= 0
	 */
	private static int p_compute(int m, int n){
		if(m == 0){
			return n+1;
		}
		
		int temp;
		if(n == 0){
			temp = 1;
		}
		else{
			temp = compute(m, n-1);
		}
		
		return compute(m-1, temp);
	}
}


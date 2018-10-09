
class TestAckermann_Integer {
	public void assertTrue(String str, boolean bool){
		if(!bool){
			System.out.println(str);
		}
		else{
			System.out.println("Ok");
		}
	}
	
	public void test0_0(){
		Integer result = Ackermann.compute(0,0);
		assertTrue("Failed m=0, n=0",result.equals(1));
	}
	
	public void test1_0(){
		Integer result = Ackermann.compute(1,0);
		assertTrue("Failed m=1, n=0",result.equals(2));
	}
	
	public void test0_1(){
		Integer result = Ackermann.compute(0,1);
		assertTrue("Failed m=0, n=1",result.equals(2));
	}
	
	public void test2_3(){
		Integer result = Ackermann.compute(2,3);
		assertTrue("Failed m=0, n=1",result.equals(9));
	}
	
	public void test3_2(){
		Integer result = Ackermann.compute(3,2);
		assertTrue("Failed m=0, n=1",result.equals(29));
	}
	
	public void test3_3(){
		Integer result = Ackermann.compute(3,3);
		assertTrue("Failed m=0, n=1",result.equals(61));
	}
}


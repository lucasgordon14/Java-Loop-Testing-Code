
public class LoopTesting {

	public static void main(String[] args) 
	{
		int power = 0;
		System.out.println("Hello");
		
		for(int i = 0; i < 5; i++) {
			power ++;
			System.out.println(power);
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
			if(power == 5) {
				for(int j = 5; j > 1; j--) {
					power --;
					System.out.println(power);
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		//}
		
	}
	
}

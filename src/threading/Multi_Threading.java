package threading;

public class Multi_Threading extends Thread{
  
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Core Java " + this.getName() + " - "+ i);
		}
	}

	public static void main(String[] args) {
		Multi_Threading m = new Multi_Threading();
		
		m.setName("One");
		m.start();
		
		Multi_Threading s = new Multi_Threading();
		s.setName("Two");
		s.start();
		
	}
}

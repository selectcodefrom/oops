class Series extends Thread {
	public int a,b;
Series(int a,int b){
this.a=a;
this.b=b;
}
			
			public void run() {
				for(int i=a;i<=b;i++){
					System.out.println(Thread.currentThread().getName()+": "+i);}
				}
			}
public class Main {
	public static void main(String[] args) {
			
		// created three threads but none will start until you call
			// start() method
			Series t1 = new Series(1,5);
			Series t2 = new Series(101,105);
			Series t3 = new Series(201,205);

			// now, let's start all three threads
			t1.start();
			t2.start();
			t3.start();
	}

}
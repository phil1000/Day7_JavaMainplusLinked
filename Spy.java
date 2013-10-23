public class Spy {
	private static int spyCount=0; // this is a class variable and so is a STATIC
	private int spyID;

	public Spy(int spyID)
	{
		//constructor method
		spyCount++;
		this.spyID=spyID;
		System.out.format("This spyID is %d and the number of spies to date is %d%n", this.spyID, spyCount);
	}
	
	public void die(int spyID)
	{
		spyCount--;
		System.out.format("spyID %d has been terminated and the number of spies left is now %d%n", this.spyID, spyCount);
	}
	
	public static void main(String[] args) {
	// Here be the code to launch the program
		int numberofSpiestoCreate=Integer.parseInt(args[0]);
		int i;
		
		for (i=0; i<numberofSpiestoCreate;i++) {
			Spy mySpy = new Spy(i);
		}
		
		System.out.format("i= %d%n", i);
		while (i>0) {
			mySpy.die(i);
		}
	}
}


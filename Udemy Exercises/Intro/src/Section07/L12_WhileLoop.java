package Section07;

public class L12_WhileLoop {
	// toj -- ke pravi da odzima po edno od int roseCount a != znachi dok roseCount ne bide ednakvo na nula da ga povtara kod
	public static void main(String[]args) {	

	int roseCount = 5;
	 while(roseCount != 0) {
		 System.out.println("There are " + roseCount + " roses remaaining");
		 roseCount --;
	 }
}
}
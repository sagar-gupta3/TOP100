//Maximum number of handshakes
public class Main
{
	public static void main(String[] args) {
	     
    int num = 10;

    int total = num * (num-1) / 2; // Combination nC2

		System.out.println("For "+ num +" people there will be " +total+" handshakes");
	}
}
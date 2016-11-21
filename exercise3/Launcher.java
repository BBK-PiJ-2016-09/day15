import java.io.*;
public class Launcher {
    public static void main(String[] args) {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		Double mean = 0.0;
        String username = null;
		while(i < 10) {
			try {
		        System.out.print("Please enter number : ");
				mean = mean + Double.parseDouble(reader.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
			i++;
		}
		mean = mean/10;
		
        System.out.println("Mean  : " + mean);

    }
}






import java.io.*;
public class Launcher2 {
    public static void main(String[] args) {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				int n = 0;
		try {
		System.out.print("Please enter how many numbers you will introduce : ");
			n = Integer.parseInt(reader.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		int i = 0;
		Double mean = 0.0;
        String username = null;
		while(i < n) {
			try {
		        System.out.print("Please enter number : ");
				mean = mean + Double.parseDouble(reader.readLine());
				System.out.println(mean);
			} catch (IOException e) {
				e.printStackTrace();
			}
			i++;
		}
		mean = mean/n;
		
        System.out.println("Mean  : " + mean);

    }
}


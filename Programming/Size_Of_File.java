package Programming;

import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;

/*Size of file on the Internet using Java

To get the size of file from server first you need to connect to the server using URL and HttpURLConnection Class. 
To get the size of file we use getContentLength() method. As the size of file can be too large we use BigInteger class. 
You cannot use integer datatype as it can generate an error in case the size of file is greater than 2Gb.
*/
public class Size_Of_File {

	public static void main(String[] args) throws Exception {
		BigInteger size = new BigInteger("1");

		// get the url of web page
		URL url = new URL("https://contribute.geeksforgeeks.org/wp-content/uploads/GATE.pdf");

		// create a connection
		HttpURLConnection conn;
		try {

			// open stream to get size of page
			conn = (HttpURLConnection) url.openConnection();

			// set request method.
			conn.setRequestMethod("HEAD");

			// get the input stream of process
			conn.getInputStream();

			// store size of file
			size = BigInteger.valueOf(conn.getContentLength());

			// print the size of downloaded file
			System.out.println("The Size of file is:" + size + " bytes");
			conn.getInputStream().close();
		} catch (Exception e) {
			System.out.println("Connection failed");
		}

	}

}

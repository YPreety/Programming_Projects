package Programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Download_web_page {
	
	public static void DownloadWebPage(String webpage) {
		try {

			// Create URL object
			URL url = new URL(webpage);
			BufferedReader readr = new BufferedReader(new InputStreamReader(url.openStream()));

			// Enter filename in which you want to download
			BufferedWriter writer = new BufferedWriter(new FileWriter("Download.html"));

			// read each line from stream till end
			String line;
			while ((line = readr.readLine()) != null) {
				writer.write(line);
			}

			readr.close();
			writer.close();
			System.out.println("Successfully Downloaded.");
		}

		// Exceptions
		catch (MalformedURLException mue) {
			System.out.println("Malformed URL Exception raised");
		} catch (IOException ie) {
			System.out.println("IOException raised");
		}
	}

	public static void main(String args[]) throws IOException {
		String url = "https://www.geeksforgeeks.org/";
		DownloadWebPage(url);
	}

}

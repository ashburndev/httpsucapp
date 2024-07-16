package ashburncode.httpsucapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class HttpsucappApplication {

  private static final String USER_AGENT = "Mozilla/5.0";
  // private static final String GET_URL =
  // "https://localhost:9090/SpringMVCExample";
  private static final String GET_URL = "https://start.spring.io/";
  private static final String POST_URL = "https://localhost:9090/SpringMVCExample/home";
  private static final String POST_PARAMS = "userName=Pankaj";

  public static void main(String[] args) {
    SpringApplication.run(HttpsucappApplication.class, args);
    try {
      String response = createClientMakeGetGetuest(GET_URL);
      System.out.println("response = " + response);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      System.out.println("GET DONE");
    }

    // sendPOST();
    // System.out.println("POST DONE");
  }

  // https://www.digitalocean.com/community/tutorials/java-httpurlconnection-example-java-http-request-get-post

  private static String createClientMakeGetGetuest(String getUrl) throws IOException {
		System.out.println("createClientMakeGetGetuest getUrl = " + getUrl);
		URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code = " + responseCode);
		String response = "";
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer responseBuffer = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				responseBuffer.append(inputLine);
			}
			in.close();
			response = responseBuffer.toString();
		} else {
			response = "createClientMakeGetRequest did not work.";
		}
    return response;
	}

  private static void createClientMakePostGetuest() throws IOException {
    URL obj = new URL(POST_URL);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("POST");
    con.setRequestProperty("User-Agent", USER_AGENT);
    // For POST only - START
    con.setDoOutput(true);
    OutputStream os = con.getOutputStream();
    os.write(POST_PARAMS.getBytes());
    os.flush();
    os.close();
    // For POST only - END
    int responseCode = con.getResponseCode();
    System.out.println("POST Response Code = " + responseCode);
    if (responseCode == HttpURLConnection.HTTP_OK) { // success
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();
      // print result
      System.out.println(response.toString());
    } else {
      System.out.println("POST request did not work.");
    }
  }

}

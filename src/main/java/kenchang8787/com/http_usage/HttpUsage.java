package kenchang8787.com.http_usage;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class HttpUsage {

  public static void main(String[] args)
      throws URISyntaxException, IOException, InterruptedException {

    final String url = "";

    var transcript = new Transcript(1, 80);

    var getResult = get(url, transcript.getClass());
    System.out.println(getResult.map(Transcript::getScore).orElse(0));

    var postResult = post(url, transcript, transcript.getClass());
    System.out.println(postResult.map(Transcript::getScore).orElse(0));
  }

  public static <T> Optional<T> get(String url, Class<T> responseType)
      throws URISyntaxException, IOException, InterruptedException {

    // make a get http request
    var request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();

    // create http client
    var client = HttpClient.newHttpClient();

    // get the http response
    var response = client.send(request, HttpResponse.BodyHandlers.ofString());

    // gson convert type
    var gson = new Gson();
    var result = gson.fromJson(response.body(), responseType);

    return Optional.ofNullable(result);
  }

  public static <T> Optional<T> post(String url, Object object, Class<T> responseType)
      throws IOException, InterruptedException, URISyntaxException {

    // convert body
    var gson = new Gson();
    var jsonBody = gson.toJson(object);

    // make http request
    var request =
        HttpRequest.newBuilder()
            .uri(new URI(url))
            .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
            .build();

    // create http client
    var client = HttpClient.newHttpClient();

    // get http response
    var response = client.send(request, HttpResponse.BodyHandlers.ofString());

    var result = gson.fromJson(response.body(), responseType);

    return Optional.ofNullable(result);
  }
}

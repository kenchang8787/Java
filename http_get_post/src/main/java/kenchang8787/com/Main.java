package kenchang8787.com;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class Main {
  public static void main(String[] args) throws Exception {

    final String url = "";
    final String audio_url = "https://www.google.com.tw/?hl=zh_TW";

    // create transcript object
    Transcript transcript = new Transcript();
    transcript.setAudio_url(audio_url);

    Optional<Transcript> getResponse = getFromUrl(url, Transcript.class);
    System.out.println(getResponse.map(Transcript::getId).orElse(0));

    Optional<Transcript> postResponse = postToUrl(url, transcript, Transcript.class);
    System.out.println(postResponse.map(Transcript::getId).orElse(0));
  }

  public static <T> Optional<T> getFromUrl(String url, Class<T> responseType)
      throws URISyntaxException, IOException, InterruptedException {

    // create http request
    HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI(url)).GET().build();

    HttpClient httpClient = HttpClient.newHttpClient();

    HttpResponse<String> httpResponse =
        httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

    Gson gson = new Gson();
    T result = gson.fromJson(httpResponse.body(), responseType);

    return Optional.ofNullable(result);
  }

  public static <T> Optional<T> postToUrl(String url, Object object, Class<T> responseType)
      throws IOException, InterruptedException, URISyntaxException {

    /* convert to json format */
    Gson gson = new Gson();
    final String jsonBody = gson.toJson(object);

    // create http request
    HttpRequest httpRequest =
        HttpRequest.newBuilder()
            .uri(new URI(url))
            // .header("Authorization", auth)
            .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
            .build();

    // create http client
    HttpClient httpClient = HttpClient.newHttpClient();

    // get http response
    HttpResponse<String> httpResponse =
        httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

    T result = gson.fromJson(httpResponse.body(), responseType);

    return Optional.ofNullable(result);
  }
}

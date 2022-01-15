package co.incubyte.posts;

import static io.micronaut.http.HttpRequest.GET;

import io.micronaut.core.type.Argument;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.List;

@Singleton
public class StockGateway {

  @Inject
  @Client("https://61e1684c63f8fc0017618baa.mockapi.io/tickers")
  private HttpClient httpClient;

  public List<Stock> getAllStocks() {
    return httpClient.toBlocking()
        .retrieve(GET("/TATAMOTORS /HCC"), Argument.listOf(Stock.class));
  }
}

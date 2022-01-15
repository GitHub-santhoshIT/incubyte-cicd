## CI/CD Kata

### Application Details

This is a simple Micronaut application that makes requests to a REST API and returns the response.
The server is available [HCC](https://61e1684c63f8fc0017618baa.mockapi.io/tickers/HCC), [TATAMOTORS](https://61e1684c63f8fc0017618baa.mockapi.io/tickers/TATAMOTORS) which serves list of Penny Stocks.

The application is able to get stock information from this API based on a ticker name sent as a query parameter.

The source code for the application along with the test cases is available in this repository.

### Running the application

- To build the project, use `./gradlew build`
- To run all test cases, use `./gradlew test`
- To run gradle task use `./gradlew run`

### Example

```json
// curl $APP-HOST:PORT/tickers/HCC
{
  "ticker": "HCC",
  "name": "Hindustan Construction Company Limited",
  "price": 65.0
}

// curl $APP-HOST:PORT/tickers/TATAMOTORS
{
  "ticker": "TATAMOTORS",
  "name": "TATA MOTORS LIMITED",
  "price": 99
}
```

### Live Version

[HCC](https://61e1684c63f8fc0017618baa.mockapi.io/tickers/HCC)
[TATAMOTORS](https://61e1684c63f8fc0017618baa.mockapi.io/tickers/TATAMOTORS)



[Test report.zip](https://github.com/GitHub-santhoshIT/incubyte-cicd/files/7875081/Test.report.zip)

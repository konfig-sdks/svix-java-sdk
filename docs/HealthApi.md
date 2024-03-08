# HealthApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkServerStatus**](HealthApi.md#checkServerStatus) | **GET** /api/v1/health | Health |


<a name="checkServerStatus"></a>
# **checkServerStatus**
> checkServerStatus().execute();

Health

Verify the API server is up and running.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HealthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.eu.svix.com";
    Svix client = new Svix(configuration);
    try {
      client
              .health
              .checkServerStatus()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#checkServerStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .health
              .checkServerStatus()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#checkServerStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |


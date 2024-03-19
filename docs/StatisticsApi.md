# StatisticsApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**calculateEventTypesForApps**](StatisticsApi.md#calculateEventTypesForApps) | **PUT** /api/v1/stats/usage/event-types | Aggregate Event Types |
| [**calculateMessageDestinationsForApps**](StatisticsApi.md#calculateMessageDestinationsForApps) | **POST** /api/v1/stats/usage/app | Aggregate App Stats |


<a name="calculateEventTypesForApps"></a>
# **calculateEventTypesForApps**
> AggregateEventTypesOut calculateEventTypesForApps().execute();

Aggregate Event Types

Creates a background task to calculate the listed event types for all apps in the organization.  Note that this endpoint is asynchronous. You will need to poll the &#x60;Get Background Task&#x60; endpoint to retrieve the results of the operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatisticsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.eu.svix.com";
    
    // Configure HTTP bearer authorization: HTTPBearer
    configuration.token = "BEARER TOKEN";
    Svix client = new Svix(configuration);
    try {
      AggregateEventTypesOut result = client
              .statistics
              .calculateEventTypesForApps()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getTask());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#calculateEventTypesForApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AggregateEventTypesOut> response = client
              .statistics
              .calculateEventTypesForApps()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#calculateEventTypesForApps");
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

[**AggregateEventTypesOut**](AggregateEventTypesOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |

<a name="calculateMessageDestinationsForApps"></a>
# **calculateMessageDestinationsForApps**
> AppUsageStatsOut calculateMessageDestinationsForApps(appUsageStatsIn).idempotencyKey(idempotencyKey).execute();

Aggregate App Stats

Creates a background task to calculate the message destinations for all applications in the environment.  Note that this endpoint is asynchronous. You will need to poll the &#x60;Get Background Task&#x60; endpoint to retrieve the results of the operation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.StatisticsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.eu.svix.com";
    
    // Configure HTTP bearer authorization: HTTPBearer
    configuration.token = "BEARER TOKEN";
    Svix client = new Svix(configuration);
    OffsetDateTime since = OffsetDateTime.now();
    OffsetDateTime until = OffsetDateTime.now();
    Set<String> appIds = Arrays.asList();
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      AppUsageStatsOut result = client
              .statistics
              .calculateMessageDestinationsForApps(since, until)
              .appIds(appIds)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getTask());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#calculateMessageDestinationsForApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppUsageStatsOut> response = client
              .statistics
              .calculateMessageDestinationsForApps(since, until)
              .appIds(appIds)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling StatisticsApi#calculateMessageDestinationsForApps");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appUsageStatsIn** | [**AppUsageStatsIn**](AppUsageStatsIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**AppUsageStatsOut**](AppUsageStatsOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |


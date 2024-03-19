# BackgroundTasksApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](BackgroundTasksApi.md#getById) | **GET** /api/v1/background-task/{task_id} | Get Background Task |
| [**getPastTasks**](BackgroundTasksApi.md#getPastTasks) | **GET** /api/v1/background-task | List Background Tasks |


<a name="getById"></a>
# **getById**
> BackgroundTaskOut getById(taskId).execute();

Get Background Task

Get a background task by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackgroundTasksApi;
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
    String taskId = "taskId_example";
    try {
      BackgroundTaskOut result = client
              .backgroundTasks
              .getById(taskId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getTask());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundTasksApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BackgroundTaskOut> response = client
              .backgroundTasks
              .getById(taskId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundTasksApi#getById");
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
| **taskId** | **String**|  | |

### Return type

[**BackgroundTaskOut**](BackgroundTaskOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getPastTasks"></a>
# **getPastTasks**
> ListResponseBackgroundTaskOut getPastTasks().status(status).task(task).limit(limit).iterator(iterator).order(order).execute();

List Background Tasks

List background tasks executed in the past 90 days.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BackgroundTasksApi;
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
    BackgroundTaskStatus status = BackgroundTaskStatus.fromValue("running"); // Filter the response based on the status
    BackgroundTaskType task = BackgroundTaskType.fromValue("endpoint.replay"); // Filter the response based on the type
    Integer limit = 56; // Limit the number of returned items
    String iterator = "iterator_example"; // The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // The sorting order of the returned items
    try {
      ListResponseBackgroundTaskOut result = client
              .backgroundTasks
              .getPastTasks()
              .status(status)
              .task(task)
              .limit(limit)
              .iterator(iterator)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundTasksApi#getPastTasks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseBackgroundTaskOut> response = client
              .backgroundTasks
              .getPastTasks()
              .status(status)
              .task(task)
              .limit(limit)
              .iterator(iterator)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BackgroundTasksApi#getPastTasks");
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
| **status** | [**BackgroundTaskStatus**](.md)| Filter the response based on the status | [optional] [enum: running, finished, failed] |
| **task** | [**BackgroundTaskType**](.md)| Filter the response based on the type | [optional] [enum: endpoint.replay, endpoint.recover, application.stats, message.broadcast, sdk.generate, event-type.aggregate] |
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |
| **order** | [**Ordering**](.md)| The sorting order of the returned items | [optional] [enum: ascending, descending] |

### Return type

[**ListResponseBackgroundTaskOut**](ListResponseBackgroundTaskOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


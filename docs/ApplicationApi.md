# ApplicationApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewApplication**](ApplicationApi.md#createNewApplication) | **POST** /api/v1/app | Create Application |
| [**getById**](ApplicationApi.md#getById) | **GET** /api/v1/app/{app_id} | Get Application |
| [**listAll**](ApplicationApi.md#listAll) | **GET** /api/v1/app | List Applications |
| [**partiallyUpdate**](ApplicationApi.md#partiallyUpdate) | **PATCH** /api/v1/app/{app_id} | Patch Application |
| [**removeApp**](ApplicationApi.md#removeApp) | **DELETE** /api/v1/app/{app_id} | Delete Application |
| [**updateApp**](ApplicationApi.md#updateApp) | **PUT** /api/v1/app/{app_id} | Update Application |


<a name="createNewApplication"></a>
# **createNewApplication**
> ApplicationOut createNewApplication(applicationIn).getIfExists(getIfExists).idempotencyKey(idempotencyKey).execute();

Create Application

Create a new application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    String name = "name_example";
    Integer rateLimit = 56;
    String uid = "uid_example"; // Optional unique identifier for the application
    Map<String, String> metadata = new HashMap();
    Boolean getIfExists = false; // Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs.
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      ApplicationOut result = client
              .application
              .createNewApplication(name)
              .rateLimit(rateLimit)
              .uid(uid)
              .metadata(metadata)
              .getIfExists(getIfExists)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getUid());
      System.out.println(result.getName());
      System.out.println(result.getRateLimit());
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#createNewApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationOut> response = client
              .application
              .createNewApplication(name)
              .rateLimit(rateLimit)
              .uid(uid)
              .metadata(metadata)
              .getIfExists(getIfExists)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#createNewApplication");
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
| **applicationIn** | [**ApplicationIn**](ApplicationIn.md)|  | |
| **getIfExists** | **Boolean**| Get an existing application, or create a new one if doesn&#39;t exist. It&#39;s two separate functions in the libs. | [optional] [default to false] |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **201** |  |  -  |

<a name="getById"></a>
# **getById**
> ApplicationOut getById(appId).execute();

Get Application

Get an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    String appId = "unique-app-identifier"; // The app's ID or UID
    try {
      ApplicationOut result = client
              .application
              .getById(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUid());
      System.out.println(result.getName());
      System.out.println(result.getRateLimit());
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationOut> response = client
              .application
              .getById(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getById");
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
| **appId** | **String**| The app&#39;s ID or UID | |

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listAll"></a>
# **listAll**
> ListResponseApplicationOut listAll().limit(limit).iterator(iterator).order(order).execute();

List Applications

List of all the organization&#39;s applications.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    Integer limit = 56; // Limit the number of returned items
    String iterator = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // The sorting order of the returned items
    try {
      ListResponseApplicationOut result = client
              .application
              .listAll()
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
      System.err.println("Exception when calling ApplicationApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseApplicationOut> response = client
              .application
              .listAll()
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
      System.err.println("Exception when calling ApplicationApi#listAll");
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
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |
| **order** | [**Ordering**](.md)| The sorting order of the returned items | [optional] [enum: ascending, descending] |

### Return type

[**ListResponseApplicationOut**](ListResponseApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="partiallyUpdate"></a>
# **partiallyUpdate**
> ApplicationOut partiallyUpdate(appId, applicationPatch).execute();

Patch Application

Partially update an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    String appId = "unique-app-identifier"; // The app's ID or UID
    String name = "name_example";
    Integer rateLimit = 56;
    String uid = "uid_example"; // The app's UID
    Map<String, String> metadata = new HashMap();
    try {
      ApplicationOut result = client
              .application
              .partiallyUpdate(appId)
              .name(name)
              .rateLimit(rateLimit)
              .uid(uid)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getUid());
      System.out.println(result.getName());
      System.out.println(result.getRateLimit());
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#partiallyUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationOut> response = client
              .application
              .partiallyUpdate(appId)
              .name(name)
              .rateLimit(rateLimit)
              .uid(uid)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#partiallyUpdate");
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
| **appId** | **String**| The app&#39;s ID or UID | |
| **applicationPatch** | [**ApplicationPatch**](ApplicationPatch.md)|  | |

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeApp"></a>
# **removeApp**
> removeApp(appId).execute();

Delete Application

Delete an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    String appId = "unique-app-identifier"; // The app's ID or UID
    try {
      client
              .application
              .removeApp(appId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .application
              .removeApp(appId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#removeApp");
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
| **appId** | **String**| The app&#39;s ID or UID | |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |

<a name="updateApp"></a>
# **updateApp**
> ApplicationOut updateApp(appId, applicationIn).execute();

Update Application

Update an application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
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
    String name = "name_example";
    String appId = "unique-app-identifier"; // The app's ID or UID
    Integer rateLimit = 56;
    String uid = "uid_example"; // Optional unique identifier for the application
    Map<String, String> metadata = new HashMap();
    try {
      ApplicationOut result = client
              .application
              .updateApp(name, appId)
              .rateLimit(rateLimit)
              .uid(uid)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getUid());
      System.out.println(result.getName());
      System.out.println(result.getRateLimit());
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApplicationOut> response = client
              .application
              .updateApp(name, appId)
              .rateLimit(rateLimit)
              .uid(uid)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#updateApp");
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
| **appId** | **String**| The app&#39;s ID or UID | |
| **applicationIn** | [**ApplicationIn**](ApplicationIn.md)|  | |

### Return type

[**ApplicationOut**](ApplicationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **201** |  |  -  |


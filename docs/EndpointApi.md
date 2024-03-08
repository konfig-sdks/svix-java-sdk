# EndpointApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNew**](EndpointApi.md#createNew) | **POST** /api/v1/app/{app_id}/endpoint | Create Endpoint |
| [**getEndpoint**](EndpointApi.md#getEndpoint) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Get Endpoint |
| [**getHeaders**](EndpointApi.md#getHeaders) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Get Endpoint Headers |
| [**getSecret**](EndpointApi.md#getSecret) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret | Get Endpoint Secret |
| [**getStats**](EndpointApi.md#getStats) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/stats | Endpoint Stats |
| [**getTransformationCode**](EndpointApi.md#getTransformationCode) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Get Endpoint Transformation |
| [**listEndpoints**](EndpointApi.md#listEndpoints) | **GET** /api/v1/app/{app_id}/endpoint | List Endpoints |
| [**partiallySetHeaders**](EndpointApi.md#partiallySetHeaders) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Patch Endpoint Headers |
| [**partiallyUpdate**](EndpointApi.md#partiallyUpdate) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Patch Endpoint |
| [**remove**](EndpointApi.md#remove) | **DELETE** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Delete Endpoint |
| [**replayMissingWebhooks**](EndpointApi.md#replayMissingWebhooks) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/replay-missing | Replay Missing Webhooks |
| [**resendFailedWebhooks**](EndpointApi.md#resendFailedWebhooks) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/recover | Recover Failed Webhooks |
| [**rotateSecret**](EndpointApi.md#rotateSecret) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/secret/rotate | Rotate Endpoint Secret |
| [**sendExampleMessage**](EndpointApi.md#sendExampleMessage) | **POST** /api/v1/app/{app_id}/endpoint/{endpoint_id}/send-example | Send Event Type Example Message |
| [**setTransformationCode**](EndpointApi.md#setTransformationCode) | **PATCH** /api/v1/app/{app_id}/endpoint/{endpoint_id}/transformation | Set Endpoint Transformation |
| [**updateEndpoint**](EndpointApi.md#updateEndpoint) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id} | Update Endpoint |
| [**updateHeaders**](EndpointApi.md#updateHeaders) | **PUT** /api/v1/app/{app_id}/endpoint/{endpoint_id}/headers | Update Endpoint Headers |


<a name="createNew"></a>
# **createNew**
> EndpointOut createNew(appId, endpointIn).idempotencyKey(idempotencyKey).execute();

Create Endpoint

Create a new endpoint for the application.  When &#x60;secret&#x60; is &#x60;null&#x60; the secret is automatically generated (recommended)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    URI url = new URI();
    String appId = "unique-app-identifier"; // The app's ID or UID
    String description = "";
    Integer version = 1;
    Integer rateLimit = 56;
    String uid = "uid_example"; // Optional unique identifier for the endpoint
    Boolean disabled = false;
    Set<String> filterTypes = Arrays.asList();
    Set<String> channels = Arrays.asList(); // List of message channels this endpoint listens to (omit for all)
    String secret = "secret_example"; // The endpoint's verification secret. If `null` is passed, a secret is automatically generated. Format: `base64` encoded random bytes optionally prefixed with `whsec_`. Recommended size: 24.
    Map<String, String> metadata = new HashMap();
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      EndpointOut result = client
              .endpoint
              .createNew(url, appId)
              .description(description)
              .version(version)
              .rateLimit(rateLimit)
              .uid(uid)
              .disabled(disabled)
              .filterTypes(filterTypes)
              .channels(channels)
              .secret(secret)
              .metadata(metadata)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getMetadata());
      System.out.println(result.getRateLimit());
      System.out.println(result.getUid());
      System.out.println(result.getUrl());
      System.out.println(result.getDisabled());
      System.out.println(result.getFilterTypes());
      System.out.println(result.getChannels());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#createNew");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EndpointOut> response = client
              .endpoint
              .createNew(url, appId)
              .description(description)
              .version(version)
              .rateLimit(rateLimit)
              .uid(uid)
              .disabled(disabled)
              .filterTypes(filterTypes)
              .channels(channels)
              .secret(secret)
              .metadata(metadata)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#createNew");
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
| **endpointIn** | [**EndpointIn**](EndpointIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="getEndpoint"></a>
# **getEndpoint**
> EndpointOut getEndpoint(appId, endpointId).execute();

Get Endpoint

Get an endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    try {
      EndpointOut result = client
              .endpoint
              .getEndpoint(appId, endpointId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getMetadata());
      System.out.println(result.getRateLimit());
      System.out.println(result.getUid());
      System.out.println(result.getUrl());
      System.out.println(result.getDisabled());
      System.out.println(result.getFilterTypes());
      System.out.println(result.getChannels());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getEndpoint");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EndpointOut> response = client
              .endpoint
              .getEndpoint(appId, endpointId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getEndpoint");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getHeaders"></a>
# **getHeaders**
> EndpointHeadersOut getHeaders(appId, endpointId).execute();

Get Endpoint Headers

Get the additional headers to be sent with the webhook

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    try {
      EndpointHeadersOut result = client
              .endpoint
              .getHeaders(appId, endpointId)
              .execute();
      System.out.println(result);
      System.out.println(result.getHeaders());
      System.out.println(result.getSensitive());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getHeaders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EndpointHeadersOut> response = client
              .endpoint
              .getHeaders(appId, endpointId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getHeaders");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |

### Return type

[**EndpointHeadersOut**](EndpointHeadersOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getSecret"></a>
# **getSecret**
> EndpointSecretOut getSecret(appId, endpointId).execute();

Get Endpoint Secret

Get the endpoint&#39;s signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    try {
      EndpointSecretOut result = client
              .endpoint
              .getSecret(appId, endpointId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKey());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EndpointSecretOut> response = client
              .endpoint
              .getSecret(appId, endpointId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getSecret");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |

### Return type

[**EndpointSecretOut**](EndpointSecretOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getStats"></a>
# **getStats**
> EndpointStats getStats(appId, endpointId).since(since).until(until).execute();

Endpoint Stats

Get basic statistics for the endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    OffsetDateTime since = OffsetDateTime.now(); // Filter the range to data starting from this date
    OffsetDateTime until = OffsetDateTime.now(); // Filter the range to data ending by this date
    try {
      EndpointStats result = client
              .endpoint
              .getStats(appId, endpointId)
              .since(since)
              .until(until)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccess());
      System.out.println(result.getPending());
      System.out.println(result.getSending());
      System.out.println(result.getFail());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getStats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EndpointStats> response = client
              .endpoint
              .getStats(appId, endpointId)
              .since(since)
              .until(until)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getStats");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **since** | **OffsetDateTime**| Filter the range to data starting from this date | [optional] |
| **until** | **OffsetDateTime**| Filter the range to data ending by this date | [optional] |

### Return type

[**EndpointStats**](EndpointStats.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getTransformationCode"></a>
# **getTransformationCode**
> EndpointTransformationOut getTransformationCode(appId, endpointId).execute();

Get Endpoint Transformation

Get the transformation code associated with this endpoint

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    try {
      EndpointTransformationOut result = client
              .endpoint
              .getTransformationCode(appId, endpointId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCode());
      System.out.println(result.getEnabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getTransformationCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EndpointTransformationOut> response = client
              .endpoint
              .getTransformationCode(appId, endpointId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#getTransformationCode");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |

### Return type

[**EndpointTransformationOut**](EndpointTransformationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listEndpoints"></a>
# **listEndpoints**
> ListResponseEndpointOut listEndpoints(appId).limit(limit).iterator(iterator).order(order).execute();

List Endpoints

List the application&#39;s endpoints.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    Integer limit = 56; // Limit the number of returned items
    String iterator = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // The sorting order of the returned items
    try {
      ListResponseEndpointOut result = client
              .endpoint
              .listEndpoints(appId)
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
      System.err.println("Exception when calling EndpointApi#listEndpoints");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseEndpointOut> response = client
              .endpoint
              .listEndpoints(appId)
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
      System.err.println("Exception when calling EndpointApi#listEndpoints");
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
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |
| **order** | [**Ordering**](.md)| The sorting order of the returned items | [optional] [enum: ascending, descending] |

### Return type

[**ListResponseEndpointOut**](ListResponseEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="partiallySetHeaders"></a>
# **partiallySetHeaders**
> partiallySetHeaders(appId, endpointId, endpointHeadersPatchIn).execute();

Patch Endpoint Headers

Partially set the additional headers to be sent with the webhook

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    Map<String, String> headers = new HashMap();
    String appId = "unique-app-identifier"; // The app's ID or UID
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    try {
      client
              .endpoint
              .partiallySetHeaders(headers, appId, endpointId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#partiallySetHeaders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .endpoint
              .partiallySetHeaders(headers, appId, endpointId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#partiallySetHeaders");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **endpointHeadersPatchIn** | [**EndpointHeadersPatchIn**](EndpointHeadersPatchIn.md)|  | |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |

<a name="partiallyUpdate"></a>
# **partiallyUpdate**
> EndpointOut partiallyUpdate(appId, endpointId, endpointPatch).execute();

Patch Endpoint

Partially update an endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    String description = "description_example";
    Integer version = 56;
    Integer rateLimit = 56;
    String uid = "uid_example"; // The ep's UID
    URI url = new URI();
    Boolean disabled = true;
    Set<String> filterTypes = Arrays.asList();
    Set<String> channels = Arrays.asList();
    String secret = "secret_example"; // The endpoint's verification secret. If `null` is passed, a secret is automatically generated. Format: `base64` encoded random bytes optionally prefixed with `whsec_`. Recommended size: 24.
    Map<String, String> metadata = new HashMap();
    try {
      EndpointOut result = client
              .endpoint
              .partiallyUpdate(appId, endpointId)
              .description(description)
              .version(version)
              .rateLimit(rateLimit)
              .uid(uid)
              .url(url)
              .disabled(disabled)
              .filterTypes(filterTypes)
              .channels(channels)
              .secret(secret)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getMetadata());
      System.out.println(result.getRateLimit());
      System.out.println(result.getUid());
      System.out.println(result.getUrl());
      System.out.println(result.getDisabled());
      System.out.println(result.getFilterTypes());
      System.out.println(result.getChannels());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#partiallyUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EndpointOut> response = client
              .endpoint
              .partiallyUpdate(appId, endpointId)
              .description(description)
              .version(version)
              .rateLimit(rateLimit)
              .uid(uid)
              .url(url)
              .disabled(disabled)
              .filterTypes(filterTypes)
              .channels(channels)
              .secret(secret)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#partiallyUpdate");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **endpointPatch** | [**EndpointPatch**](EndpointPatch.md)|  | |

### Return type

[**EndpointOut**](EndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="remove"></a>
# **remove**
> remove(appId, endpointId).execute();

Delete Endpoint

Delete an endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    try {
      client
              .endpoint
              .remove(appId, endpointId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#remove");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .endpoint
              .remove(appId, endpointId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#remove");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |

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

<a name="replayMissingWebhooks"></a>
# **replayMissingWebhooks**
> ReplayOut replayMissingWebhooks(appId, endpointId, replayIn).idempotencyKey(idempotencyKey).execute();

Replay Missing Webhooks

Replays messages to the endpoint. Only messages that were created after &#x60;since&#x60; will be sent. Messages that were previously sent to the endpoint are not resent.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String appId = "unique-app-identifier"; // The app's ID or UID
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    OffsetDateTime until = OffsetDateTime.now();
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      ReplayOut result = client
              .endpoint
              .replayMissingWebhooks(since, appId, endpointId)
              .until(until)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getTask());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#replayMissingWebhooks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReplayOut> response = client
              .endpoint
              .replayMissingWebhooks(since, appId, endpointId)
              .until(until)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#replayMissingWebhooks");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **replayIn** | [**ReplayIn**](ReplayIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**ReplayOut**](ReplayOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |

<a name="resendFailedWebhooks"></a>
# **resendFailedWebhooks**
> RecoverOut resendFailedWebhooks(appId, endpointId, recoverIn).idempotencyKey(idempotencyKey).execute();

Recover Failed Webhooks

Resend all failed messages since a given time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String appId = "unique-app-identifier"; // The app's ID or UID
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    OffsetDateTime until = OffsetDateTime.now();
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      RecoverOut result = client
              .endpoint
              .resendFailedWebhooks(since, appId, endpointId)
              .until(until)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getTask());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#resendFailedWebhooks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecoverOut> response = client
              .endpoint
              .resendFailedWebhooks(since, appId, endpointId)
              .until(until)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#resendFailedWebhooks");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **recoverIn** | [**RecoverIn**](RecoverIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**RecoverOut**](RecoverOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |

<a name="rotateSecret"></a>
# **rotateSecret**
> rotateSecret(appId, endpointId, endpointSecretRotateIn).idempotencyKey(idempotencyKey).execute();

Rotate Endpoint Secret

Rotates the endpoint&#39;s signing secret.  The previous secret will be valid for the next 24 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    String key = "key_example"; // The endpoint's verification secret. If `null` is passed, a secret is automatically generated. Format: `base64` encoded random bytes optionally prefixed with `whsec_`. Recommended size: 24.
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      client
              .endpoint
              .rotateSecret(appId, endpointId)
              .key(key)
              .idempotencyKey(idempotencyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#rotateSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .endpoint
              .rotateSecret(appId, endpointId)
              .key(key)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#rotateSecret");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **endpointSecretRotateIn** | [**EndpointSecretRotateIn**](EndpointSecretRotateIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |

<a name="sendExampleMessage"></a>
# **sendExampleMessage**
> MessageOut sendExampleMessage(appId, endpointId, eventExampleIn).idempotencyKey(idempotencyKey).execute();

Send Event Type Example Message

Send an example message for event

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String eventType = "eventType_example"; // The event type's name
    String appId = "unique-app-identifier"; // The app's ID or UID
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      MessageOut result = client
              .endpoint
              .sendExampleMessage(eventType, appId, endpointId)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getEventId());
      System.out.println(result.getEventType());
      System.out.println(result.getPayload());
      System.out.println(result.getChannels());
      System.out.println(result.getId());
      System.out.println(result.getTimestamp());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#sendExampleMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageOut> response = client
              .endpoint
              .sendExampleMessage(eventType, appId, endpointId)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#sendExampleMessage");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **eventExampleIn** | [**EventExampleIn**](EventExampleIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** |  |  -  |

<a name="setTransformationCode"></a>
# **setTransformationCode**
> setTransformationCode(appId, endpointId, endpointTransformationIn).execute();

Set Endpoint Transformation

Set or unset the transformation code associated with this endpoint

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    String code = "code_example";
    Boolean enabled = true;
    try {
      client
              .endpoint
              .setTransformationCode(appId, endpointId)
              .code(code)
              .enabled(enabled)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#setTransformationCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .endpoint
              .setTransformationCode(appId, endpointId)
              .code(code)
              .enabled(enabled)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#setTransformationCode");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **endpointTransformationIn** | [**EndpointTransformationIn**](EndpointTransformationIn.md)|  | |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |

<a name="updateEndpoint"></a>
# **updateEndpoint**
> EndpointOut updateEndpoint(appId, endpointId, endpointUpdate).execute();

Update Endpoint

Update an endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    URI url = new URI();
    String appId = "unique-app-identifier"; // The app's ID or UID
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    String description = "";
    Integer version = 1;
    Integer rateLimit = 56;
    String uid = "uid_example"; // Optional unique identifier for the endpoint
    Boolean disabled = false;
    Set<String> filterTypes = Arrays.asList();
    Set<String> channels = Arrays.asList(); // List of message channels this endpoint listens to (omit for all)
    Map<String, String> metadata = new HashMap();
    try {
      EndpointOut result = client
              .endpoint
              .updateEndpoint(url, appId, endpointId)
              .description(description)
              .version(version)
              .rateLimit(rateLimit)
              .uid(uid)
              .disabled(disabled)
              .filterTypes(filterTypes)
              .channels(channels)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVersion());
      System.out.println(result.getId());
      System.out.println(result.getMetadata());
      System.out.println(result.getRateLimit());
      System.out.println(result.getUid());
      System.out.println(result.getUrl());
      System.out.println(result.getDisabled());
      System.out.println(result.getFilterTypes());
      System.out.println(result.getChannels());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#updateEndpoint");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EndpointOut> response = client
              .endpoint
              .updateEndpoint(url, appId, endpointId)
              .description(description)
              .version(version)
              .rateLimit(rateLimit)
              .uid(uid)
              .disabled(disabled)
              .filterTypes(filterTypes)
              .channels(channels)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#updateEndpoint");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **endpointUpdate** | [**EndpointUpdate**](EndpointUpdate.md)|  | |

### Return type

[**EndpointOut**](EndpointOut.md)

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

<a name="updateHeaders"></a>
# **updateHeaders**
> updateHeaders(appId, endpointId, endpointHeadersIn).execute();

Update Endpoint Headers

Set the additional headers to be sent with the webhook

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EndpointApi;
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
    Map<String, String> headers = new HashMap();
    String appId = "unique-app-identifier"; // The app's ID or UID
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    try {
      client
              .endpoint
              .updateHeaders(headers, appId, endpointId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#updateHeaders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .endpoint
              .updateHeaders(headers, appId, endpointId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EndpointApi#updateHeaders");
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
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **endpointHeadersIn** | [**EndpointHeadersIn**](EndpointHeadersIn.md)|  | |

### Return type

null (empty response body)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no content |  -  |


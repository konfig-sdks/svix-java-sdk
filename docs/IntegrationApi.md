# IntegrationApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewIntegration**](IntegrationApi.md#createNewIntegration) | **POST** /api/v1/app/{app_id}/integration | Create Integration |
| [**deleteById**](IntegrationApi.md#deleteById) | **DELETE** /api/v1/app/{app_id}/integration/{integ_id} | Delete Integration |
| [**getById**](IntegrationApi.md#getById) | **GET** /api/v1/app/{app_id}/integration/{integ_id} | Get Integration |
| [**getKey**](IntegrationApi.md#getKey) | **GET** /api/v1/app/{app_id}/integration/{integ_id}/key | Get Integration Key |
| [**list**](IntegrationApi.md#list) | **GET** /api/v1/app/{app_id}/integration | List Integrations |
| [**rotateKey**](IntegrationApi.md#rotateKey) | **POST** /api/v1/app/{app_id}/integration/{integ_id}/key/rotate | Rotate Integration Key |
| [**updateIntegrationById**](IntegrationApi.md#updateIntegrationById) | **PUT** /api/v1/app/{app_id}/integration/{integ_id} | Update Integration |


<a name="createNewIntegration"></a>
# **createNewIntegration**
> IntegrationOut createNewIntegration(appId, integrationIn).idempotencyKey(idempotencyKey).execute();

Create Integration

Create an integration.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationApi;
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
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      IntegrationOut result = client
              .integration
              .createNewIntegration(name, appId)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#createNewIntegration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationOut> response = client
              .integration
              .createNewIntegration(name, appId)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#createNewIntegration");
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
| **integrationIn** | [**IntegrationIn**](IntegrationIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteById"></a>
# **deleteById**
> deleteById(appId, integId).execute();

Delete Integration

Delete an integration.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationApi;
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
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The integ's ID
    try {
      client
              .integration
              .deleteById(appId, integId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .integration
              .deleteById(appId, integId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#deleteById");
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
| **integId** | **String**| The integ&#39;s ID | |

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

<a name="getById"></a>
# **getById**
> IntegrationOut getById(appId, integId).execute();

Get Integration

Get an integration.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationApi;
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
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The integ's ID
    try {
      IntegrationOut result = client
              .integration
              .getById(appId, integId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationOut> response = client
              .integration
              .getById(appId, integId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#getById");
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
| **integId** | **String**| The integ&#39;s ID | |

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getKey"></a>
# **getKey**
> IntegrationKeyOut getKey(appId, integId).execute();

Get Integration Key

Get an integration&#39;s key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationApi;
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
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The integ's ID
    try {
      IntegrationKeyOut result = client
              .integration
              .getKey(appId, integId)
              .execute();
      System.out.println(result);
      System.out.println(result.getKey());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#getKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationKeyOut> response = client
              .integration
              .getKey(appId, integId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#getKey");
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
| **integId** | **String**| The integ&#39;s ID | |

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="list"></a>
# **list**
> ListResponseIntegrationOut list(appId).limit(limit).iterator(iterator).execute();

List Integrations

List the application&#39;s integrations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationApi;
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
    String iterator = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    try {
      ListResponseIntegrationOut result = client
              .integration
              .list(appId)
              .limit(limit)
              .iterator(iterator)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseIntegrationOut> response = client
              .integration
              .list(appId)
              .limit(limit)
              .iterator(iterator)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#list");
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

### Return type

[**ListResponseIntegrationOut**](ListResponseIntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="rotateKey"></a>
# **rotateKey**
> IntegrationKeyOut rotateKey(appId, integId).idempotencyKey(idempotencyKey).execute();

Rotate Integration Key

Rotate the integration&#39;s key. The previous key will be immediately revoked.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationApi;
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
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The integ's ID
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      IntegrationKeyOut result = client
              .integration
              .rotateKey(appId, integId)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getKey());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#rotateKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationKeyOut> response = client
              .integration
              .rotateKey(appId, integId)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#rotateKey");
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
| **integId** | **String**| The integ&#39;s ID | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**IntegrationKeyOut**](IntegrationKeyOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateIntegrationById"></a>
# **updateIntegrationById**
> IntegrationOut updateIntegrationById(appId, integId, integrationUpdate).execute();

Update Integration

Update an integration.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntegrationApi;
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
    String integId = "integ_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The integ's ID
    try {
      IntegrationOut result = client
              .integration
              .updateIntegrationById(name, appId, integId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#updateIntegrationById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntegrationOut> response = client
              .integration
              .updateIntegrationById(name, appId, integId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationApi#updateIntegrationById");
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
| **integId** | **String**| The integ&#39;s ID | |
| **integrationUpdate** | [**IntegrationUpdate**](IntegrationUpdate.md)|  | |

### Return type

[**IntegrationOut**](IntegrationOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


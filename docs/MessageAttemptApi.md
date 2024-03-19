# MessageAttemptApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteResponseBody**](MessageAttemptApi.md#deleteResponseBody) | **DELETE** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id}/content | Delete attempt response body |
| [**getByAttempt**](MessageAttemptApi.md#getByAttempt) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt/{attempt_id} | Get Attempt |
| [**listAttemptedDestinations**](MessageAttemptApi.md#listAttemptedDestinations) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint | List Attempted Destinations |
| [**listAttemptedMessages**](MessageAttemptApi.md#listAttemptedMessages) | **GET** /api/v1/app/{app_id}/endpoint/{endpoint_id}/msg | List Attempted Messages |
| [**listByEndpoint**](MessageAttemptApi.md#listByEndpoint) | **GET** /api/v1/app/{app_id}/attempt/endpoint/{endpoint_id} | List Attempts By Endpoint |
| [**listByEndpointDeprecated**](MessageAttemptApi.md#listByEndpointDeprecated) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/attempt | List Attempts For Endpoint |
| [**listByMsg**](MessageAttemptApi.md#listByMsg) | **GET** /api/v1/app/{app_id}/attempt/msg/{msg_id} | List Attempts By Msg |
| [**listByMsgAttempt**](MessageAttemptApi.md#listByMsgAttempt) | **GET** /api/v1/app/{app_id}/msg/{msg_id}/attempt | List Attempts |
| [**resendWebhook**](MessageAttemptApi.md#resendWebhook) | **POST** /api/v1/app/{app_id}/msg/{msg_id}/endpoint/{endpoint_id}/resend | Resend Webhook |


<a name="deleteResponseBody"></a>
# **deleteResponseBody**
> deleteResponseBody(appId, msgId, attemptId).execute();

Delete attempt response body

Deletes the given attempt&#39;s response body. Useful when an endpoint accidentally returned sensitive content.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    String msgId = "unique-msg-identifier"; // The msg's ID or UID
    String attemptId = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The attempt's ID
    try {
      client
              .messageAttempt
              .deleteResponseBody(appId, msgId, attemptId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#deleteResponseBody");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .messageAttempt
              .deleteResponseBody(appId, msgId, attemptId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#deleteResponseBody");
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
| **msgId** | **String**| The msg&#39;s ID or UID | |
| **attemptId** | **String**| The attempt&#39;s ID | |

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

<a name="getByAttempt"></a>
# **getByAttempt**
> MessageAttemptOut getByAttempt(appId, msgId, attemptId).execute();

Get Attempt

&#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    String msgId = "unique-msg-identifier"; // The msg's ID or UID
    String attemptId = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The attempt's ID
    try {
      MessageAttemptOut result = client
              .messageAttempt
              .getByAttempt(appId, msgId, attemptId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
      System.out.println(result.getResponse());
      System.out.println(result.getResponseStatusCode());
      System.out.println(result.getStatus());
      System.out.println(result.getTriggerType());
      System.out.println(result.getMsgId());
      System.out.println(result.getEndpointId());
      System.out.println(result.getId());
      System.out.println(result.getTimestamp());
      System.out.println(result.getMsg());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#getByAttempt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageAttemptOut> response = client
              .messageAttempt
              .getByAttempt(appId, msgId, attemptId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#getByAttempt");
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
| **msgId** | **String**| The msg&#39;s ID or UID | |
| **attemptId** | **String**| The attempt&#39;s ID | |

### Return type

[**MessageAttemptOut**](MessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listAttemptedDestinations"></a>
# **listAttemptedDestinations**
> ListResponseMessageEndpointOut listAttemptedDestinations(appId, msgId).limit(limit).iterator(iterator).execute();

List Attempted Destinations

List endpoints attempted by a given message. Additionally includes metadata about the latest message attempt. By default, endpoints are listed in ascending order by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    String msgId = "unique-msg-identifier"; // The msg's ID or UID
    Integer limit = 56; // Limit the number of returned items
    String iterator = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    try {
      ListResponseMessageEndpointOut result = client
              .messageAttempt
              .listAttemptedDestinations(appId, msgId)
              .limit(limit)
              .iterator(iterator)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listAttemptedDestinations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseMessageEndpointOut> response = client
              .messageAttempt
              .listAttemptedDestinations(appId, msgId)
              .limit(limit)
              .iterator(iterator)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listAttemptedDestinations");
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
| **msgId** | **String**| The msg&#39;s ID or UID | |
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |

### Return type

[**ListResponseMessageEndpointOut**](ListResponseMessageEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listAttemptedMessages"></a>
# **listAttemptedMessages**
> ListResponseEndpointMessageOut listAttemptedMessages(appId, endpointId).limit(limit).iterator(iterator).channel(channel).tag(tag).status(status).before(before).after(after).withContent(withContent).eventTypes(eventTypes).execute();

List Attempted Messages

List messages for a particular endpoint. Additionally includes metadata about the latest message attempt.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    Integer limit = 56; // Limit the number of returned items
    String iterator = "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    String channel = "project_1337"; // Filter response based on the channel
    String tag = "project_1337"; // Filter response based on the message tags
    MessageStatus status = MessageStatus.fromValue("0"); // Filter response based on the delivery status
    OffsetDateTime before = OffsetDateTime.now(); // Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // Only include items created after a certain date
    Boolean withContent = true; // When `true` message payloads are included in the response
    Set<String> eventTypes = Arrays.asList(); // Filter response based on the event type
    try {
      ListResponseEndpointMessageOut result = client
              .messageAttempt
              .listAttemptedMessages(appId, endpointId)
              .limit(limit)
              .iterator(iterator)
              .channel(channel)
              .tag(tag)
              .status(status)
              .before(before)
              .after(after)
              .withContent(withContent)
              .eventTypes(eventTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listAttemptedMessages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseEndpointMessageOut> response = client
              .messageAttempt
              .listAttemptedMessages(appId, endpointId)
              .limit(limit)
              .iterator(iterator)
              .channel(channel)
              .tag(tag)
              .status(status)
              .before(before)
              .after(after)
              .withContent(withContent)
              .eventTypes(eventTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listAttemptedMessages");
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
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |
| **channel** | **String**| Filter response based on the channel | [optional] |
| **tag** | **String**| Filter response based on the message tags | [optional] |
| **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3] |
| **before** | **OffsetDateTime**| Only include items created before a certain date | [optional] |
| **after** | **OffsetDateTime**| Only include items created after a certain date | [optional] |
| **withContent** | **Boolean**| When &#x60;true&#x60; message payloads are included in the response | [optional] [default to true] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional] |

### Return type

[**ListResponseEndpointMessageOut**](ListResponseEndpointMessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listByEndpoint"></a>
# **listByEndpoint**
> ListResponseMessageAttemptOut listByEndpoint(appId, endpointId).limit(limit).iterator(iterator).status(status).statusCodeClass(statusCodeClass).channel(channel).tag(tag).before(before).after(after).withContent(withContent).withMsg(withMsg).eventTypes(eventTypes).execute();

List Attempts By Endpoint

List attempts by endpoint id  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    Integer limit = 56; // Limit the number of returned items
    String iterator = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    MessageStatus status = MessageStatus.fromValue("0"); // Filter response based on the delivery status
    StatusCodeClass statusCodeClass = StatusCodeClass.fromValue("0"); // Filter response based on the HTTP status code
    String channel = "project_1337"; // Filter response based on the channel
    String tag = "project_1337"; // Filter response based on the tag
    OffsetDateTime before = OffsetDateTime.now(); // Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // Only include items created after a certain date
    Boolean withContent = true; // When `true` attempt content is included in the response
    Boolean withMsg = false; // When `true`, the message information is included in the response
    Set<String> eventTypes = Arrays.asList(); // Filter response based on the event type
    try {
      ListResponseMessageAttemptOut result = client
              .messageAttempt
              .listByEndpoint(appId, endpointId)
              .limit(limit)
              .iterator(iterator)
              .status(status)
              .statusCodeClass(statusCodeClass)
              .channel(channel)
              .tag(tag)
              .before(before)
              .after(after)
              .withContent(withContent)
              .withMsg(withMsg)
              .eventTypes(eventTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listByEndpoint");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseMessageAttemptOut> response = client
              .messageAttempt
              .listByEndpoint(appId, endpointId)
              .limit(limit)
              .iterator(iterator)
              .status(status)
              .statusCodeClass(statusCodeClass)
              .channel(channel)
              .tag(tag)
              .before(before)
              .after(after)
              .withContent(withContent)
              .withMsg(withMsg)
              .eventTypes(eventTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listByEndpoint");
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
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |
| **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3] |
| **statusCodeClass** | [**StatusCodeClass**](.md)| Filter response based on the HTTP status code | [optional] [enum: 0, 100, 200, 300, 400, 500] |
| **channel** | **String**| Filter response based on the channel | [optional] |
| **tag** | **String**| Filter response based on the tag | [optional] |
| **before** | **OffsetDateTime**| Only include items created before a certain date | [optional] |
| **after** | **OffsetDateTime**| Only include items created after a certain date | [optional] |
| **withContent** | **Boolean**| When &#x60;true&#x60; attempt content is included in the response | [optional] [default to true] |
| **withMsg** | **Boolean**| When &#x60;true&#x60;, the message information is included in the response | [optional] [default to false] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional] |

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listByEndpointDeprecated"></a>
# **listByEndpointDeprecated**
> ListResponseMessageAttemptEndpointOut listByEndpointDeprecated(appId, msgId, endpointId).limit(limit).iterator(iterator).channel(channel).tag(tag).status(status).before(before).after(after).eventTypes(eventTypes).execute();

List Attempts For Endpoint

DEPRECATED: please use list_attempts with endpoint_id as a query parameter instead.  List the message attempts for a particular endpoint.  Returning the endpoint.  The &#x60;before&#x60; parameter lets you filter all items created before a certain date and is ignored if an iterator is passed.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    String msgId = "unique-msg-identifier"; // The msg's ID or UID
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    Integer limit = 56; // Limit the number of returned items
    String iterator = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    String channel = "project_1337"; // Filter response based on the channel
    String tag = "project_1337"; // Filter response based on the tag
    MessageStatus status = MessageStatus.fromValue("0"); // Filter response based on the delivery status
    OffsetDateTime before = OffsetDateTime.now(); // Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // Only include items created after a certain date
    Set<String> eventTypes = Arrays.asList(); // Filter response based on the event type
    try {
      ListResponseMessageAttemptEndpointOut result = client
              .messageAttempt
              .listByEndpointDeprecated(appId, msgId, endpointId)
              .limit(limit)
              .iterator(iterator)
              .channel(channel)
              .tag(tag)
              .status(status)
              .before(before)
              .after(after)
              .eventTypes(eventTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listByEndpointDeprecated");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseMessageAttemptEndpointOut> response = client
              .messageAttempt
              .listByEndpointDeprecated(appId, msgId, endpointId)
              .limit(limit)
              .iterator(iterator)
              .channel(channel)
              .tag(tag)
              .status(status)
              .before(before)
              .after(after)
              .eventTypes(eventTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listByEndpointDeprecated");
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
| **msgId** | **String**| The msg&#39;s ID or UID | |
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |
| **channel** | **String**| Filter response based on the channel | [optional] |
| **tag** | **String**| Filter response based on the tag | [optional] |
| **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3] |
| **before** | **OffsetDateTime**| Only include items created before a certain date | [optional] |
| **after** | **OffsetDateTime**| Only include items created after a certain date | [optional] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional] |

### Return type

[**ListResponseMessageAttemptEndpointOut**](ListResponseMessageAttemptEndpointOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listByMsg"></a>
# **listByMsg**
> ListResponseMessageAttemptOut listByMsg(appId, msgId).limit(limit).iterator(iterator).status(status).statusCodeClass(statusCodeClass).channel(channel).tag(tag).endpointId(endpointId).before(before).after(after).withContent(withContent).eventTypes(eventTypes).execute();

List Attempts By Msg

List attempts by message id  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    String msgId = "unique-msg-identifier"; // The msg's ID or UID
    Integer limit = 56; // Limit the number of returned items
    String iterator = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    MessageStatus status = MessageStatus.fromValue("0"); // Filter response based on the delivery status
    StatusCodeClass statusCodeClass = StatusCodeClass.fromValue("0"); // Filter response based on the HTTP status code
    String channel = "project_1337"; // Filter response based on the channel
    String tag = "project_1337"; // Filter response based on the tag
    String endpointId = "unique-ep-identifier"; // Filter the attempts based on the attempted endpoint
    OffsetDateTime before = OffsetDateTime.now(); // Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // Only include items created after a certain date
    Boolean withContent = true; // When `true` attempt content is included in the response
    Set<String> eventTypes = Arrays.asList(); // Filter response based on the event type
    try {
      ListResponseMessageAttemptOut result = client
              .messageAttempt
              .listByMsg(appId, msgId)
              .limit(limit)
              .iterator(iterator)
              .status(status)
              .statusCodeClass(statusCodeClass)
              .channel(channel)
              .tag(tag)
              .endpointId(endpointId)
              .before(before)
              .after(after)
              .withContent(withContent)
              .eventTypes(eventTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listByMsg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseMessageAttemptOut> response = client
              .messageAttempt
              .listByMsg(appId, msgId)
              .limit(limit)
              .iterator(iterator)
              .status(status)
              .statusCodeClass(statusCodeClass)
              .channel(channel)
              .tag(tag)
              .endpointId(endpointId)
              .before(before)
              .after(after)
              .withContent(withContent)
              .eventTypes(eventTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listByMsg");
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
| **msgId** | **String**| The msg&#39;s ID or UID | |
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |
| **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3] |
| **statusCodeClass** | [**StatusCodeClass**](.md)| Filter response based on the HTTP status code | [optional] [enum: 0, 100, 200, 300, 400, 500] |
| **channel** | **String**| Filter response based on the channel | [optional] |
| **tag** | **String**| Filter response based on the tag | [optional] |
| **endpointId** | **String**| Filter the attempts based on the attempted endpoint | [optional] |
| **before** | **OffsetDateTime**| Only include items created before a certain date | [optional] |
| **after** | **OffsetDateTime**| Only include items created after a certain date | [optional] |
| **withContent** | **Boolean**| When &#x60;true&#x60; attempt content is included in the response | [optional] [default to true] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional] |

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listByMsgAttempt"></a>
# **listByMsgAttempt**
> ListResponseMessageAttemptOut listByMsgAttempt(appId, msgId).limit(limit).iterator(iterator).endpointId(endpointId).channel(channel).tag(tag).status(status).before(before).after(after).statusCodeClass(statusCodeClass).eventTypes(eventTypes).execute();

List Attempts

Deprecated: Please use \&quot;List Attempts by Endpoint\&quot; and \&quot;List Attempts by Msg\&quot; instead.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate.  &#x60;msg_id&#x60;: Use a message id or a message &#x60;eventId&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    String msgId = "unique-msg-identifier"; // The msg's ID or UID
    Integer limit = 56; // Limit the number of returned items
    String iterator = "atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    String endpointId = "unique-ep-identifier"; // Filter the attempts based on the attempted endpoint
    String channel = "project_1337"; // Filter response based on the channel
    String tag = "project_1337"; // Filter response based on the tag
    MessageStatus status = MessageStatus.fromValue("0"); // Filter response based on the delivery status
    OffsetDateTime before = OffsetDateTime.now(); // Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // Only include items created after a certain date
    StatusCodeClass statusCodeClass = StatusCodeClass.fromValue("0"); // Filter response based on the HTTP status code
    Set<String> eventTypes = Arrays.asList(); // Filter response based on the event type
    try {
      ListResponseMessageAttemptOut result = client
              .messageAttempt
              .listByMsgAttempt(appId, msgId)
              .limit(limit)
              .iterator(iterator)
              .endpointId(endpointId)
              .channel(channel)
              .tag(tag)
              .status(status)
              .before(before)
              .after(after)
              .statusCodeClass(statusCodeClass)
              .eventTypes(eventTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listByMsgAttempt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseMessageAttemptOut> response = client
              .messageAttempt
              .listByMsgAttempt(appId, msgId)
              .limit(limit)
              .iterator(iterator)
              .endpointId(endpointId)
              .channel(channel)
              .tag(tag)
              .status(status)
              .before(before)
              .after(after)
              .statusCodeClass(statusCodeClass)
              .eventTypes(eventTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#listByMsgAttempt");
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
| **msgId** | **String**| The msg&#39;s ID or UID | |
| **limit** | **Integer**| Limit the number of returned items | [optional] |
| **iterator** | **String**| The iterator returned from a prior invocation | [optional] |
| **endpointId** | **String**| Filter the attempts based on the attempted endpoint | [optional] |
| **channel** | **String**| Filter response based on the channel | [optional] |
| **tag** | **String**| Filter response based on the tag | [optional] |
| **status** | [**MessageStatus**](.md)| Filter response based on the delivery status | [optional] [enum: 0, 1, 2, 3] |
| **before** | **OffsetDateTime**| Only include items created before a certain date | [optional] |
| **after** | **OffsetDateTime**| Only include items created after a certain date | [optional] |
| **statusCodeClass** | [**StatusCodeClass**](.md)| Filter response based on the HTTP status code | [optional] [enum: 0, 100, 200, 300, 400, 500] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional] |

### Return type

[**ListResponseMessageAttemptOut**](ListResponseMessageAttemptOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="resendWebhook"></a>
# **resendWebhook**
> resendWebhook(appId, msgId, endpointId).idempotencyKey(idempotencyKey).execute();

Resend Webhook

Resend a message to the specified endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageAttemptApi;
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
    String msgId = "unique-msg-identifier"; // The msg's ID or UID
    String endpointId = "unique-ep-identifier"; // The ep's ID or UID
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      client
              .messageAttempt
              .resendWebhook(appId, msgId, endpointId)
              .idempotencyKey(idempotencyKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#resendWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .messageAttempt
              .resendWebhook(appId, msgId, endpointId)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageAttemptApi#resendWebhook");
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
| **msgId** | **String**| The msg&#39;s ID or UID | |
| **endpointId** | **String**| The ep&#39;s ID or UID | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

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
| **202** | no content |  -  |


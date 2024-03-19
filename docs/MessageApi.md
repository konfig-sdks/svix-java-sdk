# MessageApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMsg**](MessageApi.md#createNewMsg) | **POST** /api/v1/app/{app_id}/msg | Create Message |
| [**deletePayload**](MessageApi.md#deletePayload) | **DELETE** /api/v1/app/{app_id}/msg/{msg_id}/content | Delete message payload |
| [**getByIdOrEventId**](MessageApi.md#getByIdOrEventId) | **GET** /api/v1/app/{app_id}/msg/{msg_id} | Get Message |
| [**listAllMessages**](MessageApi.md#listAllMessages) | **GET** /api/v1/app/{app_id}/msg | List Messages |


<a name="createNewMsg"></a>
# **createNewMsg**
> MessageOut createNewMsg(appId, messageIn).withContent(withContent).idempotencyKey(idempotencyKey).execute();

Create Message

Creates a new message and dispatches it to all of the application&#39;s endpoints.  The &#x60;eventId&#x60; is an optional custom unique ID. It&#39;s verified to be unique only up to a day, after that no verification will be made. If a message with the same &#x60;eventId&#x60; already exists for any application in your environment, a 409 conflict error will be returned.  The &#x60;eventType&#x60; indicates the type and schema of the event. All messages of a certain &#x60;eventType&#x60; are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have &#x60;channels&#x60;, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don&#39;t imply a specific message content or schema.  The &#x60;payload&#x60; property is the webhook&#39;s body (the actual webhook message). Svix supports payload sizes of up to ~350kb, though it&#39;s generally a good idea to keep webhook payloads small, probably no larger than 40kb.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
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
    Object payload = null;
    String appId = "unique-app-identifier"; // The app's ID or UID
    Set<String> tags = Arrays.asList(); // List of free-form tags that can be filtered by when listing messages
    String eventId = "eventId_example"; // Optional unique identifier for the message
    Set<String> channels = Arrays.asList(); // List of free-form identifiers that endpoints can filter by
    Long payloadRetentionPeriod = 90L;
    ApplicationIn application = new ApplicationIn();
    Object transformationsParams = null; // Extra parameters to pass to Transformations (for future use)
    Boolean withContent = true; // When `true` message payloads are included in the response
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      MessageOut result = client
              .message
              .createNewMsg(eventType, payload, appId)
              .tags(tags)
              .eventId(eventId)
              .channels(channels)
              .payloadRetentionPeriod(payloadRetentionPeriod)
              .application(application)
              .transformationsParams(transformationsParams)
              .withContent(withContent)
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
      System.err.println("Exception when calling MessageApi#createNewMsg");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageOut> response = client
              .message
              .createNewMsg(eventType, payload, appId)
              .tags(tags)
              .eventId(eventId)
              .channels(channels)
              .payloadRetentionPeriod(payloadRetentionPeriod)
              .application(application)
              .transformationsParams(transformationsParams)
              .withContent(withContent)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#createNewMsg");
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
| **messageIn** | [**MessageIn**](MessageIn.md)|  | |
| **withContent** | **Boolean**| When &#x60;true&#x60; message payloads are included in the response | [optional] [default to true] |
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

<a name="deletePayload"></a>
# **deletePayload**
> deletePayload(appId, msgId).execute();

Delete message payload

Delete the given message&#39;s payload. Useful in cases when a message was accidentally sent with sensitive content.  The message can&#39;t be replayed or resent once its payload has been deleted or expired.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
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
    try {
      client
              .message
              .deletePayload(appId, msgId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#deletePayload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .message
              .deletePayload(appId, msgId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#deletePayload");
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

<a name="getByIdOrEventId"></a>
# **getByIdOrEventId**
> MessageOut getByIdOrEventId(appId, msgId).withContent(withContent).execute();

Get Message

Get a message by its ID or eventID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
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
    Boolean withContent = true; // When `true` message payloads are included in the response
    try {
      MessageOut result = client
              .message
              .getByIdOrEventId(appId, msgId)
              .withContent(withContent)
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
      System.err.println("Exception when calling MessageApi#getByIdOrEventId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessageOut> response = client
              .message
              .getByIdOrEventId(appId, msgId)
              .withContent(withContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#getByIdOrEventId");
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
| **withContent** | **Boolean**| When &#x60;true&#x60; message payloads are included in the response | [optional] [default to true] |

### Return type

[**MessageOut**](MessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listAllMessages"></a>
# **listAllMessages**
> ListResponseMessageOut listAllMessages(appId).limit(limit).iterator(iterator).channel(channel).before(before).after(after).withContent(withContent).tag(tag).eventTypes(eventTypes).execute();

List Messages

List all of the application&#39;s messages.  The &#x60;before&#x60; and &#x60;after&#x60; parameters let you filter all items created before or after a certain date. These can be used alongside an iterator to paginate over results within a certain window.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessageApi;
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
    String iterator = "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2"; // The iterator returned from a prior invocation
    String channel = "project_1337"; // Filter response based on the channel
    OffsetDateTime before = OffsetDateTime.now(); // Only include items created before a certain date
    OffsetDateTime after = OffsetDateTime.now(); // Only include items created after a certain date
    Boolean withContent = true; // When `true` message payloads are included in the response
    String tag = "project_1337"; // Filter messages matching the provided tag
    Set<String> eventTypes = Arrays.asList(); // Filter response based on the event type
    try {
      ListResponseMessageOut result = client
              .message
              .listAllMessages(appId)
              .limit(limit)
              .iterator(iterator)
              .channel(channel)
              .before(before)
              .after(after)
              .withContent(withContent)
              .tag(tag)
              .eventTypes(eventTypes)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#listAllMessages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseMessageOut> response = client
              .message
              .listAllMessages(appId)
              .limit(limit)
              .iterator(iterator)
              .channel(channel)
              .before(before)
              .after(after)
              .withContent(withContent)
              .tag(tag)
              .eventTypes(eventTypes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessageApi#listAllMessages");
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
| **channel** | **String**| Filter response based on the channel | [optional] |
| **before** | **OffsetDateTime**| Only include items created before a certain date | [optional] |
| **after** | **OffsetDateTime**| Only include items created after a certain date | [optional] |
| **withContent** | **Boolean**| When &#x60;true&#x60; message payloads are included in the response | [optional] [default to true] |
| **tag** | **String**| Filter messages matching the provided tag | [optional] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| Filter response based on the event type | [optional] |

### Return type

[**ListResponseMessageOut**](ListResponseMessageOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


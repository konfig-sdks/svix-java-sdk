# EventTypeApi

All URIs are relative to *https://api.eu.svix.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archive**](EventTypeApi.md#archive) | **DELETE** /api/v1/event-type/{event_type_name} | Delete Event Type |
| [**createOrUpdate**](EventTypeApi.md#createOrUpdate) | **POST** /api/v1/event-type | Create Event Type |
| [**getEventType**](EventTypeApi.md#getEventType) | **GET** /api/v1/event-type/{event_type_name} | Get Event Type |
| [**importFromOpenapi**](EventTypeApi.md#importFromOpenapi) | **POST** /api/v1/event-type/import/openapi | Event Type Import From Openapi |
| [**list**](EventTypeApi.md#list) | **GET** /api/v1/event-type | List Event Types |
| [**partiallyUpdateEventType**](EventTypeApi.md#partiallyUpdateEventType) | **PATCH** /api/v1/event-type/{event_type_name} | Patch Event Type |
| [**updateEventTypeName**](EventTypeApi.md#updateEventTypeName) | **PUT** /api/v1/event-type/{event_type_name} | Update Event Type |


<a name="archive"></a>
# **archive**
> archive(eventTypeName).expunge(expunge).execute();

Delete Event Type

Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventTypeApi;
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
    String eventTypeName = "user.signup"; // The event type's name
    Boolean expunge = false; // By default event types are archived when \"deleted\". Passing this to `true` deletes them entirely.
    try {
      client
              .eventType
              .archive(eventTypeName)
              .expunge(expunge)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#archive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .eventType
              .archive(eventTypeName)
              .expunge(expunge)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#archive");
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
| **eventTypeName** | **String**| The event type&#39;s name | |
| **expunge** | **Boolean**| By default event types are archived when \&quot;deleted\&quot;. Passing this to &#x60;true&#x60; deletes them entirely. | [optional] [default to false] |

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

<a name="createOrUpdate"></a>
# **createOrUpdate**
> EventTypeOut createOrUpdate(eventTypeIn).idempotencyKey(idempotencyKey).execute();

Create Event Type

Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventTypeApi;
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
    String description = "description_example";
    String name = "name_example"; // The event type's name
    Boolean archived = false;
    Map<String, Object> schemas = new HashMap(); // The schema for the event type for a specific version as a JSON schema.
    String featureFlag = "featureFlag_example";
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      EventTypeOut result = client
              .eventType
              .createOrUpdate(description, name)
              .archived(archived)
              .schemas(schemas)
              .featureFlag(featureFlag)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getArchived());
      System.out.println(result.getSchemas());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getFeatureFlag());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#createOrUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventTypeOut> response = client
              .eventType
              .createOrUpdate(description, name)
              .archived(archived)
              .schemas(schemas)
              .featureFlag(featureFlag)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#createOrUpdate");
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
| **eventTypeIn** | [**EventTypeIn**](EventTypeIn.md)|  | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="getEventType"></a>
# **getEventType**
> EventTypeOut getEventType(eventTypeName).execute();

Get Event Type

Get an event type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventTypeApi;
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
    String eventTypeName = "user.signup"; // The event type's name
    try {
      EventTypeOut result = client
              .eventType
              .getEventType(eventTypeName)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getArchived());
      System.out.println(result.getSchemas());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getFeatureFlag());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#getEventType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventTypeOut> response = client
              .eventType
              .getEventType(eventTypeName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#getEventType");
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
| **eventTypeName** | **String**| The event type&#39;s name | |

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="importFromOpenapi"></a>
# **importFromOpenapi**
> EventTypeImportOpenApiOut importFromOpenapi(eventTypeImportOpenApiIn).idempotencyKey(idempotencyKey).execute();

Event Type Import From Openapi

Given an OpenAPI spec, create new or update existing event types. If an existing &#x60;archived&#x60; event type is updated, it will be unarchvied.  The importer will convert all webhooks found in the either the &#x60;webhooks&#x60; or &#x60;x-webhooks&#x60; top-level.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventTypeApi;
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
    Map<String, Object> spec = new HashMap(); // A pre-parsed JSON spec.
    String specRaw = "specRaw_example"; // A string, parsed by the server as YAML or JSON.
    String idempotencyKey = "idempotencyKey_example"; // The request's idempotency key
    try {
      EventTypeImportOpenApiOut result = client
              .eventType
              .importFromOpenapi()
              .spec(spec)
              .specRaw(specRaw)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#importFromOpenapi");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventTypeImportOpenApiOut> response = client
              .eventType
              .importFromOpenapi()
              .spec(spec)
              .specRaw(specRaw)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#importFromOpenapi");
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
| **eventTypeImportOpenApiIn** | [**EventTypeImportOpenApiIn**](EventTypeImportOpenApiIn.md)| Import a list of event types from webhooks defined in an OpenAPI spec.  The OpenAPI spec can be specified as either &#x60;spec&#x60; given the spec as a JSON object, or as &#x60;specRaw&#x60; (a &#x60;string&#x60;) which will be parsed as YAML or JSON by the server. Sending neither or both is invalid, resulting in a &#x60;400&#x60; **Bad Request**. | |
| **idempotencyKey** | **String**| The request&#39;s idempotency key | [optional] |

### Return type

[**EventTypeImportOpenApiOut**](EventTypeImportOpenApiOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="list"></a>
# **list**
> ListResponseEventTypeOut list().limit(limit).iterator(iterator).order(order).includeArchived(includeArchived).withContent(withContent).execute();

List Event Types

Return the list of event types.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventTypeApi;
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
    String iterator = "user.signup"; // The iterator returned from a prior invocation
    Ordering order = Ordering.fromValue("ascending"); // The sorting order of the returned items
    Boolean includeArchived = false; // When `true` archived (deleted but not expunged) items are included in the response
    Boolean withContent = false; // When `true` the full item (including the schema) is included in the response
    try {
      ListResponseEventTypeOut result = client
              .eventType
              .list()
              .limit(limit)
              .iterator(iterator)
              .order(order)
              .includeArchived(includeArchived)
              .withContent(withContent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getIterator());
      System.out.println(result.getPrevIterator());
      System.out.println(result.getDone());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListResponseEventTypeOut> response = client
              .eventType
              .list()
              .limit(limit)
              .iterator(iterator)
              .order(order)
              .includeArchived(includeArchived)
              .withContent(withContent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#list");
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
| **includeArchived** | **Boolean**| When &#x60;true&#x60; archived (deleted but not expunged) items are included in the response | [optional] [default to false] |
| **withContent** | **Boolean**| When &#x60;true&#x60; the full item (including the schema) is included in the response | [optional] [default to false] |

### Return type

[**ListResponseEventTypeOut**](ListResponseEventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="partiallyUpdateEventType"></a>
# **partiallyUpdateEventType**
> EventTypeOut partiallyUpdateEventType(eventTypeName, eventTypePatch).execute();

Patch Event Type

Partially update an event type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventTypeApi;
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
    String eventTypeName = "user.signup"; // The event type's name
    String description = "description_example";
    Boolean archived = true;
    Map<String, Object> schemas = new HashMap();
    String featureFlag = "featureFlag_example";
    try {
      EventTypeOut result = client
              .eventType
              .partiallyUpdateEventType(eventTypeName)
              .description(description)
              .archived(archived)
              .schemas(schemas)
              .featureFlag(featureFlag)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getArchived());
      System.out.println(result.getSchemas());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getFeatureFlag());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#partiallyUpdateEventType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventTypeOut> response = client
              .eventType
              .partiallyUpdateEventType(eventTypeName)
              .description(description)
              .archived(archived)
              .schemas(schemas)
              .featureFlag(featureFlag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#partiallyUpdateEventType");
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
| **eventTypeName** | **String**| The event type&#39;s name | |
| **eventTypePatch** | [**EventTypePatch**](EventTypePatch.md)|  | |

### Return type

[**EventTypeOut**](EventTypeOut.md)

### Authorization

[HTTPBearer](../README.md#HTTPBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateEventTypeName"></a>
# **updateEventTypeName**
> EventTypeOut updateEventTypeName(eventTypeName, eventTypeUpdate).execute();

Update Event Type

Update an event type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Svix;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventTypeApi;
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
    String description = "description_example";
    String eventTypeName = "user.signup"; // The event type's name
    Boolean archived = false;
    Map<String, Object> schemas = new HashMap(); // The schema for the event type for a specific version as a JSON schema.
    String featureFlag = "featureFlag_example";
    try {
      EventTypeOut result = client
              .eventType
              .updateEventTypeName(description, eventTypeName)
              .archived(archived)
              .schemas(schemas)
              .featureFlag(featureFlag)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getName());
      System.out.println(result.getArchived());
      System.out.println(result.getSchemas());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getFeatureFlag());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#updateEventTypeName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventTypeOut> response = client
              .eventType
              .updateEventTypeName(description, eventTypeName)
              .archived(archived)
              .schemas(schemas)
              .featureFlag(featureFlag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventTypeApi#updateEventTypeName");
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
| **eventTypeName** | **String**| The event type&#39;s name | |
| **eventTypeUpdate** | [**EventTypeUpdate**](EventTypeUpdate.md)|  | |

### Return type

[**EventTypeOut**](EventTypeOut.md)

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


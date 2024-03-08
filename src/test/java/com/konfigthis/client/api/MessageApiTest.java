/*
 * Svix API
 * Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`. For more information on authentication, please refer to the [authentication token docs](https://docs.svix.com/api-keys).     ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result for a period of up to 12 hours.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 
 *
 * The version of the OpenAPI document: 1.20.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ApplicationIn;
import com.konfigthis.client.model.ListResponseMessageOut;
import com.konfigthis.client.model.MessageIn;
import com.konfigthis.client.model.MessageOut;
import java.time.OffsetDateTime;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessageApi
 */
@Disabled
public class MessageApiTest {

    private static MessageApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MessageApi(apiClient);
    }

    /**
     * Create Message
     *
     * Creates a new message and dispatches it to all of the application&#39;s endpoints.  The &#x60;eventId&#x60; is an optional custom unique ID. It&#39;s verified to be unique only up to a day, after that no verification will be made. If a message with the same &#x60;eventId&#x60; already exists for any application in your environment, a 409 conflict error will be returned.  The &#x60;eventType&#x60; indicates the type and schema of the event. All messages of a certain &#x60;eventType&#x60; are expected to have the same schema. Endpoints can choose to only listen to specific event types. Messages can also have &#x60;channels&#x60;, which similar to event types let endpoints filter by them. Unlike event types, messages can have multiple channels, and channels don&#39;t imply a specific message content or schema.  The &#x60;payload&#x60; property is the webhook&#39;s body (the actual webhook message). Svix supports payload sizes of up to ~350kb, though it&#39;s generally a good idea to keep webhook payloads small, probably no larger than 40kb.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTest() throws ApiException {
        String eventType = null;
        Object payload = null;
        String appId = null;
        Set<String> tags = null;
        String eventId = null;
        Set<String> channels = null;
        Long payloadRetentionPeriod = null;
        ApplicationIn application = null;
        Object transformationsParams = null;
        Boolean withContent = null;
        String idempotencyKey = null;
        MessageOut response = api.createNew(eventType, payload, appId)
                .tags(tags)
                .eventId(eventId)
                .channels(channels)
                .payloadRetentionPeriod(payloadRetentionPeriod)
                .application(application)
                .transformationsParams(transformationsParams)
                .withContent(withContent)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete message payload
     *
     * Delete the given message&#39;s payload. Useful in cases when a message was accidentally sent with sensitive content.  The message can&#39;t be replayed or resent once its payload has been deleted or expired.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePayloadTest() throws ApiException {
        String appId = null;
        String msgId = null;
        api.deletePayload(appId, msgId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Message
     *
     * Get a message by its ID or eventID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdOrEventIdTest() throws ApiException {
        String appId = null;
        String msgId = null;
        Boolean withContent = null;
        MessageOut response = api.getByIdOrEventId(appId, msgId)
                .withContent(withContent)
                .execute();
        // TODO: test validations
    }

    /**
     * List Messages
     *
     * List all of the application&#39;s messages.  The &#x60;before&#x60; and &#x60;after&#x60; parameters let you filter all items created before or after a certain date. These can be used alongside an iterator to paginate over results within a certain window.  Note that by default this endpoint is limited to retrieving 90 days&#39; worth of data relative to now or, if an iterator is provided, 90 days before/after the time indicated by the iterator ID. If you require data beyond those time ranges, you will need to explicitly set the &#x60;before&#x60; or &#x60;after&#x60; parameter as appropriate. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllMessagesTest() throws ApiException {
        String appId = null;
        Integer limit = null;
        String iterator = null;
        String channel = null;
        OffsetDateTime before = null;
        OffsetDateTime after = null;
        Boolean withContent = null;
        String tag = null;
        Set<String> eventTypes = null;
        ListResponseMessageOut response = api.listAllMessages(appId)
                .limit(limit)
                .iterator(iterator)
                .channel(channel)
                .before(before)
                .after(after)
                .withContent(withContent)
                .tag(tag)
                .eventTypes(eventTypes)
                .execute();
        // TODO: test validations
    }

}
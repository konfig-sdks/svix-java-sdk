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
import com.konfigthis.client.model.EndpointHeadersIn;
import com.konfigthis.client.model.EndpointHeadersOut;
import com.konfigthis.client.model.EndpointHeadersPatchIn;
import com.konfigthis.client.model.EndpointIn;
import com.konfigthis.client.model.EndpointOut;
import com.konfigthis.client.model.EndpointPatch;
import com.konfigthis.client.model.EndpointSecretOut;
import com.konfigthis.client.model.EndpointSecretRotateIn;
import com.konfigthis.client.model.EndpointStats;
import com.konfigthis.client.model.EndpointTransformationIn;
import com.konfigthis.client.model.EndpointTransformationOut;
import com.konfigthis.client.model.EndpointUpdate;
import com.konfigthis.client.model.EventExampleIn;
import com.konfigthis.client.model.ListResponseEndpointOut;
import com.konfigthis.client.model.MessageOut;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.Ordering;
import com.konfigthis.client.model.RecoverIn;
import com.konfigthis.client.model.RecoverOut;
import com.konfigthis.client.model.ReplayIn;
import com.konfigthis.client.model.ReplayOut;
import java.net.URI;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EndpointApi
 */
@Disabled
public class EndpointApiTest {

    private static EndpointApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EndpointApi(apiClient);
    }

    /**
     * Create Endpoint
     *
     * Create a new endpoint for the application.  When &#x60;secret&#x60; is &#x60;null&#x60; the secret is automatically generated (recommended)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTest() throws ApiException {
        URI url = null;
        String appId = null;
        String description = null;
        Integer version = null;
        Integer rateLimit = null;
        String uid = null;
        Boolean disabled = null;
        Set<String> filterTypes = null;
        Set<String> channels = null;
        String secret = null;
        Map<String, String> metadata = null;
        String idempotencyKey = null;
        EndpointOut response = api.createNew(url, appId)
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
        // TODO: test validations
    }

    /**
     * Get Endpoint
     *
     * Get an endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEndpointTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        EndpointOut response = api.getEndpoint(appId, endpointId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Endpoint Headers
     *
     * Get the additional headers to be sent with the webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHeadersTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        EndpointHeadersOut response = api.getHeaders(appId, endpointId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Endpoint Secret
     *
     * Get the endpoint&#39;s signing secret.  This is used to verify the authenticity of the webhook. For more information please refer to [the consuming webhooks docs](https://docs.svix.com/consuming-webhooks/).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecretTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        EndpointSecretOut response = api.getSecret(appId, endpointId)
                .execute();
        // TODO: test validations
    }

    /**
     * Endpoint Stats
     *
     * Get basic statistics for the endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStatsTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        OffsetDateTime since = null;
        OffsetDateTime until = null;
        EndpointStats response = api.getStats(appId, endpointId)
                .since(since)
                .until(until)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Endpoint Transformation
     *
     * Get the transformation code associated with this endpoint
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransformationCodeTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        EndpointTransformationOut response = api.getTransformationCode(appId, endpointId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Endpoints
     *
     * List the application&#39;s endpoints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEndpointsTest() throws ApiException {
        String appId = null;
        Integer limit = null;
        String iterator = null;
        Ordering order = null;
        ListResponseEndpointOut response = api.listEndpoints(appId)
                .limit(limit)
                .iterator(iterator)
                .order(order)
                .execute();
        // TODO: test validations
    }

    /**
     * Patch Endpoint Headers
     *
     * Partially set the additional headers to be sent with the webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void partiallySetHeadersTest() throws ApiException {
        Map<String, String> headers = null;
        String appId = null;
        String endpointId = null;
        api.partiallySetHeaders(headers, appId, endpointId)
                .execute();
        // TODO: test validations
    }

    /**
     * Patch Endpoint
     *
     * Partially update an endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void partiallyUpdateTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        String description = null;
        Integer version = null;
        Integer rateLimit = null;
        String uid = null;
        URI url = null;
        Boolean disabled = null;
        Set<String> filterTypes = null;
        Set<String> channels = null;
        String secret = null;
        Map<String, String> metadata = null;
        EndpointOut response = api.partiallyUpdate(appId, endpointId)
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
        // TODO: test validations
    }

    /**
     * Delete Endpoint
     *
     * Delete an endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        api.remove(appId, endpointId)
                .execute();
        // TODO: test validations
    }

    /**
     * Replay Missing Webhooks
     *
     * Replays messages to the endpoint. Only messages that were created after &#x60;since&#x60; will be sent. Messages that were previously sent to the endpoint are not resent.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replayMissingWebhooksTest() throws ApiException {
        OffsetDateTime since = null;
        String appId = null;
        String endpointId = null;
        OffsetDateTime until = null;
        String idempotencyKey = null;
        ReplayOut response = api.replayMissingWebhooks(since, appId, endpointId)
                .until(until)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Recover Failed Webhooks
     *
     * Resend all failed messages since a given time.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendFailedWebhooksTest() throws ApiException {
        OffsetDateTime since = null;
        String appId = null;
        String endpointId = null;
        OffsetDateTime until = null;
        String idempotencyKey = null;
        RecoverOut response = api.resendFailedWebhooks(since, appId, endpointId)
                .until(until)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Rotate Endpoint Secret
     *
     * Rotates the endpoint&#39;s signing secret.  The previous secret will be valid for the next 24 hours.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rotateSecretTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        String key = null;
        String idempotencyKey = null;
        api.rotateSecret(appId, endpointId)
                .key(key)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Send Event Type Example Message
     *
     * Send an example message for event
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendExampleMessageTest() throws ApiException {
        String eventType = null;
        String appId = null;
        String endpointId = null;
        String idempotencyKey = null;
        MessageOut response = api.sendExampleMessage(eventType, appId, endpointId)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Set Endpoint Transformation
     *
     * Set or unset the transformation code associated with this endpoint
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setTransformationCodeTest() throws ApiException {
        String appId = null;
        String endpointId = null;
        String code = null;
        Boolean enabled = null;
        api.setTransformationCode(appId, endpointId)
                .code(code)
                .enabled(enabled)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Endpoint
     *
     * Update an endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEndpointTest() throws ApiException {
        URI url = null;
        String appId = null;
        String endpointId = null;
        String description = null;
        Integer version = null;
        Integer rateLimit = null;
        String uid = null;
        Boolean disabled = null;
        Set<String> filterTypes = null;
        Set<String> channels = null;
        Map<String, String> metadata = null;
        EndpointOut response = api.updateEndpoint(url, appId, endpointId)
                .description(description)
                .version(version)
                .rateLimit(rateLimit)
                .uid(uid)
                .disabled(disabled)
                .filterTypes(filterTypes)
                .channels(channels)
                .metadata(metadata)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Endpoint Headers
     *
     * Set the additional headers to be sent with the webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateHeadersTest() throws ApiException {
        Map<String, String> headers = null;
        String appId = null;
        String endpointId = null;
        api.updateHeaders(headers, appId, endpointId)
                .execute();
        // TODO: test validations
    }

}

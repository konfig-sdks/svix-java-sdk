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
import com.konfigthis.client.model.AppPortalAccessIn;
import com.konfigthis.client.model.AppPortalAccessOut;
import com.konfigthis.client.model.ApplicationTokenExpireIn;
import com.konfigthis.client.model.DashboardAccessOut;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private static AuthenticationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AuthenticationApi(apiClient);
    }

    /**
     * Expire All
     *
     * Expire all of the tokens associated with a specific Application
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void expireAppTokensTest() throws ApiException {
        String appId = null;
        Long expiry = null;
        String idempotencyKey = null;
        api.expireAppTokens(appId)
                .expiry(expiry)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Dashboard Access
     *
     * DEPRECATED: Please use &#x60;app-portal-access&#x60; instead.  Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateMagicLinkTest() throws ApiException {
        String appId = null;
        String idempotencyKey = null;
        DashboardAccessOut response = api.generateMagicLink(appId)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Consumer App Portal Access
     *
     * Use this function to get magic links (and authentication codes) for connecting your users to the Consumer Application Portal.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void obtainMagicLinkAndCodeTest() throws ApiException {
        String appId = null;
        Set<String> featureFlags = null;
        Integer expiry = null;
        String idempotencyKey = null;
        AppPortalAccessOut response = api.obtainMagicLinkAndCode(appId)
                .featureFlags(featureFlags)
                .expiry(expiry)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Logout
     *
     * Logout an app token.  Trying to log out other tokens will fail.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeTokenTest() throws ApiException {
        String idempotencyKey = null;
        api.revokeToken()
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

}

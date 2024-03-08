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


package com.konfigthis.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.CustomColorPalette;
import com.konfigthis.client.model.CustomThemeOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for SettingsOut
 */
public class SettingsOutTest {
    private final SettingsOut model = new SettingsOut();

    /**
     * Model tests for SettingsOut
     */
    @Test
    public void testSettingsOut() {
        // TODO: test SettingsOut
    }

    /**
     * Test the property 'customColor'
     */
    @Test
    public void customColorTest() {
        // TODO: test customColor
    }

    /**
     * Test the property 'customLogoUrl'
     */
    @Test
    public void customLogoUrlTest() {
        // TODO: test customLogoUrl
    }

    /**
     * Test the property 'customThemeOverride'
     */
    @Test
    public void customThemeOverrideTest() {
        // TODO: test customThemeOverride
    }

    /**
     * Test the property 'customBaseFontSize'
     */
    @Test
    public void customBaseFontSizeTest() {
        // TODO: test customBaseFontSize
    }

    /**
     * Test the property 'customFontFamily'
     */
    @Test
    public void customFontFamilyTest() {
        // TODO: test customFontFamily
    }

    /**
     * Test the property 'customFontFamilyUrl'
     */
    @Test
    public void customFontFamilyUrlTest() {
        // TODO: test customFontFamilyUrl
    }

    /**
     * Test the property 'disableEndpointOnFailure'
     */
    @Test
    public void disableEndpointOnFailureTest() {
        // TODO: test disableEndpointOnFailure
    }

    /**
     * Test the property 'displayName'
     */
    @Test
    public void displayNameTest() {
        // TODO: test displayName
    }

    /**
     * Test the property 'eventCatalogPublished'
     */
    @Test
    public void eventCatalogPublishedTest() {
        // TODO: test eventCatalogPublished
    }

    /**
     * Test the property 'enforceHttps'
     */
    @Test
    public void enforceHttpsTest() {
        // TODO: test enforceHttps
    }

    /**
     * Test the property 'enableChannels'
     */
    @Test
    public void enableChannelsTest() {
        // TODO: test enableChannels
    }

    /**
     * Test the property 'readOnly'
     */
    @Test
    public void readOnlyTest() {
        // TODO: test readOnly
    }

    /**
     * Test the property 'enableIntegrationManagement'
     */
    @Test
    public void enableIntegrationManagementTest() {
        // TODO: test enableIntegrationManagement
    }

    /**
     * Test the property 'enableTransformations'
     */
    @Test
    public void enableTransformationsTest() {
        // TODO: test enableTransformations
    }

    /**
     * Test the property 'colorPaletteLight'
     */
    @Test
    public void colorPaletteLightTest() {
        // TODO: test colorPaletteLight
    }

    /**
     * Test the property 'colorPaletteDark'
     */
    @Test
    public void colorPaletteDarkTest() {
        // TODO: test colorPaletteDark
    }

    /**
     * Test the property 'showUseSvixPlay'
     */
    @Test
    public void showUseSvixPlayTest() {
        // TODO: test showUseSvixPlay
    }

}

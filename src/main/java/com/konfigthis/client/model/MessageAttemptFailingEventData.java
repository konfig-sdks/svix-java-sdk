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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.MessageAttemptFailedData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Sent when a message delivery has failed (all of the retry attempts have been exhausted) as a \&quot;message.attempt.exhausted\&quot; type or after it&#39;s failed four times as a \&quot;message.attempt.failing\&quot; event.
 */
@ApiModel(description = "Sent when a message delivery has failed (all of the retry attempts have been exhausted) as a \"message.attempt.exhausted\" type or after it's failed four times as a \"message.attempt.failing\" event.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MessageAttemptFailingEventData {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_APP_UID = "appUid";
  @SerializedName(SERIALIZED_NAME_APP_UID)
  private String appUid;

  public static final String SERIALIZED_NAME_MSG_ID = "msgId";
  @SerializedName(SERIALIZED_NAME_MSG_ID)
  private String msgId;

  public static final String SERIALIZED_NAME_MSG_EVENT_ID = "msgEventId";
  @SerializedName(SERIALIZED_NAME_MSG_EVENT_ID)
  private String msgEventId;

  public static final String SERIALIZED_NAME_ENDPOINT_ID = "endpointId";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private String endpointId;

  public static final String SERIALIZED_NAME_LAST_ATTEMPT = "lastAttempt";
  @SerializedName(SERIALIZED_NAME_LAST_ATTEMPT)
  private MessageAttemptFailedData lastAttempt;

  public MessageAttemptFailingEventData() {
  }

  public MessageAttemptFailingEventData appId(String appId) {
    
    
    
    
    this.appId = appId;
    return this;
  }

   /**
   * The app&#39;s ID
   * @return appId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The app's ID")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    
    
    
    this.appId = appId;
  }


  public MessageAttemptFailingEventData appUid(String appUid) {
    
    
    if (appUid != null && appUid.length() < 1) {
      throw new IllegalArgumentException("Invalid value for appUid. Length must be greater than or equal to 1.");
    }
    
    this.appUid = appUid;
    return this;
  }

   /**
   * The app&#39;s UID
   * @return appUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-app-identifier", value = "The app's UID")

  public String getAppUid() {
    return appUid;
  }


  public void setAppUid(String appUid) {
    
    
    if (appUid != null && appUid.length() < 1) {
      throw new IllegalArgumentException("Invalid value for appUid. Length must be greater than or equal to 1.");
    }
    this.appUid = appUid;
  }


  public MessageAttemptFailingEventData msgId(String msgId) {
    
    
    
    
    this.msgId = msgId;
    return this;
  }

   /**
   * The msg&#39;s ID
   * @return msgId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "msg_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The msg's ID")

  public String getMsgId() {
    return msgId;
  }


  public void setMsgId(String msgId) {
    
    
    
    this.msgId = msgId;
  }


  public MessageAttemptFailingEventData msgEventId(String msgEventId) {
    
    
    if (msgEventId != null && msgEventId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for msgEventId. Length must be greater than or equal to 1.");
    }
    
    this.msgEventId = msgEventId;
    return this;
  }

   /**
   * The msg&#39;s UID
   * @return msgEventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-msg-identifier", value = "The msg's UID")

  public String getMsgEventId() {
    return msgEventId;
  }


  public void setMsgEventId(String msgEventId) {
    
    
    if (msgEventId != null && msgEventId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for msgEventId. Length must be greater than or equal to 1.");
    }
    this.msgEventId = msgEventId;
  }


  public MessageAttemptFailingEventData endpointId(String endpointId) {
    
    
    
    
    this.endpointId = endpointId;
    return this;
  }

   /**
   * The ep&#39;s ID
   * @return endpointId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The ep's ID")

  public String getEndpointId() {
    return endpointId;
  }


  public void setEndpointId(String endpointId) {
    
    
    
    this.endpointId = endpointId;
  }


  public MessageAttemptFailingEventData lastAttempt(MessageAttemptFailedData lastAttempt) {
    
    
    
    
    this.lastAttempt = lastAttempt;
    return this;
  }

   /**
   * Get lastAttempt
   * @return lastAttempt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MessageAttemptFailedData getLastAttempt() {
    return lastAttempt;
  }


  public void setLastAttempt(MessageAttemptFailedData lastAttempt) {
    
    
    
    this.lastAttempt = lastAttempt;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the MessageAttemptFailingEventData instance itself
   */
  public MessageAttemptFailingEventData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageAttemptFailingEventData messageAttemptFailingEventData = (MessageAttemptFailingEventData) o;
    return Objects.equals(this.appId, messageAttemptFailingEventData.appId) &&
        Objects.equals(this.appUid, messageAttemptFailingEventData.appUid) &&
        Objects.equals(this.msgId, messageAttemptFailingEventData.msgId) &&
        Objects.equals(this.msgEventId, messageAttemptFailingEventData.msgEventId) &&
        Objects.equals(this.endpointId, messageAttemptFailingEventData.endpointId) &&
        Objects.equals(this.lastAttempt, messageAttemptFailingEventData.lastAttempt)&&
        Objects.equals(this.additionalProperties, messageAttemptFailingEventData.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appUid, msgId, msgEventId, endpointId, lastAttempt, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageAttemptFailingEventData {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appUid: ").append(toIndentedString(appUid)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    msgEventId: ").append(toIndentedString(msgEventId)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    lastAttempt: ").append(toIndentedString(lastAttempt)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("appId");
    openapiFields.add("appUid");
    openapiFields.add("msgId");
    openapiFields.add("msgEventId");
    openapiFields.add("endpointId");
    openapiFields.add("lastAttempt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("appId");
    openapiRequiredFields.add("msgId");
    openapiRequiredFields.add("endpointId");
    openapiRequiredFields.add("lastAttempt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageAttemptFailingEventData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MessageAttemptFailingEventData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageAttemptFailingEventData is not found in the empty JSON string", MessageAttemptFailingEventData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageAttemptFailingEventData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
      }
      if (!jsonObj.get("appUid").isJsonNull() && (jsonObj.get("appUid") != null && !jsonObj.get("appUid").isJsonNull()) && !jsonObj.get("appUid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appUid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appUid").toString()));
      }
      if (!jsonObj.get("msgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msgId").toString()));
      }
      if (!jsonObj.get("msgEventId").isJsonNull() && (jsonObj.get("msgEventId") != null && !jsonObj.get("msgEventId").isJsonNull()) && !jsonObj.get("msgEventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msgEventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msgEventId").toString()));
      }
      if (!jsonObj.get("endpointId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpointId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpointId").toString()));
      }
      // validate the required field `lastAttempt`
      MessageAttemptFailedData.validateJsonObject(jsonObj.getAsJsonObject("lastAttempt"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageAttemptFailingEventData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageAttemptFailingEventData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageAttemptFailingEventData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageAttemptFailingEventData.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageAttemptFailingEventData>() {
           @Override
           public void write(JsonWriter out, MessageAttemptFailingEventData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageAttemptFailingEventData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MessageAttemptFailingEventData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageAttemptFailingEventData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageAttemptFailingEventData
  * @throws IOException if the JSON string is invalid with respect to MessageAttemptFailingEventData
  */
  public static MessageAttemptFailingEventData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageAttemptFailingEventData.class);
  }

 /**
  * Convert an instance of MessageAttemptFailingEventData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


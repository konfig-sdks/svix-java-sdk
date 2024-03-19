/*
 * Svix API
 * Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`. For more information on authentication, please refer to the [authentication token docs](https://docs.svix.com/api-keys).     ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result for a period of up to 12 hours.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 
 *
 * The version of the OpenAPI document: 1.21.0
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
import com.konfigthis.client.model.MessageStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
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
 * MessageEndpointOut
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MessageEndpointOut {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private MessageStatus status;

  public static final String SERIALIZED_NAME_NEXT_ATTEMPT = "nextAttempt";
  @SerializedName(SERIALIZED_NAME_NEXT_ATTEMPT)
  private OffsetDateTime nextAttempt;

  public static final String SERIALIZED_NAME_RATE_LIMIT = "rateLimit";
  @SerializedName(SERIALIZED_NAME_RATE_LIMIT)
  private Integer rateLimit;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled = false;

  public static final String SERIALIZED_NAME_FILTER_TYPES = "filterTypes";
  @SerializedName(SERIALIZED_NAME_FILTER_TYPES)
  private Set<String> filterTypes = null;

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private Set<String> channels = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public MessageEndpointOut() {
  }

  public MessageEndpointOut description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * An example endpoint name
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An example endpoint name")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public MessageEndpointOut version(Integer version) {
    if (version != null && version < 1) {
      throw new IllegalArgumentException("Invalid value for version. Must be greater than or equal to 1.");
    }
    
    
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * minimum: 1
   * @return version
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    if (version != null && version < 1) {
      throw new IllegalArgumentException("Invalid value for version. Must be greater than or equal to 1.");
    }
    
    
    this.version = version;
  }


  public MessageEndpointOut id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ep&#39;s ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ep_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The ep's ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public MessageEndpointOut status(MessageStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MessageStatus getStatus() {
    return status;
  }


  public void setStatus(MessageStatus status) {
    
    
    
    this.status = status;
  }


  public MessageEndpointOut nextAttempt(OffsetDateTime nextAttempt) {
    
    
    
    
    this.nextAttempt = nextAttempt;
    return this;
  }

   /**
   * Get nextAttempt
   * @return nextAttempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNextAttempt() {
    return nextAttempt;
  }


  public void setNextAttempt(OffsetDateTime nextAttempt) {
    
    
    
    this.nextAttempt = nextAttempt;
  }


  public MessageEndpointOut rateLimit(Integer rateLimit) {
    if (rateLimit != null && rateLimit < 0) {
      throw new IllegalArgumentException("Invalid value for rateLimit. Must be greater than or equal to 0.");
    }
    
    
    
    this.rateLimit = rateLimit;
    return this;
  }

   /**
   * Get rateLimit
   * minimum: 0
   * @return rateLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRateLimit() {
    return rateLimit;
  }


  public void setRateLimit(Integer rateLimit) {
    if (rateLimit != null && rateLimit < 0) {
      throw new IllegalArgumentException("Invalid value for rateLimit. Must be greater than or equal to 0.");
    }
    
    
    this.rateLimit = rateLimit;
  }


  public MessageEndpointOut uid(String uid) {
    
    
    if (uid != null && uid.length() < 1) {
      throw new IllegalArgumentException("Invalid value for uid. Length must be greater than or equal to 1.");
    }
    
    this.uid = uid;
    return this;
  }

   /**
   * Optional unique identifier for the endpoint
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-ep-identifier", value = "Optional unique identifier for the endpoint")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    
    
    if (uid != null && uid.length() < 1) {
      throw new IllegalArgumentException("Invalid value for uid. Length must be greater than or equal to 1.");
    }
    this.uid = uid;
  }


  public MessageEndpointOut url(URI url) {
    
    
    if (url != null && url.length() < 1) {
      throw new IllegalArgumentException("Invalid value for url. Length must be greater than or equal to 1.");
    }
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.com/webhook/", required = true, value = "")

  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    
    
    if (url != null && url.length() < 1) {
      throw new IllegalArgumentException("Invalid value for url. Length must be greater than or equal to 1.");
    }
    this.url = url;
  }


  public MessageEndpointOut disabled(Boolean disabled) {
    
    
    
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    
    
    
    this.disabled = disabled;
  }


  public MessageEndpointOut filterTypes(Set<String> filterTypes) {
    
    
    
    
    this.filterTypes = filterTypes;
    return this;
  }

  public MessageEndpointOut addFilterTypesItem(String filterTypesItem) {
    if (this.filterTypes == null) {
      this.filterTypes = new LinkedHashSet<>();
    }
    this.filterTypes.add(filterTypesItem);
    return this;
  }

   /**
   * Get filterTypes
   * @return filterTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"user.signup\",\"user.deleted\"]", value = "")

  public Set<String> getFilterTypes() {
    return filterTypes;
  }


  public void setFilterTypes(Set<String> filterTypes) {
    
    
    
    this.filterTypes = filterTypes;
  }


  public MessageEndpointOut channels(Set<String> channels) {
    
    
    
    
    this.channels = channels;
    return this;
  }

  public MessageEndpointOut addChannelsItem(String channelsItem) {
    if (this.channels == null) {
      this.channels = new LinkedHashSet<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * List of message channels this endpoint listens to (omit for all)
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"project_123\",\"group_2\"]", value = "List of message channels this endpoint listens to (omit for all)")

  public Set<String> getChannels() {
    return channels;
  }


  public void setChannels(Set<String> channels) {
    
    
    
    this.channels = channels;
  }


  public MessageEndpointOut createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public MessageEndpointOut updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
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
   * @return the MessageEndpointOut instance itself
   */
  public MessageEndpointOut putAdditionalProperty(String key, Object value) {
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
    MessageEndpointOut messageEndpointOut = (MessageEndpointOut) o;
    return Objects.equals(this.description, messageEndpointOut.description) &&
        Objects.equals(this.version, messageEndpointOut.version) &&
        Objects.equals(this.id, messageEndpointOut.id) &&
        Objects.equals(this.status, messageEndpointOut.status) &&
        Objects.equals(this.nextAttempt, messageEndpointOut.nextAttempt) &&
        Objects.equals(this.rateLimit, messageEndpointOut.rateLimit) &&
        Objects.equals(this.uid, messageEndpointOut.uid) &&
        Objects.equals(this.url, messageEndpointOut.url) &&
        Objects.equals(this.disabled, messageEndpointOut.disabled) &&
        Objects.equals(this.filterTypes, messageEndpointOut.filterTypes) &&
        Objects.equals(this.channels, messageEndpointOut.channels) &&
        Objects.equals(this.createdAt, messageEndpointOut.createdAt) &&
        Objects.equals(this.updatedAt, messageEndpointOut.updatedAt)&&
        Objects.equals(this.additionalProperties, messageEndpointOut.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, version, id, status, nextAttempt, rateLimit, uid, url, disabled, filterTypes, channels, createdAt, updatedAt, additionalProperties);
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
    sb.append("class MessageEndpointOut {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nextAttempt: ").append(toIndentedString(nextAttempt)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    filterTypes: ").append(toIndentedString(filterTypes)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("version");
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("nextAttempt");
    openapiFields.add("rateLimit");
    openapiFields.add("uid");
    openapiFields.add("url");
    openapiFields.add("disabled");
    openapiFields.add("filterTypes");
    openapiFields.add("channels");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageEndpointOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MessageEndpointOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageEndpointOut is not found in the empty JSON string", MessageEndpointOut.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageEndpointOut.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("uid").isJsonNull() && (jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("filterTypes") != null && !jsonObj.get("filterTypes").isJsonNull() && !jsonObj.get("filterTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterTypes` to be an array in the JSON string or null but got `%s`", jsonObj.get("filterTypes").toString()));
      }
      // ensure the optional json data is an array if present (nullable)
      if (jsonObj.get("channels") != null && !jsonObj.get("channels").isJsonNull() && !jsonObj.get("channels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `channels` to be an array in the JSON string or null but got `%s`", jsonObj.get("channels").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageEndpointOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageEndpointOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageEndpointOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageEndpointOut.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageEndpointOut>() {
           @Override
           public void write(JsonWriter out, MessageEndpointOut value) throws IOException {
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
           public MessageEndpointOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MessageEndpointOut instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MessageEndpointOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageEndpointOut
  * @throws IOException if the JSON string is invalid with respect to MessageEndpointOut
  */
  public static MessageEndpointOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageEndpointOut.class);
  }

 /**
  * Convert an instance of MessageEndpointOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
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
 * ApplicationOut
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApplicationOut {
  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RATE_LIMIT = "rateLimit";
  @SerializedName(SERIALIZED_NAME_RATE_LIMIT)
  private Integer rateLimit;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public ApplicationOut() {
  }

  public ApplicationOut uid(String uid) {
    
    
    if (uid != null && uid.length() < 1) {
      throw new IllegalArgumentException("Invalid value for uid. Length must be greater than or equal to 1.");
    }
    
    this.uid = uid;
    return this;
  }

   /**
   * The app&#39;s UID
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "unique-app-identifier", value = "The app's UID")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    
    
    if (uid != null && uid.length() < 1) {
      throw new IllegalArgumentException("Invalid value for uid. Length must be greater than or equal to 1.");
    }
    this.uid = uid;
  }


  public ApplicationOut name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My first application", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ApplicationOut rateLimit(Integer rateLimit) {
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


  public ApplicationOut id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The app&#39;s ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "app_1srOrx2ZWZBpBUvZwXKQmoEYga2", required = true, value = "The app's ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ApplicationOut createdAt(OffsetDateTime createdAt) {
    
    
    
    
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


  public ApplicationOut updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
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


  public ApplicationOut metadata(Map<String, String> metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

  public ApplicationOut putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    
    
    
    this.metadata = metadata;
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
   * @return the ApplicationOut instance itself
   */
  public ApplicationOut putAdditionalProperty(String key, Object value) {
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
    ApplicationOut applicationOut = (ApplicationOut) o;
    return Objects.equals(this.uid, applicationOut.uid) &&
        Objects.equals(this.name, applicationOut.name) &&
        Objects.equals(this.rateLimit, applicationOut.rateLimit) &&
        Objects.equals(this.id, applicationOut.id) &&
        Objects.equals(this.createdAt, applicationOut.createdAt) &&
        Objects.equals(this.updatedAt, applicationOut.updatedAt) &&
        Objects.equals(this.metadata, applicationOut.metadata)&&
        Objects.equals(this.additionalProperties, applicationOut.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, rateLimit, id, createdAt, updatedAt, metadata, additionalProperties);
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
    sb.append("class ApplicationOut {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("uid");
    openapiFields.add("name");
    openapiFields.add("rateLimit");
    openapiFields.add("id");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("updatedAt");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApplicationOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationOut is not found in the empty JSON string", ApplicationOut.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApplicationOut.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("uid").isJsonNull() && (jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonNull()) && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationOut.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationOut>() {
           @Override
           public void write(JsonWriter out, ApplicationOut value) throws IOException {
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
           public ApplicationOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApplicationOut instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApplicationOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationOut
  * @throws IOException if the JSON string is invalid with respect to ApplicationOut
  */
  public static ApplicationOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationOut.class);
  }

 /**
  * Convert an instance of ApplicationOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


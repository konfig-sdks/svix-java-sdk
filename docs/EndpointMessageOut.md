

# EndpointMessageOut

A model containing information on a given message plus additional fields on the last attempt for that message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **Set&lt;String&gt;** |  |  [optional] |
|**status** | **MessageStatus** |  |  |
|**nextAttempt** | **OffsetDateTime** |  |  [optional] |
|**eventId** | **String** | Optional unique identifier for the message |  [optional] |
|**eventType** | **String** | The event type&#39;s name |  |
|**payload** | **Object** |  |  |
|**channels** | **Set&lt;String&gt;** | List of free-form identifiers that endpoints can filter by |  [optional] |
|**id** | **String** | The msg&#39;s ID |  |
|**timestamp** | **OffsetDateTime** |  |  |






# MessageAttemptRecoveredEventData

Sent when a message delivery has failed (all of the retry attempts have been exhausted) as a \"message.attempt.exhausted\" type or after it's failed four times as a \"message.attempt.failing\" event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | The app&#39;s ID |  |
|**appUid** | **String** | The app&#39;s UID |  [optional] |
|**msgId** | **String** | The msg&#39;s ID |  |
|**msgEventId** | **String** | The msg&#39;s UID |  [optional] |
|**endpointId** | **String** | The ep&#39;s ID |  |
|**lastAttempt** | [**MessageAttemptFailedData**](MessageAttemptFailedData.md) |  |  |




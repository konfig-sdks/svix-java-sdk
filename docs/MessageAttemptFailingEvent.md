

# MessageAttemptFailingEvent

Sent after a message has been failing for a few times. It's sent on the fourth failure. It complements `message.attempt.exhausted` which is sent after the last failure.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**MessageAttemptFailingEventData**](MessageAttemptFailingEventData.md) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MESSAGE_ATTEMPT_FAILING | &quot;message.attempt.failing&quot; |




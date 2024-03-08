

# ValidationError

Validation errors have their own schema to provide context for invalid requests eg. mismatched types and out of bounds values. There may be any number of these per 422 UNPROCESSABLE ENTITY error.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loc** | **List&lt;String&gt;** | The location as a [&#x60;Vec&#x60;] of [&#x60;String&#x60;]s -- often in the form &#x60;[\&quot;body\&quot;, \&quot;field_name\&quot;]&#x60;, &#x60;[\&quot;query\&quot;, \&quot;field_name\&quot;]&#x60;, etc. They may, however, be arbitrarily deep. |  |
|**msg** | **String** | The message accompanying the validation error item. |  |
|**type** | **String** | The type of error, often \&quot;type_error\&quot; or \&quot;value_error\&quot;, but sometimes with more context like as \&quot;value_error.number.not_ge\&quot; |  |




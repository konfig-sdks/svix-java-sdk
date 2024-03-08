

# EndpointPatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**version** | **Integer** |  |  [optional] |
|**rateLimit** | **Integer** |  |  [optional] |
|**uid** | **String** | The ep&#39;s UID |  [optional] |
|**url** | **URI** |  |  [optional] |
|**disabled** | **Boolean** |  |  [optional] |
|**filterTypes** | **Set&lt;String&gt;** |  |  [optional] |
|**channels** | **Set&lt;String&gt;** |  |  [optional] |
|**secret** | **String** | The endpoint&#39;s verification secret. If &#x60;null&#x60; is passed, a secret is automatically generated. Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |




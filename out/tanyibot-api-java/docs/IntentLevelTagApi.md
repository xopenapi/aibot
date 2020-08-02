# IntentLevelTagApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsedIntentLevelTagList**](IntentLevelTagApi.md#getUsedIntentLevelTagList) | **GET** /intentLevelTag/getUsedIntentLevelTagList | 获取已使用的意向标签组列表接口
[**intentLevelTagGetIntentLevelTagGet**](IntentLevelTagApi.md#intentLevelTagGetIntentLevelTagGet) | **GET** /intentLevelTag/getIntentLevelTag | 获取意向标签内容


<a name="getUsedIntentLevelTagList"></a>
# **getUsedIntentLevelTagList**
> GetUsedIntentLevelTagListRsp getUsedIntentLevelTagList()

获取已使用的意向标签组列表接口

通过此接口可以获取已使用的所有意向标签组

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IntentLevelTagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    IntentLevelTagApi apiInstance = new IntentLevelTagApi(defaultClient);
    try {
      GetUsedIntentLevelTagListRsp result = apiInstance.getUsedIntentLevelTagList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntentLevelTagApi#getUsedIntentLevelTagList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUsedIntentLevelTagListRsp**](GetUsedIntentLevelTagListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="intentLevelTagGetIntentLevelTagGet"></a>
# **intentLevelTagGetIntentLevelTagGet**
> GetIntentLevelTagRsp intentLevelTagGetIntentLevelTagGet(intentLevelTagId)

获取意向标签内容

通过接口可以获取指定意向标签分组的内容

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IntentLevelTagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    IntentLevelTagApi apiInstance = new IntentLevelTagApi(defaultClient);
    Integer intentLevelTagId = 0; // Integer | 标签分组Id
    try {
      GetIntentLevelTagRsp result = apiInstance.intentLevelTagGetIntentLevelTagGet(intentLevelTagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntentLevelTagApi#intentLevelTagGetIntentLevelTagGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intentLevelTagId** | **Integer**| 标签分组Id | [default to 0]

### Return type

[**GetIntentLevelTagRsp**](GetIntentLevelTagRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |


# CallInterceptApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callInterceptListGet**](CallInterceptApi.md#callInterceptListGet) | **GET** /callIntercept/list | 获取拦截组列表接口


<a name="callInterceptListGet"></a>
# **callInterceptListGet**
> InterceptListRsp callInterceptListGet()

获取拦截组列表接口

通过此接口可以获取所有拦截组

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallInterceptApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    CallInterceptApi apiInstance = new CallInterceptApi(defaultClient);
    try {
      InterceptListRsp result = apiInstance.callInterceptListGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CallInterceptApi#callInterceptListGet");
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

[**InterceptListRsp**](InterceptListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |


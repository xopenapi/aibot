# TenantApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTenant**](TenantApi.md#getTenant) | **GET** /tenant/getTenant | 获取公司列表接口


<a name="getTenant"></a>
# **getTenant**
> GetTenantRsp getTenant()

获取公司列表接口

获取公司列表接口

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TenantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    TenantApi apiInstance = new TenantApi(defaultClient);
    try {
      GetTenantRsp result = apiInstance.getTenant();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantApi#getTenant");
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

[**GetTenantRsp**](GetTenantRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |


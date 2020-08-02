# IsvApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genSubAccountIsv**](IsvApi.md#genSubAccountIsv) | **POST** /isv/genSubAccountIsv | 通过此接口可生成子账号的ISV账号
[**getIsvList**](IsvApi.md#getIsvList) | **POST** /isv/getIsvList | 获取isv列表
[**updateIsvInfo**](IsvApi.md#updateIsvInfo) | **POST** /isv/updateIsvInfo | 修改ISV对象的公司签名和回调地址


<a name="genSubAccountIsv"></a>
# **genSubAccountIsv**
> GetSubAccountIsvResp genSubAccountIsv(body)

通过此接口可生成子账号的ISV账号

通过此接口可生成子账号的ISV账号

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IsvApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    IsvApi apiInstance = new IsvApi(defaultClient);
    GetSubAccountIsvReq body = new GetSubAccountIsvReq(); // GetSubAccountIsvReq | 
    try {
      GetSubAccountIsvResp result = apiInstance.genSubAccountIsv(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IsvApi#genSubAccountIsv");
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
 **body** | [**GetSubAccountIsvReq**](GetSubAccountIsvReq.md)|  |

### Return type

[**GetSubAccountIsvResp**](GetSubAccountIsvResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getIsvList"></a>
# **getIsvList**
> GetIsvListRsp getIsvList()

获取isv列表

通过此接口获取ISV账号列表

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IsvApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    IsvApi apiInstance = new IsvApi(defaultClient);
    try {
      GetIsvListRsp result = apiInstance.getIsvList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IsvApi#getIsvList");
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

[**GetIsvListRsp**](GetIsvListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="updateIsvInfo"></a>
# **updateIsvInfo**
> ModelAPIResponse updateIsvInfo(body)

修改ISV对象的公司签名和回调地址

修改ISV对象的公司签名和回调地址

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IsvApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    IsvApi apiInstance = new IsvApi(defaultClient);
    UpdateIsvInfoReq body = new UpdateIsvInfoReq(); // UpdateIsvInfoReq | 
    try {
      ModelAPIResponse result = apiInstance.updateIsvInfo(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IsvApi#updateIsvInfo");
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
 **body** | [**UpdateIsvInfoReq**](UpdateIsvInfoReq.md)|  |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |


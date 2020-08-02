# PhoneApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPhoneList**](PhoneApi.md#getPhoneList) | **GET** /phone/getPhoneList | 通过接口可以获取所有可用的外呼线路的列表
[**updatePhoneInfoByTenantPhoneNumberId**](PhoneApi.md#updatePhoneInfoByTenantPhoneNumberId) | **POST** /phone/updatePhoneInfoByTenantPhoneNumberId | 通过此接口修改线路的归属地、行业、黑名单，只能修改归属客户自己的线路
[**updatePhonePriceByTenantPhoneNumberId**](PhoneApi.md#updatePhonePriceByTenantPhoneNumberId) | **POST** /phone/updatePhonePriceByTenantPhoneNumberId | 修改绑定客户线路的价格


<a name="getPhoneList"></a>
# **getPhoneList**
> GetPhoneListRsp getPhoneList()

通过接口可以获取所有可用的外呼线路的列表

通过接口可以获取所有可用的外呼线路的列表

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhoneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    PhoneApi apiInstance = new PhoneApi(defaultClient);
    try {
      GetPhoneListRsp result = apiInstance.getPhoneList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneApi#getPhoneList");
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

[**GetPhoneListRsp**](GetPhoneListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="updatePhoneInfoByTenantPhoneNumberId"></a>
# **updatePhoneInfoByTenantPhoneNumberId**
> ModelAPIResponse updatePhoneInfoByTenantPhoneNumberId(body)

通过此接口修改线路的归属地、行业、黑名单，只能修改归属客户自己的线路

通过此接口修改线路的归属地、行业、黑名单，只能修改归属客户自己的线路

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhoneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    PhoneApi apiInstance = new PhoneApi(defaultClient);
    UpdatePhoneInfoByTenantPhoneNumberIdReq body = new UpdatePhoneInfoByTenantPhoneNumberIdReq(); // UpdatePhoneInfoByTenantPhoneNumberIdReq | 
    try {
      ModelAPIResponse result = apiInstance.updatePhoneInfoByTenantPhoneNumberId(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneApi#updatePhoneInfoByTenantPhoneNumberId");
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
 **body** | [**UpdatePhoneInfoByTenantPhoneNumberIdReq**](UpdatePhoneInfoByTenantPhoneNumberIdReq.md)|  |

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

<a name="updatePhonePriceByTenantPhoneNumberId"></a>
# **updatePhonePriceByTenantPhoneNumberId**
> ModelAPIResponse updatePhonePriceByTenantPhoneNumberId()

修改绑定客户线路的价格

修改绑定客户线路的价格

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PhoneApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    PhoneApi apiInstance = new PhoneApi(defaultClient);
    try {
      ModelAPIResponse result = apiInstance.updatePhonePriceByTenantPhoneNumberId();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneApi#updatePhonePriceByTenantPhoneNumberId");
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

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |


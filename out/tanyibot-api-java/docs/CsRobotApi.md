# CsRobotApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**staffGroupList**](CsRobotApi.md#staffGroupList) | **GET** /csRobot/staffGroupList | 获取人工坐席列表接口


<a name="staffGroupList"></a>
# **staffGroupList**
> StaffGroupListRsp staffGroupList(pageNum, pageSize)

获取人工坐席列表接口

通过此接口可以获取用户所有的有效坐席组列表信息

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CsRobotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    CsRobotApi apiInstance = new CsRobotApi(defaultClient);
    Integer pageNum = 56; // Integer | 
    Integer pageSize = 56; // Integer | 
    try {
      StaffGroupListRsp result = apiInstance.staffGroupList(pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsRobotApi#staffGroupList");
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
 **pageNum** | **Integer**|  |
 **pageSize** | **Integer**|  |

### Return type

[**StaffGroupListRsp**](StaffGroupListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |


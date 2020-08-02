# PolicyGroupApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**policyGroupCreatePost**](PolicyGroupApi.md#policyGroupCreatePost) | **POST** /policyGroup/create | 创建外呼策略组接口
[**policyGroupGetIdAndNamePairListGet**](PolicyGroupApi.md#policyGroupGetIdAndNamePairListGet) | **GET** /policyGroup/getIdAndNamePairList | 获取外呼策略组选择接口
[**policyGroupListGet**](PolicyGroupApi.md#policyGroupListGet) | **GET** /policyGroup/list | 获取外呼策略组列表接口
[**policyGroupUpdatePost**](PolicyGroupApi.md#policyGroupUpdatePost) | **POST** /policyGroup/update | 更新外呼策略组接口


<a name="policyGroupCreatePost"></a>
# **policyGroupCreatePost**
> ModelAPIResponse policyGroupCreatePost(body)

创建外呼策略组接口

创建新的外呼策略组

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    PolicyGroupApi apiInstance = new PolicyGroupApi(defaultClient);
    CreatePolicyGroupReq body = new CreatePolicyGroupReq(); // CreatePolicyGroupReq | 
    try {
      ModelAPIResponse result = apiInstance.policyGroupCreatePost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyGroupApi#policyGroupCreatePost");
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
 **body** | [**CreatePolicyGroupReq**](CreatePolicyGroupReq.md)|  | [optional]

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="policyGroupGetIdAndNamePairListGet"></a>
# **policyGroupGetIdAndNamePairListGet**
> GetIdAndNamePairListRsp policyGroupGetIdAndNamePairListGet()

获取外呼策略组选择接口

通过此接口可以获取外呼策略组id和名称对应的键值对列表

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    PolicyGroupApi apiInstance = new PolicyGroupApi(defaultClient);
    try {
      GetIdAndNamePairListRsp result = apiInstance.policyGroupGetIdAndNamePairListGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyGroupApi#policyGroupGetIdAndNamePairListGet");
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

[**GetIdAndNamePairListRsp**](GetIdAndNamePairListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="policyGroupListGet"></a>
# **policyGroupListGet**
> GetPolicyGroupListRsp policyGroupListGet()

获取外呼策略组列表接口

通过此接口可以获取用户所有的外呼策略组信息

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    PolicyGroupApi apiInstance = new PolicyGroupApi(defaultClient);
    try {
      GetPolicyGroupListRsp result = apiInstance.policyGroupListGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyGroupApi#policyGroupListGet");
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

[**GetPolicyGroupListRsp**](GetPolicyGroupListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="policyGroupUpdatePost"></a>
# **policyGroupUpdatePost**
> ModelAPIResponse policyGroupUpdatePost(body)

更新外呼策略组接口

更新新的外呼策略组

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PolicyGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    PolicyGroupApi apiInstance = new PolicyGroupApi(defaultClient);
    UpdatePolicyGroupReq body = new UpdatePolicyGroupReq(); // UpdatePolicyGroupReq | 
    try {
      ModelAPIResponse result = apiInstance.policyGroupUpdatePost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyGroupApi#policyGroupUpdatePost");
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
 **body** | [**UpdatePolicyGroupReq**](UpdatePolicyGroupReq.md)|  | [optional]

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |


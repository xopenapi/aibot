# DialogFlowApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dialogFlowBatchUploadPost**](DialogFlowApi.md#dialogFlowBatchUploadPost) | **POST** /dialogFlow/batchUpload | 上传话术录音
[**dialogFlowCopyDialogFlowPost**](DialogFlowApi.md#dialogFlowCopyDialogFlowPost) | **POST** /dialogFlow/copyDialogFlow | 话术复制
[**dialogFlowGetDialogFlowCallJobRelatedInfoGet**](DialogFlowApi.md#dialogFlowGetDialogFlowCallJobRelatedInfoGet) | **GET** /dialogFlow/getDialogFlowCallJobRelatedInfo | 获取话术中存在人工介入和转人工等标识
[**dialogFlowGetTotalDialogFlowListPost**](DialogFlowApi.md#dialogFlowGetTotalDialogFlowListPost) | **POST** /dialogFlow/getTotalDialogFlowList | 话术列表
[**exportDialogFlowWordDoc**](DialogFlowApi.md#exportDialogFlowWordDoc) | **GET** /dialogFlow/exportDialogFlowWordDoc | 获取话术主流程word文档
[**getDialogContentInfo**](DialogFlowApi.md#getDialogContentInfo) | **GET** /dialogFlow/getDialogContentInfo | 获取话术中所有需要录音的文本和录音文件
[**getDialogFlowList**](DialogFlowApi.md#getDialogFlowList) | **GET** /dialogFlow/getDialogFlowList | 获取公司的机器人话术列表接口


<a name="dialogFlowBatchUploadPost"></a>
# **dialogFlowBatchUploadPost**
> ModelAPIResponse dialogFlowBatchUploadPost(dialogFlowId, file)

上传话术录音

通过接口可以上传话术中指定文本的录音

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DialogFlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    DialogFlowApi apiInstance = new DialogFlowApi(defaultClient);
    Long dialogFlowId = 56L; // Long | 话术ID
    File file = new File("/path/to/file"); // File | 音频文件(MP3或者wav格式)，或者多个录音文件的zip包，录音文件名称为对应录音文本的label
    try {
      ModelAPIResponse result = apiInstance.dialogFlowBatchUploadPost(dialogFlowId, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DialogFlowApi#dialogFlowBatchUploadPost");
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
 **dialogFlowId** | **Long**| 话术ID |
 **file** | **File**| 音频文件(MP3或者wav格式)，或者多个录音文件的zip包，录音文件名称为对应录音文本的label |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="dialogFlowCopyDialogFlowPost"></a>
# **dialogFlowCopyDialogFlowPost**
> CopyDialogFlowRsp dialogFlowCopyDialogFlowPost(body)

话术复制

通过接口可以复制指定话术

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DialogFlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    DialogFlowApi apiInstance = new DialogFlowApi(defaultClient);
    CopyDialogFlowReq body = new CopyDialogFlowReq(); // CopyDialogFlowReq | 
    try {
      CopyDialogFlowRsp result = apiInstance.dialogFlowCopyDialogFlowPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DialogFlowApi#dialogFlowCopyDialogFlowPost");
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
 **body** | [**CopyDialogFlowReq**](CopyDialogFlowReq.md)|  | [optional]

### Return type

[**CopyDialogFlowRsp**](CopyDialogFlowRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="dialogFlowGetDialogFlowCallJobRelatedInfoGet"></a>
# **dialogFlowGetDialogFlowCallJobRelatedInfoGet**
> DialogFlowCallJobRelatedInfo dialogFlowGetDialogFlowCallJobRelatedInfoGet(dialogFlowId)

获取话术中存在人工介入和转人工等标识

通过接口可以获取指定话术的标识

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DialogFlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    DialogFlowApi apiInstance = new DialogFlowApi(defaultClient);
    Long dialogFlowId = 56L; // Long | 
    try {
      DialogFlowCallJobRelatedInfo result = apiInstance.dialogFlowGetDialogFlowCallJobRelatedInfoGet(dialogFlowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DialogFlowApi#dialogFlowGetDialogFlowCallJobRelatedInfoGet");
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
 **dialogFlowId** | **Long**|  |

### Return type

[**DialogFlowCallJobRelatedInfo**](DialogFlowCallJobRelatedInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="dialogFlowGetTotalDialogFlowListPost"></a>
# **dialogFlowGetTotalDialogFlowListPost**
> TotalDialogFlowListRsp dialogFlowGetTotalDialogFlowListPost(body)

话术列表

通过接口可以获取所有话术列表

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DialogFlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    DialogFlowApi apiInstance = new DialogFlowApi(defaultClient);
    GetTotalDialogFlowListReq body = new GetTotalDialogFlowListReq(); // GetTotalDialogFlowListReq | 
    try {
      TotalDialogFlowListRsp result = apiInstance.dialogFlowGetTotalDialogFlowListPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DialogFlowApi#dialogFlowGetTotalDialogFlowListPost");
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
 **body** | [**GetTotalDialogFlowListReq**](GetTotalDialogFlowListReq.md)|  | [optional]

### Return type

[**TotalDialogFlowListRsp**](TotalDialogFlowListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="exportDialogFlowWordDoc"></a>
# **exportDialogFlowWordDoc**
> InlineResponse200 exportDialogFlowWordDoc(dialogFlowId)

获取话术主流程word文档

通过接口可以获取指定话术的主流程文档

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DialogFlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    DialogFlowApi apiInstance = new DialogFlowApi(defaultClient);
    Long dialogFlowId = 56L; // Long | 
    try {
      InlineResponse200 result = apiInstance.exportDialogFlowWordDoc(dialogFlowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DialogFlowApi#exportDialogFlowWordDoc");
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
 **dialogFlowId** | **Long**|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getDialogContentInfo"></a>
# **getDialogContentInfo**
> DialogContentInfo getDialogContentInfo(dialogFlowId)

获取话术中所有需要录音的文本和录音文件

通过接口可以获取指定话术所有需要录音的文本和录音文件

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DialogFlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    DialogFlowApi apiInstance = new DialogFlowApi(defaultClient);
    Long dialogFlowId = 56L; // Long | 话术ID
    try {
      DialogContentInfo result = apiInstance.getDialogContentInfo(dialogFlowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DialogFlowApi#getDialogContentInfo");
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
 **dialogFlowId** | **Long**| 话术ID |

### Return type

[**DialogContentInfo**](DialogContentInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getDialogFlowList"></a>
# **getDialogFlowList**
> DialogFlowList getDialogFlowList()

获取公司的机器人话术列表接口

通过接口可以获取指定公司的所有配置完成的机器人话术

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DialogFlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    DialogFlowApi apiInstance = new DialogFlowApi(defaultClient);
    try {
      DialogFlowList result = apiInstance.getDialogFlowList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DialogFlowApi#getDialogFlowList");
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

[**DialogFlowList**](DialogFlowList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |


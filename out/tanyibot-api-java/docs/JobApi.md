# JobApi

All URIs are relative to *https://openapi.tanyibot.com/apiOpen/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](JobApi.md#create) | **POST** /job/create | 通过此接口可以创建新的任务
[**importCustomer**](JobApi.md#importCustomer) | **POST** /job/importCustomer | 
[**jobCheckAllPost**](JobApi.md#jobCheckAllPost) | **POST** /job/checkAll | 
[**jobDeletePost**](JobApi.md#jobDeletePost) | **POST** /job/delete | 
[**jobExecuteJobsPost**](JobApi.md#jobExecuteJobsPost) | **POST** /job/executeJobs | 
[**jobGetJobDetailGet**](JobApi.md#jobGetJobDetailGet) | **GET** /job/getJobDetail | 
[**jobGetJobStatsInfoListPost**](JobApi.md#jobGetJobStatsInfoListPost) | **POST** /job/getJobStatsInfoList | 
[**jobGetJobsGet**](JobApi.md#jobGetJobsGet) | **GET** /job/getJobs | 获取任务列表接口
[**jobModifyPatch**](JobApi.md#jobModifyPatch) | **PATCH** /job/modify | 修改任务接口
[**jobPausePost**](JobApi.md#jobPausePost) | **POST** /job/pause | 
[**jobReAddCustomerToJobPost**](JobApi.md#jobReAddCustomerToJobPost) | **POST** /job/reAddCustomerToJob | 
[**jobUpdateAiCountPost**](JobApi.md#jobUpdateAiCountPost) | **POST** /job/updateAiCount | 
[**start**](JobApi.md#start) | **POST** /job/start | 


<a name="create"></a>
# **create**
> JobCreateRsp create(body)

通过此接口可以创建新的任务

创建任务,支持使用多个无主叫固话,只需设置总并发数,由系统自动分配每个线路的并发。

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    Job body = new Job(); // Job | 
    try {
      JobCreateRsp result = apiInstance.create(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#create");
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
 **body** | [**Job**](Job.md)|  |

### Return type

[**JobCreateRsp**](JobCreateRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="importCustomer"></a>
# **importCustomer**
> ModelAPIResponse importCustomer(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    ImportCustomerReq body = new ImportCustomerReq(); // ImportCustomerReq | 
    try {
      ModelAPIResponse result = apiInstance.importCustomer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#importCustomer");
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
 **body** | [**ImportCustomerReq**](ImportCustomerReq.md)|  |

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

<a name="jobCheckAllPost"></a>
# **jobCheckAllPost**
> CheckAllRsp jobCheckAllPost(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    InlineObject4 body = new InlineObject4(); // InlineObject4 | 
    try {
      CheckAllRsp result = apiInstance.jobCheckAllPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobCheckAllPost");
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
 **body** | [**InlineObject4**](InlineObject4.md)|  |

### Return type

[**CheckAllRsp**](CheckAllRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="jobDeletePost"></a>
# **jobDeletePost**
> ModelAPIResponse jobDeletePost(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    InlineObject2 body = new InlineObject2(); // InlineObject2 | 
    try {
      ModelAPIResponse result = apiInstance.jobDeletePost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobDeletePost");
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

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

<a name="jobExecuteJobsPost"></a>
# **jobExecuteJobsPost**
> ExecuteJobsRsp jobExecuteJobsPost(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    ExecuteJobsReq body = new ExecuteJobsReq(); // ExecuteJobsReq | 
    try {
      ExecuteJobsRsp result = apiInstance.jobExecuteJobsPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobExecuteJobsPost");
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
 **body** | [**ExecuteJobsReq**](ExecuteJobsReq.md)|  |

### Return type

[**ExecuteJobsRsp**](ExecuteJobsRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="jobGetJobDetailGet"></a>
# **jobGetJobDetailGet**
> GetJobDetailRsp jobGetJobDetailGet(robotCallJobId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    Long robotCallJobId = 56L; // Long | 任务Id
    try {
      GetJobDetailRsp result = apiInstance.jobGetJobDetailGet(robotCallJobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobGetJobDetailGet");
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
 **robotCallJobId** | **Long**| 任务Id |

### Return type

[**GetJobDetailRsp**](GetJobDetailRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="jobGetJobStatsInfoListPost"></a>
# **jobGetJobStatsInfoListPost**
> GetJobStatsInfoListRsp jobGetJobStatsInfoListPost(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    InlineObject5 body = new InlineObject5(); // InlineObject5 | 
    try {
      GetJobStatsInfoListRsp result = apiInstance.jobGetJobStatsInfoListPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobGetJobStatsInfoListPost");
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
 **body** | [**InlineObject5**](InlineObject5.md)|  |

### Return type

[**GetJobStatsInfoListRsp**](GetJobStatsInfoListRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="jobGetJobsGet"></a>
# **jobGetJobsGet**
> GetJobsRsp jobGetJobsGet(name, status, pageNum, pageSize)

获取任务列表接口

通过此接口可以获取指定公司的任务列表

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    String name = "name_example"; // String | 任务名称
    String status = "status_example"; // String | 任务状态,(NOT_STARTED, \"未开始\"),(IN_PROCESS, \"进行中\"),(COMPLETED, \"已完成\"),(RUNNABLE, \"可运行\"),(USER_PAUSE, \"用户暂停\"),(SYSTEM_SUSPENDED, \"系统暂停\"),(TERMINATE, \"已终止\"),(IN_QUEUE, \"排队中\"),(SYSTEM_HANG_UP,\"系统挂起\"),(WAITING_FOR_REDIAL,\"等待重呼\"),(ACCOUNT_DISABLE,\"账户禁用\"),(MAINTAIN,\"系统维护\");
    Integer pageNum = 56; // Integer | 第几页,默认1
    Integer pageSize = 56; // Integer | 页面大小,选填,默认20,最大值100
    try {
      GetJobsRsp result = apiInstance.jobGetJobsGet(name, status, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobGetJobsGet");
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
 **name** | **String**| 任务名称 | [optional]
 **status** | **String**| 任务状态,(NOT_STARTED, \&quot;未开始\&quot;),(IN_PROCESS, \&quot;进行中\&quot;),(COMPLETED, \&quot;已完成\&quot;),(RUNNABLE, \&quot;可运行\&quot;),(USER_PAUSE, \&quot;用户暂停\&quot;),(SYSTEM_SUSPENDED, \&quot;系统暂停\&quot;),(TERMINATE, \&quot;已终止\&quot;),(IN_QUEUE, \&quot;排队中\&quot;),(SYSTEM_HANG_UP,\&quot;系统挂起\&quot;),(WAITING_FOR_REDIAL,\&quot;等待重呼\&quot;),(ACCOUNT_DISABLE,\&quot;账户禁用\&quot;),(MAINTAIN,\&quot;系统维护\&quot;); | [optional] [enum: NOT_STARTED, IN_PROCESS, COMPLETED, RUNNABLE, USER_PAUSE, SYSTEM_SUSPENDED, TERMINATE, IN_QUEUE, SYSTEM_HANG_UP, WAITING_FOR_REDIAL, ACCOUNT_DISABLE, MAINTAIN]
 **pageNum** | **Integer**| 第几页,默认1 | [optional]
 **pageSize** | **Integer**| 页面大小,选填,默认20,最大值100 | [optional]

### Return type

[**GetJobsRsp**](GetJobsRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="jobModifyPatch"></a>
# **jobModifyPatch**
> JobUpdateRsp jobModifyPatch(body)

修改任务接口

通过此接口可以修改任务

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    Job body = new Job(); // Job | 
    try {
      JobUpdateRsp result = apiInstance.jobModifyPatch(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobModifyPatch");
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
 **body** | [**Job**](Job.md)|  | [optional]

### Return type

[**JobUpdateRsp**](JobUpdateRsp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="jobPausePost"></a>
# **jobPausePost**
> ModelAPIResponse jobPausePost(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    InlineObject1 body = new InlineObject1(); // InlineObject1 | 
    try {
      ModelAPIResponse result = apiInstance.jobPausePost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobPausePost");
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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

<a name="jobReAddCustomerToJobPost"></a>
# **jobReAddCustomerToJobPost**
> ModelAPIResponse jobReAddCustomerToJobPost(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    ReAddCustomerToJobReq body = new ReAddCustomerToJobReq(); // ReAddCustomerToJobReq | 
    try {
      ModelAPIResponse result = apiInstance.jobReAddCustomerToJobPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobReAddCustomerToJobPost");
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
 **body** | [**ReAddCustomerToJobReq**](ReAddCustomerToJobReq.md)|  |

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

<a name="jobUpdateAiCountPost"></a>
# **jobUpdateAiCountPost**
> ModelAPIResponse jobUpdateAiCountPost(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    InlineObject3 body = new InlineObject3(); // InlineObject3 | 
    try {
      ModelAPIResponse result = apiInstance.jobUpdateAiCountPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#jobUpdateAiCountPost");
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
 **body** | [**InlineObject3**](InlineObject3.md)|  |

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

<a name="start"></a>
# **start**
> ModelAPIResponse start(body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.JobApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.tanyibot.com/apiOpen/v1");

    JobApi apiInstance = new JobApi(defaultClient);
    InlineObject body = new InlineObject(); // InlineObject | 
    try {
      ModelAPIResponse result = apiInstance.start(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobApi#start");
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
 **body** | [**InlineObject**](InlineObject.md)|  |

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


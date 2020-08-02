/*
 * Tanyi Bot open api
 * tanyibot api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CreatePolicyGroupReq;
import org.openapitools.client.model.GetIdAndNamePairListRsp;
import org.openapitools.client.model.GetPolicyGroupListRsp;
import org.openapitools.client.model.ModelAPIResponse;
import org.openapitools.client.model.UpdatePolicyGroupReq;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolicyGroupApi {
    private ApiClient localVarApiClient;

    public PolicyGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PolicyGroupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for policyGroupCreatePost
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call policyGroupCreatePostCall(CreatePolicyGroupReq body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/policyGroup/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call policyGroupCreatePostValidateBeforeCall(CreatePolicyGroupReq body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = policyGroupCreatePostCall(body, _callback);
        return localVarCall;

    }

    /**
     * 创建外呼策略组接口
     * 创建新的外呼策略组
     * @param body  (optional)
     * @return ModelAPIResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ModelAPIResponse policyGroupCreatePost(CreatePolicyGroupReq body) throws ApiException {
        ApiResponse<ModelAPIResponse> localVarResp = policyGroupCreatePostWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 创建外呼策略组接口
     * 创建新的外呼策略组
     * @param body  (optional)
     * @return ApiResponse&lt;ModelAPIResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelAPIResponse> policyGroupCreatePostWithHttpInfo(CreatePolicyGroupReq body) throws ApiException {
        okhttp3.Call localVarCall = policyGroupCreatePostValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<ModelAPIResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 创建外呼策略组接口 (asynchronously)
     * 创建新的外呼策略组
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call policyGroupCreatePostAsync(CreatePolicyGroupReq body, final ApiCallback<ModelAPIResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = policyGroupCreatePostValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<ModelAPIResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for policyGroupGetIdAndNamePairListGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call policyGroupGetIdAndNamePairListGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/policyGroup/getIdAndNamePairList";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call policyGroupGetIdAndNamePairListGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = policyGroupGetIdAndNamePairListGetCall(_callback);
        return localVarCall;

    }

    /**
     * 获取外呼策略组选择接口
     * 通过此接口可以获取外呼策略组id和名称对应的键值对列表
     * @return GetIdAndNamePairListRsp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GetIdAndNamePairListRsp policyGroupGetIdAndNamePairListGet() throws ApiException {
        ApiResponse<GetIdAndNamePairListRsp> localVarResp = policyGroupGetIdAndNamePairListGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 获取外呼策略组选择接口
     * 通过此接口可以获取外呼策略组id和名称对应的键值对列表
     * @return ApiResponse&lt;GetIdAndNamePairListRsp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetIdAndNamePairListRsp> policyGroupGetIdAndNamePairListGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = policyGroupGetIdAndNamePairListGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetIdAndNamePairListRsp>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取外呼策略组选择接口 (asynchronously)
     * 通过此接口可以获取外呼策略组id和名称对应的键值对列表
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call policyGroupGetIdAndNamePairListGetAsync(final ApiCallback<GetIdAndNamePairListRsp> _callback) throws ApiException {

        okhttp3.Call localVarCall = policyGroupGetIdAndNamePairListGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetIdAndNamePairListRsp>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for policyGroupListGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call policyGroupListGetCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/policyGroup/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call policyGroupListGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = policyGroupListGetCall(_callback);
        return localVarCall;

    }

    /**
     * 获取外呼策略组列表接口
     * 通过此接口可以获取用户所有的外呼策略组信息
     * @return GetPolicyGroupListRsp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GetPolicyGroupListRsp policyGroupListGet() throws ApiException {
        ApiResponse<GetPolicyGroupListRsp> localVarResp = policyGroupListGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 获取外呼策略组列表接口
     * 通过此接口可以获取用户所有的外呼策略组信息
     * @return ApiResponse&lt;GetPolicyGroupListRsp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetPolicyGroupListRsp> policyGroupListGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = policyGroupListGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetPolicyGroupListRsp>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取外呼策略组列表接口 (asynchronously)
     * 通过此接口可以获取用户所有的外呼策略组信息
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call policyGroupListGetAsync(final ApiCallback<GetPolicyGroupListRsp> _callback) throws ApiException {

        okhttp3.Call localVarCall = policyGroupListGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetPolicyGroupListRsp>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for policyGroupUpdatePost
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call policyGroupUpdatePostCall(UpdatePolicyGroupReq body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/policyGroup/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call policyGroupUpdatePostValidateBeforeCall(UpdatePolicyGroupReq body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = policyGroupUpdatePostCall(body, _callback);
        return localVarCall;

    }

    /**
     * 更新外呼策略组接口
     * 更新新的外呼策略组
     * @param body  (optional)
     * @return ModelAPIResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ModelAPIResponse policyGroupUpdatePost(UpdatePolicyGroupReq body) throws ApiException {
        ApiResponse<ModelAPIResponse> localVarResp = policyGroupUpdatePostWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 更新外呼策略组接口
     * 更新新的外呼策略组
     * @param body  (optional)
     * @return ApiResponse&lt;ModelAPIResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelAPIResponse> policyGroupUpdatePostWithHttpInfo(UpdatePolicyGroupReq body) throws ApiException {
        okhttp3.Call localVarCall = policyGroupUpdatePostValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<ModelAPIResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 更新外呼策略组接口 (asynchronously)
     * 更新新的外呼策略组
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call policyGroupUpdatePostAsync(UpdatePolicyGroupReq body, final ApiCallback<ModelAPIResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = policyGroupUpdatePostValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<ModelAPIResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
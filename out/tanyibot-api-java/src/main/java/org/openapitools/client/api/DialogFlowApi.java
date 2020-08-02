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


import org.openapitools.client.model.CopyDialogFlowReq;
import org.openapitools.client.model.CopyDialogFlowRsp;
import org.openapitools.client.model.DialogContentInfo;
import org.openapitools.client.model.DialogFlowCallJobRelatedInfo;
import org.openapitools.client.model.DialogFlowList;
import java.io.File;
import org.openapitools.client.model.GetTotalDialogFlowListReq;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ModelAPIResponse;
import org.openapitools.client.model.TotalDialogFlowListRsp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DialogFlowApi {
    private ApiClient localVarApiClient;

    public DialogFlowApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DialogFlowApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for dialogFlowBatchUploadPost
     * @param dialogFlowId 话术ID (required)
     * @param file 音频文件(MP3或者wav格式)，或者多个录音文件的zip包，录音文件名称为对应录音文本的label (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dialogFlowBatchUploadPostCall(Long dialogFlowId, File file, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dialogFlow/batchUpload";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (dialogFlowId != null) {
            localVarFormParams.put("dialogFlowId", dialogFlowId);
        }

        if (file != null) {
            localVarFormParams.put("file", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dialogFlowBatchUploadPostValidateBeforeCall(Long dialogFlowId, File file, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'dialogFlowId' is set
        if (dialogFlowId == null) {
            throw new ApiException("Missing the required parameter 'dialogFlowId' when calling dialogFlowBatchUploadPost(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling dialogFlowBatchUploadPost(Async)");
        }
        

        okhttp3.Call localVarCall = dialogFlowBatchUploadPostCall(dialogFlowId, file, _callback);
        return localVarCall;

    }

    /**
     * 上传话术录音
     * 通过接口可以上传话术中指定文本的录音
     * @param dialogFlowId 话术ID (required)
     * @param file 音频文件(MP3或者wav格式)，或者多个录音文件的zip包，录音文件名称为对应录音文本的label (required)
     * @return ModelAPIResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ModelAPIResponse dialogFlowBatchUploadPost(Long dialogFlowId, File file) throws ApiException {
        ApiResponse<ModelAPIResponse> localVarResp = dialogFlowBatchUploadPostWithHttpInfo(dialogFlowId, file);
        return localVarResp.getData();
    }

    /**
     * 上传话术录音
     * 通过接口可以上传话术中指定文本的录音
     * @param dialogFlowId 话术ID (required)
     * @param file 音频文件(MP3或者wav格式)，或者多个录音文件的zip包，录音文件名称为对应录音文本的label (required)
     * @return ApiResponse&lt;ModelAPIResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ModelAPIResponse> dialogFlowBatchUploadPostWithHttpInfo(Long dialogFlowId, File file) throws ApiException {
        okhttp3.Call localVarCall = dialogFlowBatchUploadPostValidateBeforeCall(dialogFlowId, file, null);
        Type localVarReturnType = new TypeToken<ModelAPIResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 上传话术录音 (asynchronously)
     * 通过接口可以上传话术中指定文本的录音
     * @param dialogFlowId 话术ID (required)
     * @param file 音频文件(MP3或者wav格式)，或者多个录音文件的zip包，录音文件名称为对应录音文本的label (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dialogFlowBatchUploadPostAsync(Long dialogFlowId, File file, final ApiCallback<ModelAPIResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = dialogFlowBatchUploadPostValidateBeforeCall(dialogFlowId, file, _callback);
        Type localVarReturnType = new TypeToken<ModelAPIResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dialogFlowCopyDialogFlowPost
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
    public okhttp3.Call dialogFlowCopyDialogFlowPostCall(CopyDialogFlowReq body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/dialogFlow/copyDialogFlow";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dialogFlowCopyDialogFlowPostValidateBeforeCall(CopyDialogFlowReq body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = dialogFlowCopyDialogFlowPostCall(body, _callback);
        return localVarCall;

    }

    /**
     * 话术复制
     * 通过接口可以复制指定话术
     * @param body  (optional)
     * @return CopyDialogFlowRsp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public CopyDialogFlowRsp dialogFlowCopyDialogFlowPost(CopyDialogFlowReq body) throws ApiException {
        ApiResponse<CopyDialogFlowRsp> localVarResp = dialogFlowCopyDialogFlowPostWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 话术复制
     * 通过接口可以复制指定话术
     * @param body  (optional)
     * @return ApiResponse&lt;CopyDialogFlowRsp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CopyDialogFlowRsp> dialogFlowCopyDialogFlowPostWithHttpInfo(CopyDialogFlowReq body) throws ApiException {
        okhttp3.Call localVarCall = dialogFlowCopyDialogFlowPostValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<CopyDialogFlowRsp>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 话术复制 (asynchronously)
     * 通过接口可以复制指定话术
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
    public okhttp3.Call dialogFlowCopyDialogFlowPostAsync(CopyDialogFlowReq body, final ApiCallback<CopyDialogFlowRsp> _callback) throws ApiException {

        okhttp3.Call localVarCall = dialogFlowCopyDialogFlowPostValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<CopyDialogFlowRsp>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dialogFlowGetDialogFlowCallJobRelatedInfoGet
     * @param dialogFlowId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dialogFlowGetDialogFlowCallJobRelatedInfoGetCall(Long dialogFlowId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dialogFlow/getDialogFlowCallJobRelatedInfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (dialogFlowId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dialogFlowId", dialogFlowId));
        }

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
    private okhttp3.Call dialogFlowGetDialogFlowCallJobRelatedInfoGetValidateBeforeCall(Long dialogFlowId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'dialogFlowId' is set
        if (dialogFlowId == null) {
            throw new ApiException("Missing the required parameter 'dialogFlowId' when calling dialogFlowGetDialogFlowCallJobRelatedInfoGet(Async)");
        }
        

        okhttp3.Call localVarCall = dialogFlowGetDialogFlowCallJobRelatedInfoGetCall(dialogFlowId, _callback);
        return localVarCall;

    }

    /**
     * 获取话术中存在人工介入和转人工等标识
     * 通过接口可以获取指定话术的标识
     * @param dialogFlowId  (required)
     * @return DialogFlowCallJobRelatedInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public DialogFlowCallJobRelatedInfo dialogFlowGetDialogFlowCallJobRelatedInfoGet(Long dialogFlowId) throws ApiException {
        ApiResponse<DialogFlowCallJobRelatedInfo> localVarResp = dialogFlowGetDialogFlowCallJobRelatedInfoGetWithHttpInfo(dialogFlowId);
        return localVarResp.getData();
    }

    /**
     * 获取话术中存在人工介入和转人工等标识
     * 通过接口可以获取指定话术的标识
     * @param dialogFlowId  (required)
     * @return ApiResponse&lt;DialogFlowCallJobRelatedInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DialogFlowCallJobRelatedInfo> dialogFlowGetDialogFlowCallJobRelatedInfoGetWithHttpInfo(Long dialogFlowId) throws ApiException {
        okhttp3.Call localVarCall = dialogFlowGetDialogFlowCallJobRelatedInfoGetValidateBeforeCall(dialogFlowId, null);
        Type localVarReturnType = new TypeToken<DialogFlowCallJobRelatedInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取话术中存在人工介入和转人工等标识 (asynchronously)
     * 通过接口可以获取指定话术的标识
     * @param dialogFlowId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dialogFlowGetDialogFlowCallJobRelatedInfoGetAsync(Long dialogFlowId, final ApiCallback<DialogFlowCallJobRelatedInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = dialogFlowGetDialogFlowCallJobRelatedInfoGetValidateBeforeCall(dialogFlowId, _callback);
        Type localVarReturnType = new TypeToken<DialogFlowCallJobRelatedInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dialogFlowGetTotalDialogFlowListPost
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
    public okhttp3.Call dialogFlowGetTotalDialogFlowListPostCall(GetTotalDialogFlowListReq body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/dialogFlow/getTotalDialogFlowList";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dialogFlowGetTotalDialogFlowListPostValidateBeforeCall(GetTotalDialogFlowListReq body, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = dialogFlowGetTotalDialogFlowListPostCall(body, _callback);
        return localVarCall;

    }

    /**
     * 话术列表
     * 通过接口可以获取所有话术列表
     * @param body  (optional)
     * @return TotalDialogFlowListRsp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public TotalDialogFlowListRsp dialogFlowGetTotalDialogFlowListPost(GetTotalDialogFlowListReq body) throws ApiException {
        ApiResponse<TotalDialogFlowListRsp> localVarResp = dialogFlowGetTotalDialogFlowListPostWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * 话术列表
     * 通过接口可以获取所有话术列表
     * @param body  (optional)
     * @return ApiResponse&lt;TotalDialogFlowListRsp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TotalDialogFlowListRsp> dialogFlowGetTotalDialogFlowListPostWithHttpInfo(GetTotalDialogFlowListReq body) throws ApiException {
        okhttp3.Call localVarCall = dialogFlowGetTotalDialogFlowListPostValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<TotalDialogFlowListRsp>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 话术列表 (asynchronously)
     * 通过接口可以获取所有话术列表
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
    public okhttp3.Call dialogFlowGetTotalDialogFlowListPostAsync(GetTotalDialogFlowListReq body, final ApiCallback<TotalDialogFlowListRsp> _callback) throws ApiException {

        okhttp3.Call localVarCall = dialogFlowGetTotalDialogFlowListPostValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<TotalDialogFlowListRsp>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportDialogFlowWordDoc
     * @param dialogFlowId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportDialogFlowWordDocCall(Long dialogFlowId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dialogFlow/exportDialogFlowWordDoc";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (dialogFlowId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dialogFlowId", dialogFlowId));
        }

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
    private okhttp3.Call exportDialogFlowWordDocValidateBeforeCall(Long dialogFlowId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'dialogFlowId' is set
        if (dialogFlowId == null) {
            throw new ApiException("Missing the required parameter 'dialogFlowId' when calling exportDialogFlowWordDoc(Async)");
        }
        

        okhttp3.Call localVarCall = exportDialogFlowWordDocCall(dialogFlowId, _callback);
        return localVarCall;

    }

    /**
     * 获取话术主流程word文档
     * 通过接口可以获取指定话术的主流程文档
     * @param dialogFlowId  (required)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public InlineResponse200 exportDialogFlowWordDoc(Long dialogFlowId) throws ApiException {
        ApiResponse<InlineResponse200> localVarResp = exportDialogFlowWordDocWithHttpInfo(dialogFlowId);
        return localVarResp.getData();
    }

    /**
     * 获取话术主流程word文档
     * 通过接口可以获取指定话术的主流程文档
     * @param dialogFlowId  (required)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InlineResponse200> exportDialogFlowWordDocWithHttpInfo(Long dialogFlowId) throws ApiException {
        okhttp3.Call localVarCall = exportDialogFlowWordDocValidateBeforeCall(dialogFlowId, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取话术主流程word文档 (asynchronously)
     * 通过接口可以获取指定话术的主流程文档
     * @param dialogFlowId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call exportDialogFlowWordDocAsync(Long dialogFlowId, final ApiCallback<InlineResponse200> _callback) throws ApiException {

        okhttp3.Call localVarCall = exportDialogFlowWordDocValidateBeforeCall(dialogFlowId, _callback);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDialogContentInfo
     * @param dialogFlowId 话术ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDialogContentInfoCall(Long dialogFlowId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dialogFlow/getDialogContentInfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (dialogFlowId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dialogFlowId", dialogFlowId));
        }

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
    private okhttp3.Call getDialogContentInfoValidateBeforeCall(Long dialogFlowId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'dialogFlowId' is set
        if (dialogFlowId == null) {
            throw new ApiException("Missing the required parameter 'dialogFlowId' when calling getDialogContentInfo(Async)");
        }
        

        okhttp3.Call localVarCall = getDialogContentInfoCall(dialogFlowId, _callback);
        return localVarCall;

    }

    /**
     * 获取话术中所有需要录音的文本和录音文件
     * 通过接口可以获取指定话术所有需要录音的文本和录音文件
     * @param dialogFlowId 话术ID (required)
     * @return DialogContentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public DialogContentInfo getDialogContentInfo(Long dialogFlowId) throws ApiException {
        ApiResponse<DialogContentInfo> localVarResp = getDialogContentInfoWithHttpInfo(dialogFlowId);
        return localVarResp.getData();
    }

    /**
     * 获取话术中所有需要录音的文本和录音文件
     * 通过接口可以获取指定话术所有需要录音的文本和录音文件
     * @param dialogFlowId 话术ID (required)
     * @return ApiResponse&lt;DialogContentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DialogContentInfo> getDialogContentInfoWithHttpInfo(Long dialogFlowId) throws ApiException {
        okhttp3.Call localVarCall = getDialogContentInfoValidateBeforeCall(dialogFlowId, null);
        Type localVarReturnType = new TypeToken<DialogContentInfo>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取话术中所有需要录音的文本和录音文件 (asynchronously)
     * 通过接口可以获取指定话术所有需要录音的文本和录音文件
     * @param dialogFlowId 话术ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDialogContentInfoAsync(Long dialogFlowId, final ApiCallback<DialogContentInfo> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDialogContentInfoValidateBeforeCall(dialogFlowId, _callback);
        Type localVarReturnType = new TypeToken<DialogContentInfo>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDialogFlowList
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDialogFlowListCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dialogFlow/getDialogFlowList";

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
    private okhttp3.Call getDialogFlowListValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getDialogFlowListCall(_callback);
        return localVarCall;

    }

    /**
     * 获取公司的机器人话术列表接口
     * 通过接口可以获取指定公司的所有配置完成的机器人话术
     * @return DialogFlowList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public DialogFlowList getDialogFlowList() throws ApiException {
        ApiResponse<DialogFlowList> localVarResp = getDialogFlowListWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 获取公司的机器人话术列表接口
     * 通过接口可以获取指定公司的所有配置完成的机器人话术
     * @return ApiResponse&lt;DialogFlowList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DialogFlowList> getDialogFlowListWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getDialogFlowListValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<DialogFlowList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取公司的机器人话术列表接口 (asynchronously)
     * 通过接口可以获取指定公司的所有配置完成的机器人话术
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDialogFlowListAsync(final ApiCallback<DialogFlowList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDialogFlowListValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<DialogFlowList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

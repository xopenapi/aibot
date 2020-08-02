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

import org.openapitools.client.ApiException;
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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DialogFlowApi
 */
@Ignore
public class DialogFlowApiTest {

    private final DialogFlowApi api = new DialogFlowApi();

    
    /**
     * 上传话术录音
     *
     * 通过接口可以上传话术中指定文本的录音
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dialogFlowBatchUploadPostTest() throws ApiException {
        Long dialogFlowId = null;
        File file = null;
        ModelAPIResponse response = api.dialogFlowBatchUploadPost(dialogFlowId, file);

        // TODO: test validations
    }
    
    /**
     * 话术复制
     *
     * 通过接口可以复制指定话术
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dialogFlowCopyDialogFlowPostTest() throws ApiException {
        CopyDialogFlowReq body = null;
        CopyDialogFlowRsp response = api.dialogFlowCopyDialogFlowPost(body);

        // TODO: test validations
    }
    
    /**
     * 获取话术中存在人工介入和转人工等标识
     *
     * 通过接口可以获取指定话术的标识
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dialogFlowGetDialogFlowCallJobRelatedInfoGetTest() throws ApiException {
        Long dialogFlowId = null;
        DialogFlowCallJobRelatedInfo response = api.dialogFlowGetDialogFlowCallJobRelatedInfoGet(dialogFlowId);

        // TODO: test validations
    }
    
    /**
     * 话术列表
     *
     * 通过接口可以获取所有话术列表
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dialogFlowGetTotalDialogFlowListPostTest() throws ApiException {
        GetTotalDialogFlowListReq body = null;
        TotalDialogFlowListRsp response = api.dialogFlowGetTotalDialogFlowListPost(body);

        // TODO: test validations
    }
    
    /**
     * 获取话术主流程word文档
     *
     * 通过接口可以获取指定话术的主流程文档
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void exportDialogFlowWordDocTest() throws ApiException {
        Long dialogFlowId = null;
        InlineResponse200 response = api.exportDialogFlowWordDoc(dialogFlowId);

        // TODO: test validations
    }
    
    /**
     * 获取话术中所有需要录音的文本和录音文件
     *
     * 通过接口可以获取指定话术所有需要录音的文本和录音文件
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDialogContentInfoTest() throws ApiException {
        Long dialogFlowId = null;
        DialogContentInfo response = api.getDialogContentInfo(dialogFlowId);

        // TODO: test validations
    }
    
    /**
     * 获取公司的机器人话术列表接口
     *
     * 通过接口可以获取指定公司的所有配置完成的机器人话术
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDialogFlowListTest() throws ApiException {
        DialogFlowList response = api.getDialogFlowList();

        // TODO: test validations
    }
    
}
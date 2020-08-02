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
import org.openapitools.client.model.CreatePolicyGroupReq;
import org.openapitools.client.model.GetIdAndNamePairListRsp;
import org.openapitools.client.model.GetPolicyGroupListRsp;
import org.openapitools.client.model.ModelAPIResponse;
import org.openapitools.client.model.UpdatePolicyGroupReq;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PolicyGroupApi
 */
@Ignore
public class PolicyGroupApiTest {

    private final PolicyGroupApi api = new PolicyGroupApi();

    
    /**
     * 创建外呼策略组接口
     *
     * 创建新的外呼策略组
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void policyGroupCreatePostTest() throws ApiException {
        CreatePolicyGroupReq body = null;
        ModelAPIResponse response = api.policyGroupCreatePost(body);

        // TODO: test validations
    }
    
    /**
     * 获取外呼策略组选择接口
     *
     * 通过此接口可以获取外呼策略组id和名称对应的键值对列表
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void policyGroupGetIdAndNamePairListGetTest() throws ApiException {
        GetIdAndNamePairListRsp response = api.policyGroupGetIdAndNamePairListGet();

        // TODO: test validations
    }
    
    /**
     * 获取外呼策略组列表接口
     *
     * 通过此接口可以获取用户所有的外呼策略组信息
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void policyGroupListGetTest() throws ApiException {
        GetPolicyGroupListRsp response = api.policyGroupListGet();

        // TODO: test validations
    }
    
    /**
     * 更新外呼策略组接口
     *
     * 更新新的外呼策略组
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void policyGroupUpdatePostTest() throws ApiException {
        UpdatePolicyGroupReq body = null;
        ModelAPIResponse response = api.policyGroupUpdatePost(body);

        // TODO: test validations
    }
    
}

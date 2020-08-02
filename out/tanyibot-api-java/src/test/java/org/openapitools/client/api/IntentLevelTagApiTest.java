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
import org.openapitools.client.model.GetIntentLevelTagRsp;
import org.openapitools.client.model.GetUsedIntentLevelTagListRsp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntentLevelTagApi
 */
@Ignore
public class IntentLevelTagApiTest {

    private final IntentLevelTagApi api = new IntentLevelTagApi();

    
    /**
     * 获取已使用的意向标签组列表接口
     *
     * 通过此接口可以获取已使用的所有意向标签组
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsedIntentLevelTagListTest() throws ApiException {
        GetUsedIntentLevelTagListRsp response = api.getUsedIntentLevelTagList();

        // TODO: test validations
    }
    
    /**
     * 获取意向标签内容
     *
     * 通过接口可以获取指定意向标签分组的内容
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void intentLevelTagGetIntentLevelTagGetTest() throws ApiException {
        Integer intentLevelTagId = null;
        GetIntentLevelTagRsp response = api.intentLevelTagGetIntentLevelTagGet(intentLevelTagId);

        // TODO: test validations
    }
    
}
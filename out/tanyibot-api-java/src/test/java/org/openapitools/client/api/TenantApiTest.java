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
import org.openapitools.client.model.GetTenantRsp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TenantApi
 */
@Ignore
public class TenantApiTest {

    private final TenantApi api = new TenantApi();

    
    /**
     * 获取公司列表接口
     *
     * 获取公司列表接口
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTenantTest() throws ApiException {
        GetTenantRsp response = api.getTenant();

        // TODO: test validations
    }
    
}
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
import org.openapitools.client.model.CheckAllRsp;
import org.openapitools.client.model.ExecuteJobsReq;
import org.openapitools.client.model.ExecuteJobsRsp;
import org.openapitools.client.model.GetJobDetailRsp;
import org.openapitools.client.model.GetJobStatsInfoListRsp;
import org.openapitools.client.model.GetJobsRsp;
import org.openapitools.client.model.ImportCustomerReq;
import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineObject1;
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineObject4;
import org.openapitools.client.model.InlineObject5;
import org.openapitools.client.model.Job;
import org.openapitools.client.model.JobCreateRsp;
import org.openapitools.client.model.JobUpdateRsp;
import org.openapitools.client.model.ModelAPIResponse;
import org.openapitools.client.model.ReAddCustomerToJobReq;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobApi
 */
@Ignore
public class JobApiTest {

    private final JobApi api = new JobApi();

    
    /**
     * 通过此接口可以创建新的任务
     *
     * 创建任务,支持使用多个无主叫固话,只需设置总并发数,由系统自动分配每个线路的并发。
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        Job body = null;
        JobCreateRsp response = api.create(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importCustomerTest() throws ApiException {
        ImportCustomerReq body = null;
        ModelAPIResponse response = api.importCustomer(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobCheckAllPostTest() throws ApiException {
        InlineObject4 body = null;
        CheckAllRsp response = api.jobCheckAllPost(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobDeletePostTest() throws ApiException {
        InlineObject2 body = null;
        ModelAPIResponse response = api.jobDeletePost(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobExecuteJobsPostTest() throws ApiException {
        ExecuteJobsReq body = null;
        ExecuteJobsRsp response = api.jobExecuteJobsPost(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobGetJobDetailGetTest() throws ApiException {
        Long robotCallJobId = null;
        GetJobDetailRsp response = api.jobGetJobDetailGet(robotCallJobId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobGetJobStatsInfoListPostTest() throws ApiException {
        InlineObject5 body = null;
        GetJobStatsInfoListRsp response = api.jobGetJobStatsInfoListPost(body);

        // TODO: test validations
    }
    
    /**
     * 获取任务列表接口
     *
     * 通过此接口可以获取指定公司的任务列表
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobGetJobsGetTest() throws ApiException {
        String name = null;
        String status = null;
        Integer pageNum = null;
        Integer pageSize = null;
        GetJobsRsp response = api.jobGetJobsGet(name, status, pageNum, pageSize);

        // TODO: test validations
    }
    
    /**
     * 修改任务接口
     *
     * 通过此接口可以修改任务
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobModifyPatchTest() throws ApiException {
        Job body = null;
        JobUpdateRsp response = api.jobModifyPatch(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobPausePostTest() throws ApiException {
        InlineObject1 body = null;
        ModelAPIResponse response = api.jobPausePost(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobReAddCustomerToJobPostTest() throws ApiException {
        ReAddCustomerToJobReq body = null;
        ModelAPIResponse response = api.jobReAddCustomerToJobPost(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void jobUpdateAiCountPostTest() throws ApiException {
        InlineObject3 body = null;
        ModelAPIResponse response = api.jobUpdateAiCountPost(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startTest() throws ApiException {
        InlineObject body = null;
        ModelAPIResponse response = api.start(body);

        // TODO: test validations
    }
    
}

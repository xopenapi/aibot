package org.openapitools.api

import org.openapitools.model.APIResponse
import org.openapitools.model.CreateJobReq
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class JobApiTest {

    
    private val api: JobApiController = JobApiController()

    
    /**
    * 通过此接口可以创建新的任务
    *
    * 创建任务,支持使用多个无主叫固话,只需设置总并发数,由系统自动分配每个线路的并发。
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun jobCreatePostTest() {
        val body:CreateJobReq? = null
        val response: ResponseEntity<APIResponse> = api.jobCreatePost(body!!)

        // TODO: test validations
    }
    
}

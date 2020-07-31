package org.openapitools.api

import org.openapitools.model.InterceptListRsp
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class CallInterceptApiTest {

    
    private val api: CallInterceptApiController = CallInterceptApiController()

    
    /**
    * 获取拦截组列表接口
    *
    * 通过此接口可以获取所有拦截组
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun callInterceptListGetTest() {
        val response: ResponseEntity<InterceptListRsp> = api.callInterceptListGet()

        // TODO: test validations
    }
    
}

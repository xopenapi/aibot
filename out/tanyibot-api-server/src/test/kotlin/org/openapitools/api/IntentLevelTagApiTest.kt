package org.openapitools.api

import org.openapitools.model.GetUsedIntentLevelTagListRsp
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class IntentLevelTagApiTest {

    
    private val api: IntentLevelTagApiController = IntentLevelTagApiController()

    
    /**
    * 获取已使用的意向标签组列表接口
    *
    * 通过此接口可以获取已使用的所有意向标签组
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getUsedIntentLevelTagListTest() {
        val response: ResponseEntity<GetUsedIntentLevelTagListRsp> = api.getUsedIntentLevelTagList()

        // TODO: test validations
    }
    
}

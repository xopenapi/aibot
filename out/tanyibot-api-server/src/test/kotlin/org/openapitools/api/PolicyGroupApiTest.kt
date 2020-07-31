package org.openapitools.api

import org.openapitools.model.GetIdAndNamePairListRsp
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class PolicyGroupApiTest {

    
    private val api: PolicyGroupApiController = PolicyGroupApiController()

    
    /**
    * 获取外呼策略组选择接口
    *
    * 通过此接口可以获取外呼策略组id和名称对应的键值对列表
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun policyGroupGetIdAndNamePairListGetTest() {
        val response: ResponseEntity<GetIdAndNamePairListRsp> = api.policyGroupGetIdAndNamePairListGet()

        // TODO: test validations
    }
    
}

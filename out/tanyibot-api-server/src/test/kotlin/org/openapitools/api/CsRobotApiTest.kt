package org.openapitools.api

import org.openapitools.model.StaffGroupListRsp
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class CsRobotApiTest {

    
    private val api: CsRobotApiController = CsRobotApiController()

    
    /**
    * 获取人工坐席列表接口
    *
    * 通过此接口可以获取用户所有的有效坐席组列表信息
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun staffGroupListTest() {
        val response: ResponseEntity<StaffGroupListRsp> = api.staffGroupList()

        // TODO: test validations
    }
    
}

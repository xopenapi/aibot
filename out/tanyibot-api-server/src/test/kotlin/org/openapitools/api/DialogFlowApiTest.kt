package org.openapitools.api

import org.openapitools.model.DialogFlowList
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class DialogFlowApiTest {

    
    private val api: DialogFlowApiController = DialogFlowApiController()

    
    /**
    * 获取公司的机器人话术列表接口
    *
    * 通过接口可以获取指定公司的所有配置完成的机器人话术
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun dialogFlowGetDialogFlowListGetTest() {
        val response: ResponseEntity<DialogFlowList> = api.dialogFlowGetDialogFlowListGet()

        // TODO: test validations
    }
    
}

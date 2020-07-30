package org.openapitools.api

import org.openapitools.model.GetSubAccountIsvReq
import org.openapitools.model.GetSubAccountIsvResp
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class IsvApiTest {

    
    private val api: IsvApiController = IsvApiController()

    
    /**
    * 通过此接口可生成子账号的ISV账号
    *
    * 通过此接口可生成子账号的ISV账号
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun genSubAccountIsvTest() {
        val body:GetSubAccountIsvReq? = null
        val response: ResponseEntity<GetSubAccountIsvResp> = api.genSubAccountIsv(body!!)

        // TODO: test validations
    }
    
}

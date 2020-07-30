package org.openapitools.api

import org.openapitools.model.GetTenantRsp
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class TenantApiTest {

    
    private val api: TenantApiController = TenantApiController()

    
    /**
    * 获取公司列表接口
    *
    * 获取公司列表接口
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getTenantTest() {
        val response: ResponseEntity<GetTenantRsp> = api.getTenant()

        // TODO: test validations
    }
    
}

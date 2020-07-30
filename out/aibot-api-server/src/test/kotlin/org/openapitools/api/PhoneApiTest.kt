package org.openapitools.api

import org.openapitools.model.APIResponse
import org.openapitools.model.GetPhoneListResp
import org.openapitools.model.UpdatePhoneInfoByTenantPhoneNumberIdReq
import org.junit.jupiter.api.Test

import org.springframework.http.ResponseEntity

class PhoneApiTest {

    
    private val api: PhoneApiController = PhoneApiController()

    
    /**
    * 通过接口可以获取所有可用的外呼线路的列表
    *
    * 通过接口可以获取所有可用的外呼线路的列表
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun getPhoneListTest() {
        val response: ResponseEntity<GetPhoneListResp> = api.getPhoneList()

        // TODO: test validations
    }
    
    /**
    * 通过此接口修改线路的归属地、行业、黑名单，只能修改归属客户自己的线路
    *
    * 通过此接口修改线路的归属地、行业、黑名单，只能修改归属客户自己的线路
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updatePhoneInfoByTenantPhoneNumberIdTest() {
        val body:UpdatePhoneInfoByTenantPhoneNumberIdReq? = null
        val response: ResponseEntity<APIResponse> = api.updatePhoneInfoByTenantPhoneNumberId(body!!)

        // TODO: test validations
    }
    
    /**
    * 修改绑定客户线路的价格
    *
    * 修改绑定客户线路的价格
    *
    * @throws ApiException
    *          if the Api call fails
    */
    @Test
    fun updatePhonePriceByTenantPhoneNumberIdTest() {
        val response: ResponseEntity<APIResponse> = api.updatePhonePriceByTenantPhoneNumberId()

        // TODO: test validations
    }
    
}

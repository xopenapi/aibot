package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param code 响应码
 * @param requestId 请求Id
 * @param resultMsg 响应说明
 * @param tenantSign 客户签名
 * @param appKey 
 * @param appSecret 
 */
data class GetSubAccountIsvResp(

    @field:JsonProperty("code") val code: kotlin.Int? = null,

    @field:JsonProperty("requestId") val requestId: kotlin.String? = null,

    @field:JsonProperty("resultMsg") val resultMsg: kotlin.String? = null,

    @field:JsonProperty("tenantSign") val tenantSign: kotlin.String? = null,

    @field:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @field:JsonProperty("appSecret") val appSecret: kotlin.String? = null
) {

}


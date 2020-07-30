package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.APIResponse
import org.openapitools.model.GetTenantRspAllOf
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
 * @param requestId 请求id
 * @param resultMsg 响应说明
 * @param tenantName 
 * @param tenantId 
 */
data class GetTenantRsp(

    @field:JsonProperty("code") val code: kotlin.Int? = null,

    @field:JsonProperty("requestId") val requestId: kotlin.String? = null,

    @field:JsonProperty("resultMsg") val resultMsg: kotlin.String? = null,

    @field:JsonProperty("tenantName") val tenantName: kotlin.String? = null,

    @field:JsonProperty("tenantId") val tenantId: kotlin.String? = null
) {

}

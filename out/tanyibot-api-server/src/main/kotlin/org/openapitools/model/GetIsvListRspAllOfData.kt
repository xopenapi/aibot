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
 * @param tenantSign 
 * @param appKey 
 * @param appSecret 
 * @param callbackUrl 
 */
data class GetIsvListRspAllOfData(

    @field:JsonProperty("tenantSign") val tenantSign: kotlin.String? = null,

    @field:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @field:JsonProperty("appSecret") val appSecret: kotlin.String? = null,

    @field:JsonProperty("callbackUrl") val callbackUrl: kotlin.String? = null
) {

}

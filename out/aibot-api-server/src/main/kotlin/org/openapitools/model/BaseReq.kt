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
 * @param appKey 
 * @param appSecret 
 * @param tenantSign 
 * @param version 
 * @param timestamp 
 * @param signature 
 */
data class BaseReq(

    @field:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @field:JsonProperty("appSecret") val appSecret: kotlin.String? = null,

    @field:JsonProperty("tenantSign") val tenantSign: kotlin.String? = null,

    @field:JsonProperty("version") val version: kotlin.String? = null,

    @field:JsonProperty("timestamp") val timestamp: kotlin.String? = null,

    @field:JsonProperty("signature") val signature: kotlin.String? = null
) {

}


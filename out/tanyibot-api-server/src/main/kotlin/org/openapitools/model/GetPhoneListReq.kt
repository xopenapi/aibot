package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BaseReq
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 */
data class GetPhoneListReq(

    @field:JsonProperty("appKey") override val appKey: kotlin.String? = null,

    @field:JsonProperty("appSecret") override val appSecret: kotlin.String? = null,

    @field:JsonProperty("tenantSign") override val tenantSign: kotlin.String? = null,

    @field:JsonProperty("version") override val version: kotlin.String? = null,

    @field:JsonProperty("timestamp") override val timestamp: kotlin.String? = null,

    @field:JsonProperty("signature") override val signature: kotlin.String? = null
) : BaseReq{

}


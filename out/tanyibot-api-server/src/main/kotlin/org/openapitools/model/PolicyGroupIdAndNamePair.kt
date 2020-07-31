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
 * @param callPolicyGroupId 外呼策略组id
 * @param tenantId 公司Id
 * @param name 外呼策略组名称
 */
data class PolicyGroupIdAndNamePair(

    @field:JsonProperty("callPolicyGroupId") val callPolicyGroupId: kotlin.String? = null,

    @field:JsonProperty("tenantId") val tenantId: kotlin.Long? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null
) {

}


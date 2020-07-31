package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LineStatus
import org.openapitools.model.Phone
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param createUserId 
 * @param updateUserId 
 * @param createTime 
 * @param updateTime 
 * @param callPolicyGroupDetailId 
 * @param callPolicyGroupId 
 * @param tenantId 
 * @param phoneNumberId 
 * @param tenantPhoneNumberId 
 * @param sort 
 * @param phoneNumberInfo 
 * @param lineStatus 
 */
data class CallPolicyGroupDetail(

    @field:JsonProperty("createUserId") val createUserId: kotlin.Int? = null,

    @field:JsonProperty("updateUserId") val updateUserId: kotlin.Int? = null,

    @field:JsonProperty("createTime") val createTime: kotlin.String? = null,

    @field:JsonProperty("updateTime") val updateTime: kotlin.String? = null,

    @field:JsonProperty("callPolicyGroupDetailId") val callPolicyGroupDetailId: kotlin.Int? = null,

    @field:JsonProperty("callPolicyGroupId") val callPolicyGroupId: kotlin.Int? = null,

    @field:JsonProperty("tenantId") val tenantId: kotlin.Long? = null,

    @field:JsonProperty("phoneNumberId") val phoneNumberId: kotlin.Int? = null,

    @field:JsonProperty("tenantPhoneNumberId") val tenantPhoneNumberId: kotlin.Int? = null,

    @field:JsonProperty("sort") val sort: kotlin.Int? = null,

    @field:JsonProperty("phoneNumberInfo") val phoneNumberInfo: kotlin.collections.List<Phone>? = null,

    @field:JsonProperty("lineStatus") val lineStatus: LineStatus? = null
) {

}


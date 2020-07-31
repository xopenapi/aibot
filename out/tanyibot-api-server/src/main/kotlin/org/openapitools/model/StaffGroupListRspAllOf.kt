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
 * @param number 
 * @param pageSize 
 * @param totalElements 
 * @param pages 
 * @param csStaffGroupId 
 * @param groupName 
 */
data class StaffGroupListRspAllOf(

    @field:JsonProperty("number") val number: kotlin.Int? = null,

    @field:JsonProperty("pageSize") val pageSize: kotlin.Int? = null,

    @field:JsonProperty("totalElements") val totalElements: kotlin.Int? = null,

    @field:JsonProperty("pages") val pages: kotlin.Int? = null,

    @field:JsonProperty("csStaffGroupId") val csStaffGroupId: kotlin.Long? = null,

    @field:JsonProperty("groupName") val groupName: kotlin.String? = null
) {

}

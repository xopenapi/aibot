package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param name 外呼策略组名称
 * @param dispatchType 优先级策略，(SORT_FIRST, \"排序优先级优先\"),(LOCATION_MATCH_FIRST, \"归属地匹配优先\");
 * @param tenantPhoneNumberId 用户线路ID
 * @param remark 备注
 */
data class CreatePolicyGroupReq(

    @get:NotNull 
    @field:JsonProperty("name") val name: kotlin.String,

    @get:NotNull 
    @field:JsonProperty("dispatchType") val dispatchType: CreatePolicyGroupReq.DispatchType,

    @get:NotNull 
    @field:JsonProperty("tenantPhoneNumberId") val tenantPhoneNumberId: kotlin.Long,

    @field:JsonProperty("remark") val remark: kotlin.String? = null
) {

    /**
    * 优先级策略，(SORT_FIRST, \"排序优先级优先\"),(LOCATION_MATCH_FIRST, \"归属地匹配优先\");
    * Values: sORTFIRST,lOCATIONMATCHFIRST
    */
    enum class DispatchType(val value: kotlin.String) {
    
        @JsonProperty("SORT_FIRST") sORTFIRST("SORT_FIRST"),
    
        @JsonProperty("LOCATION_MATCH_FIRST") lOCATIONMATCHFIRST("LOCATION_MATCH_FIRST");
    
    }

}


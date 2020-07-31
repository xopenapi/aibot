package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CallPolicyGroupDetail
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
 * @param callPolicyGroupId 外呼策略组ID
 * @param tenantId 公司ID
 * @param name 
 * @param remark 备注
 * @param phoneType 外呼策略组类型
 * @param dispatchType 优先级策略，(SORT_FIRST, \"排序优先级优先\"),(LOCATION_MATCH_FIRST, \"归属地匹配优先\")
 * @param detailList 
 */
data class PolicyGroup(

    @field:JsonProperty("createUserId") val createUserId: kotlin.Int? = null,

    @field:JsonProperty("updateUserId") val updateUserId: kotlin.Int? = null,

    @field:JsonProperty("createTime") val createTime: kotlin.String? = null,

    @field:JsonProperty("updateTime") val updateTime: kotlin.String? = null,

    @field:JsonProperty("callPolicyGroupId") val callPolicyGroupId: kotlin.Int? = null,

    @field:JsonProperty("tenantId") val tenantId: kotlin.Long? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("remark") val remark: kotlin.String? = null,

    @field:JsonProperty("phoneType") val phoneType: kotlin.String? = null,

    @field:JsonProperty("dispatchType") val dispatchType: PolicyGroup.DispatchType? = null,

    @field:JsonProperty("detailList") val detailList: kotlin.collections.List<CallPolicyGroupDetail>? = null
) {

    /**
    * 优先级策略，(SORT_FIRST, \"排序优先级优先\"),(LOCATION_MATCH_FIRST, \"归属地匹配优先\")
    * Values: sORTFIRST,lOCATIONMATCHFIRST
    */
    enum class DispatchType(val value: kotlin.String) {
    
        @JsonProperty("SORT_FIRST") sORTFIRST("SORT_FIRST"),
    
        @JsonProperty("LOCATION_MATCH_FIRST") lOCATIONMATCHFIRST("LOCATION_MATCH_FIRST");
    
    }

}


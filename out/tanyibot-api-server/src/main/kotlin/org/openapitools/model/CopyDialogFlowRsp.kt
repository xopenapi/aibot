package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.APIResponse
import org.openapitools.model.CopyDialogFlowRspAllOf
import org.openapitools.model.Industry
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
 * @param errorStackTrace 
 * @param dialogFlowId 话术id
 * @param name 话术名称
 * @param intentLevelTagId 意向分组id
 * @param status 话术状态(DRAFT 草稿 PENDING_APPROVAL 等待审核 REJECTED 拒绝 APPROVED 审核通过)
 * @param createTime 话术创建时间
 * @param industry 
 * @param subIndustry 
 * @param description 描述
 * @param type 话术类型(NORMAL 客户定制 TEMPLATE 模板)
 */
data class CopyDialogFlowRsp(

    @field:JsonProperty("code") val code: kotlin.Int? = null,

    @field:JsonProperty("requestId") val requestId: kotlin.String? = null,

    @field:JsonProperty("resultMsg") val resultMsg: kotlin.String? = null,

    @field:JsonProperty("errorStackTrace") val errorStackTrace: kotlin.String? = null,

    @field:JsonProperty("dialogFlowId") val dialogFlowId: kotlin.Long? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("intentLevelTagId") val intentLevelTagId: kotlin.Long? = null,

    @field:JsonProperty("status") val status: kotlin.String? = null,

    @field:JsonProperty("createTime") val createTime: kotlin.String? = null,

    @field:JsonProperty("industry") val industry: Industry? = null,

    @field:JsonProperty("subIndustry") val subIndustry: Industry? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("type") val type: CopyDialogFlowRsp.Type? = null
) {

    /**
    * 话术类型(NORMAL 客户定制 TEMPLATE 模板)
    * Values: nORMAL,tEMPLATE
    */
    enum class Type(val value: kotlin.String) {
    
        @JsonProperty("NORMAL") nORMAL("NORMAL"),
    
        @JsonProperty("TEMPLATE") tEMPLATE("TEMPLATE");
    
    }

}


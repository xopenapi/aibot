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
 * @param dialogFlowId 机器人话术id
 * @param name 机器人话术名称
 * @param industry 一级行业类型（枚举在枚举说明中）
 * @param subIndustry 二级行业类型（枚举在枚举说明中）
 * @param intentLevelTagId 意向标签分组id
 * @param status 话术状态(DRAFT 草稿 PENDING_APPROVAL 等待审核 REJECTED 拒绝 APPROVED 审核通过)
 * @param createTime 创建时间
 * @param type 
 * @param description 
 * @param intentLevelTagName 
 */
data class DialogFlow(

    @field:JsonProperty("dialogFlowId") val dialogFlowId: kotlin.Int? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("industry") val industry: kotlin.String? = null,

    @field:JsonProperty("subIndustry") val subIndustry: kotlin.String? = null,

    @field:JsonProperty("intentLevelTagId") val intentLevelTagId: kotlin.Long? = null,

    @field:JsonProperty("status") val status: kotlin.String? = null,

    @field:JsonProperty("createTime") val createTime: kotlin.String? = null,

    @field:JsonProperty("type") val type: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("intentLevelTagName") val intentLevelTagName: kotlin.String? = null
) {

}


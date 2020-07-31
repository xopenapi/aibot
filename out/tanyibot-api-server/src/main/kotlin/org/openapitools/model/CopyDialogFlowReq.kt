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
 * @param dialogFlowTemplateId 被复制话术ID
 * @param name 话术复制
 * @param description 测试话术
 * @param intentLevelTagId 意向规则分组id
 * @param vadGateMute 打断灵敏度 [1-9]
 * @param maxSentenceSilence 反应灵敏度 [1-9]
 * @param enableAskService 是否启用问法
 * @param branchLevel 
 */
data class CopyDialogFlowReq(

    @get:NotNull 
    @field:JsonProperty("dialogFlowTemplateId") val dialogFlowTemplateId: kotlin.Long,

    @get:NotNull 
    @field:JsonProperty("name") val name: kotlin.String,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("intentLevelTagId") val intentLevelTagId: kotlin.Long? = null,

    @field:JsonProperty("vadGateMute") val vadGateMute: kotlin.Int? = null,

    @field:JsonProperty("maxSentenceSilence") val maxSentenceSilence: kotlin.Int? = null,

    @field:JsonProperty("enableAskService") val enableAskService: kotlin.Boolean? = null,

    @field:JsonProperty("branchLevel") val branchLevel: kotlin.collections.List<kotlin.String>? = null
) {

}


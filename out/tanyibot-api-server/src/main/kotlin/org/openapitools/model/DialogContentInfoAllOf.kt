package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DialogFlowConfig
import org.openapitools.model.DialogFlowStep
import org.openapitools.model.KnowledgeStep
import org.openapitools.model.RobotKnowledge
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param dialogFlowId 话术id
 * @param name 话术名称
 * @param totalRecordCount 需要录音条数
 * @param completeRecordCount 已录音条数
 * @param label 文本标签(上传录音时已次标签为文件名)
 * @param title 流程、节点、问答知识等名称
 * @param context 录音文本内容
 * @param prefixRecordUrl 录音文件，未录音时此字段为空
 * @param dialogFlowSteps 
 * @param dialogFlowConfig 
 * @param robotKnowledges 
 * @param knowledgeSteps 
 */
data class DialogContentInfoAllOf(

    @field:JsonProperty("dialogFlowId") val dialogFlowId: kotlin.Long? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("totalRecordCount") val totalRecordCount: kotlin.Int? = null,

    @field:JsonProperty("completeRecordCount") val completeRecordCount: kotlin.Int? = null,

    @field:JsonProperty("label") val label: kotlin.String? = null,

    @field:JsonProperty("title") val title: kotlin.String? = null,

    @field:JsonProperty("context") val context: kotlin.String? = null,

    @field:JsonProperty("prefixRecordUrl") val prefixRecordUrl: kotlin.String? = null,

    @field:JsonProperty("dialogFlowSteps") val dialogFlowSteps: kotlin.collections.List<DialogFlowStep>? = null,

    @field:JsonProperty("dialogFlowConfig") val dialogFlowConfig: kotlin.collections.List<DialogFlowConfig>? = null,

    @field:JsonProperty("robotKnowledges") val robotKnowledges: kotlin.collections.List<RobotKnowledge>? = null,

    @field:JsonProperty("knowledgeSteps") val knowledgeSteps: kotlin.collections.List<KnowledgeStep>? = null
) {

}


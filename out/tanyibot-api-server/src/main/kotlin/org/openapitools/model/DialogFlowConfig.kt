package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DialogFlowNode
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 个性化配置
 * @param dialogFlowUserSayConfigs 客户单句时长触发
 * @param dialogFlowDeclineConfigs 触发多次拒绝
 * @param dialogFlowBusinessQAConfigs 触发多个业务问题
 */
data class DialogFlowConfig(

    @field:JsonProperty("dialogFlowUserSayConfigs") val dialogFlowUserSayConfigs: kotlin.collections.List<DialogFlowNode>? = null,

    @field:JsonProperty("dialogFlowDeclineConfigs") val dialogFlowDeclineConfigs: kotlin.collections.List<DialogFlowNode>? = null,

    @field:JsonProperty("dialogFlowBusinessQAConfigs") val dialogFlowBusinessQAConfigs: kotlin.collections.List<DialogFlowNode>? = null
) {

}


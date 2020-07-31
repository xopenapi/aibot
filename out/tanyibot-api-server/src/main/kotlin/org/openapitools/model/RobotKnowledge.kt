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
 * 问答知识
 * @param title 
 * @param answers 
 */
data class RobotKnowledge(

    @field:JsonProperty("title") val title: kotlin.String? = null,

    @field:JsonProperty("answers") val answers: kotlin.collections.List<DialogFlowNode>? = null
) {

}


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
 * 流程节点
 * @param label 
 * @param title 
 * @param context 
 * @param prefixRecordUrl 
 */
data class DialogFlowNode(

    @field:JsonProperty("label") val label: kotlin.String? = null,

    @field:JsonProperty("title") val title: kotlin.String? = null,

    @field:JsonProperty("context") val context: kotlin.String? = null,

    @field:JsonProperty("prefixRecordUrl") val prefixRecordUrl: kotlin.String? = null
) {

}


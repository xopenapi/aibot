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
 * @param placeholderExist 是否有变量名
 * @param jumpToHumanServiceExist 是否转人工标识
 * @param humanInterventionExist 是否有人工介入标识
 */
data class DialogFlowCallJobRelatedInfoAllOf(

    @field:JsonProperty("placeholderExist") val placeholderExist: kotlin.Boolean? = null,

    @field:JsonProperty("jumpToHumanServiceExist") val jumpToHumanServiceExist: kotlin.Boolean? = null,

    @field:JsonProperty("humanInterventionExist") val humanInterventionExist: kotlin.Boolean? = null
) {

}


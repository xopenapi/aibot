package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.APIResponse
import org.openapitools.model.DialogFlowCallJobRelatedInfoAllOf
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
 * @param placeholderExist 是否有变量名
 * @param jumpToHumanServiceExist 是否转人工标识
 * @param humanInterventionExist 是否有人工介入标识
 */
data class DialogFlowCallJobRelatedInfo(

    @field:JsonProperty("code") val code: kotlin.Int? = null,

    @field:JsonProperty("requestId") val requestId: kotlin.String? = null,

    @field:JsonProperty("resultMsg") val resultMsg: kotlin.String? = null,

    @field:JsonProperty("errorStackTrace") val errorStackTrace: kotlin.String? = null,

    @field:JsonProperty("placeholderExist") val placeholderExist: kotlin.Boolean? = null,

    @field:JsonProperty("jumpToHumanServiceExist") val jumpToHumanServiceExist: kotlin.Boolean? = null,

    @field:JsonProperty("humanInterventionExist") val humanInterventionExist: kotlin.Boolean? = null
) {

}


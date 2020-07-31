package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.APIResponse
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param apIResponse 
 * @param data 导出文档的下载链接
 */
data class InlineResponse200(

    @field:JsonProperty("APIResponse") val apIResponse: APIResponse? = null,

    @field:JsonProperty("data") val data: kotlin.String? = null
) {

}


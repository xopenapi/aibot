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
 * @param name 话术名称 模糊查询
 * @param pageNum 页码 默认为1
 * @param pageSize 每页条数 默认为20
 */
data class GetTotalDialogFlowListReq(

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("pageNum") val pageNum: kotlin.Int? = null,

    @field:JsonProperty("pageSize") val pageSize: kotlin.Int? = null
) {

}


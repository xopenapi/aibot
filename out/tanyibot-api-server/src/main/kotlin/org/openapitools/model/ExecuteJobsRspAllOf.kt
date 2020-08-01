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
 * @param robotCallJobId 任务id
 * @param robotCallJobName 任务名
 * @param msg 信息
 */
data class ExecuteJobsRspAllOf(

    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long? = null,

    @field:JsonProperty("robotCallJobName") val robotCallJobName: kotlin.String? = null,

    @field:JsonProperty("msg") val msg: kotlin.String? = null
) {

}


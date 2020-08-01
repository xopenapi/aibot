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
 * @param robotCallJobId 任务Id
 * @param robotCount 坐席数量
 */
data class InlineObject3(

    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long? = null,

    @field:JsonProperty("robotCount") val robotCount: kotlin.Int? = null
) {

}


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
 * @param status 
 * @param isLineAvailable 
 * @param hint 
 * @param occupiedJobList 
 */
data class LineStatus(

    @field:JsonProperty("status") val status: kotlin.String? = null,

    @field:JsonProperty("isLineAvailable") val isLineAvailable: kotlin.Boolean? = null,

    @field:JsonProperty("hint") val hint: kotlin.String? = null,

    @field:JsonProperty("occupiedJobList") val occupiedJobList: kotlin.String? = null
) {

}


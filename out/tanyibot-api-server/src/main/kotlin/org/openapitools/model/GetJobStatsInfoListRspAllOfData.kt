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
 * @param taskTotal 
 * @param taskCompleted 
 */
data class GetJobStatsInfoListRspAllOfData(

    @field:JsonProperty("taskTotal") val taskTotal: kotlin.Long? = null,

    @field:JsonProperty("taskCompleted") val taskCompleted: kotlin.Long? = null
) {

}


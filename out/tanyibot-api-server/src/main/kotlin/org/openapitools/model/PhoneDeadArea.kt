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
 * @param city 
 * @param prov 
 */
data class PhoneDeadArea(

    @field:JsonProperty("city") val city: kotlin.String? = null,

    @field:JsonProperty("prov") val prov: kotlin.String? = null
) {

}


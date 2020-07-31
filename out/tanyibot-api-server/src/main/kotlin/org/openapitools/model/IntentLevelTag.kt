package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.IntentLevelTagDetails
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param intentLevelTagId 意向标签分组Id
 * @param name 意向标签分组名称
 * @param details 
 */
data class IntentLevelTag(

    @field:JsonProperty("intentLevelTagId") val intentLevelTagId: kotlin.Int? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("details") val details: kotlin.collections.List<IntentLevelTagDetails>? = null
) {

}


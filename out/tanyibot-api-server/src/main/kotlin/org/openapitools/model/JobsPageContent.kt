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
 * @param robotCallJobId 
 * @param name 
 * @param status 
 * @param completedTask 
 * @param taskCallTotal 
 * @param createTime 
 * @param createdByUserName 
 * @param organizationName 
 */
data class JobsPageContent(

    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("status") val status: kotlin.String? = null,

    @field:JsonProperty("completedTask") val completedTask: kotlin.Long? = null,

    @field:JsonProperty("taskCallTotal") val taskCallTotal: kotlin.Long? = null,

    @field:JsonProperty("createTime") val createTime: kotlin.String? = null,

    @field:JsonProperty("createdByUserName") val createdByUserName: kotlin.String? = null,

    @field:JsonProperty("organizationName") val organizationName: kotlin.String? = null
) {

}


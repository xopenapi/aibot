package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CustomerPerson
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
 * @param callRecordDup 是否已呼列表去重 默认false
 * @param customerPersons 
 */
data class ImportCustomerReq(

    @get:NotNull 
    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long,

    @field:JsonProperty("callRecordDup") val callRecordDup: kotlin.Boolean? = null,

    @field:JsonProperty("customerPersons") val customerPersons: kotlin.collections.List<CustomerPerson>? = null
) {

}


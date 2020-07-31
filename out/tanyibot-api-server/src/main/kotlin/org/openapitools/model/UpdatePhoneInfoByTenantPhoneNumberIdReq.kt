package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * 
 * @param tenantPhoneNumberId 用户线路ID（代表绑给用户的虚拟线路）
 * @param areaCode 线路归属地
 * @param province 线路归属地省
 * @param city 线路归属地市
 * @param callOutIndustry (FINANCE, \"金融\"),(OTHER, \"其他\")
 * @param deadArea 
 */
data class UpdatePhoneInfoByTenantPhoneNumberIdReq(

    @field:JsonProperty("tenantPhoneNumberId") val tenantPhoneNumberId: kotlin.Long? = null,

    @field:JsonProperty("areaCode") val areaCode: kotlin.String? = null,

    @field:JsonProperty("province") val province: kotlin.String? = null,

    @field:JsonProperty("city") val city: kotlin.String? = null,

    @field:JsonProperty("callOutIndustry") val callOutIndustry: UpdatePhoneInfoByTenantPhoneNumberIdReq.CallOutIndustry? = null,

    @field:JsonProperty("deadArea") val deadArea: UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea? = null
) {

    /**
    * (FINANCE, \"金融\"),(OTHER, \"其他\")
    * Values: fINANCE,oTHER
    */
    enum class CallOutIndustry(val value: kotlin.String) {
    
        @JsonProperty("FINANCE") fINANCE("FINANCE"),
    
        @JsonProperty("OTHER") oTHER("OTHER");
    
    }

}


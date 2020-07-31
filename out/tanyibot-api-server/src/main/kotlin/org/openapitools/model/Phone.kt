package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PhoneDeadArea
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * Phone
 * @param tenantPhoneNumberId 电话id
 * @param phoneNumber 电话号码
 * @param phoneName 电话号码名称
 * @param phoneType (MOBILE, \"手机\"),(LANDLINE, \"固话\"),(UNFIXED_CALL, \"无主叫固话\")
 * @param localBillRate 本地话费（单位：厘）
 * @param otherBillRate 外地话费（单位：厘）
 * @param callOutIndustry (FINANCE, \"金融\"),(OTHER, \"其他\")
 * @param areaCode 归属地区号
 * @param province 归属地省
 * @param city 归属地市
 * @param deadArea 无法外呼地区
 */
data class Phone(

    @field:JsonProperty("tenantPhoneNumberId") val tenantPhoneNumberId: kotlin.Long? = null,

    @field:JsonProperty("phoneNumber") val phoneNumber: kotlin.String? = null,

    @field:JsonProperty("phoneName") val phoneName: kotlin.String? = null,

    @field:JsonProperty("phoneType") val phoneType: kotlin.String? = null,

    @field:JsonProperty("localBillRate") val localBillRate: kotlin.Int? = null,

    @field:JsonProperty("otherBillRate") val otherBillRate: kotlin.Int? = null,

    @field:JsonProperty("callOutIndustry") val callOutIndustry: kotlin.String? = null,

    @field:JsonProperty("areaCode") val areaCode: kotlin.String? = null,

    @field:JsonProperty("province") val province: kotlin.String? = null,

    @field:JsonProperty("city") val city: kotlin.String? = null,

    @field:JsonProperty("deadArea") val deadArea: kotlin.collections.List<PhoneDeadArea>? = null
) {

}


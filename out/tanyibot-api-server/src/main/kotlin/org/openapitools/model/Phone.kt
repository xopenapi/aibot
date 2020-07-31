package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param tenantPhoneNumberId 用户线路ID（代表绑给用户的虚拟线路）
 * @param phoneNumber 电话号码
 * @param phoneName 电话号码名称
 * @param phoneType 电话类型 (MOBILE，\"手机\"),(LANDLINE，\"固话\"),(UNFIXED_CALL，\"无主叫\"),(VOIP_DEVICE，\"网关设备\"), (CS_SEAT，\"人工外呼\"),(MESSAGE，\"短信\"),(CALL_POLICY_GROUP，\"外呼策略组\")
 * @param localBillRate 本地话费（单位：厘）
 * @param otherBillRate 外地话费（单位：厘）
 * @param callOutIndustry (FINANCE, \"金融\"),(OTHER, \"其他\")
 * @param areaCode 归属地区号
 * @param province 归属地省
 * @param city 归属地市
 * @param deadArea 无法外呼地区
 * @param tenantId 
 * @param concurrency 
 * @param phoneNumberId 线路ID（代表实际的线路）
 * @param accountFare 账户余额，单位（厘）
 * @param enabledStatus 是否启用，1为启用，0为禁用
 * @param monthlyBillRate 呼入月租费率，单位（厘）
 * @param callInLocalBillRate 呼入本地通话费用，单位（厘）
 * @param callInOtherBillRate 呼入外地通话费用，单位（厘）
 * @param callInBillMode 呼入计费方式 (MONTHLY，\"按月租计费\"),(CHAT_TIME，\"按通话时长(分钟)计费\")
 * @param lastHeartBeatTime 最后外呼时间
 * @param concurrenceLimit 并发数限制
 * @param remark 备注
 * @param sipAccount SIP账号
 * @param ownerName 归属公司名称
 * @param locationDisplayType 线路归属地显示方式（DEFAULT，\"默认显示配置归属地\"）,（RANDOM，\"全国随机显示\"）,（NO_DISPLAY，\"不显示\"）
 * @param ownerTenantId 归属公司ID
 */
data class Phone(

    @field:JsonProperty("tenantPhoneNumberId") val tenantPhoneNumberId: kotlin.Long? = null,

    @field:JsonProperty("phoneNumber") val phoneNumber: kotlin.String? = null,

    @field:JsonProperty("phoneName") val phoneName: kotlin.String? = null,

    @field:JsonProperty("phoneType") val phoneType: Phone.PhoneType? = null,

    @field:JsonProperty("localBillRate") val localBillRate: kotlin.Int? = null,

    @field:JsonProperty("otherBillRate") val otherBillRate: kotlin.Int? = null,

    @field:JsonProperty("callOutIndustry") val callOutIndustry: kotlin.String? = null,

    @field:JsonProperty("areaCode") val areaCode: kotlin.String? = null,

    @field:JsonProperty("province") val province: kotlin.String? = null,

    @field:JsonProperty("city") val city: kotlin.String? = null,

    @field:JsonProperty("deadArea") val deadArea: kotlin.collections.List<PhoneDeadArea>? = null,

    @field:JsonProperty("tenantId") val tenantId: kotlin.Long? = null,

    @field:JsonProperty("concurrency") val concurrency: kotlin.Int? = null,

    @field:JsonProperty("phoneNumberId") val phoneNumberId: kotlin.Int? = null,

    @field:JsonProperty("accountFare") val accountFare: kotlin.Int? = null,

    @field:JsonProperty("enabledStatus") val enabledStatus: kotlin.Int? = null,

    @field:JsonProperty("monthlyBillRate") val monthlyBillRate: kotlin.Int? = null,

    @field:JsonProperty("callInLocalBillRate") val callInLocalBillRate: kotlin.Int? = null,

    @field:JsonProperty("callInOtherBillRate") val callInOtherBillRate: kotlin.Int? = null,

    @field:JsonProperty("callInBillMode") val callInBillMode: Phone.CallInBillMode? = null,

    @field:JsonProperty("lastHeartBeatTime") val lastHeartBeatTime: kotlin.String? = null,

    @field:JsonProperty("concurrenceLimit") val concurrenceLimit: kotlin.Int? = null,

    @field:JsonProperty("remark") val remark: kotlin.String? = null,

    @field:JsonProperty("sipAccount") val sipAccount: kotlin.String? = null,

    @field:JsonProperty("ownerName") val ownerName: kotlin.String? = null,

    @field:JsonProperty("locationDisplayType") val locationDisplayType: Phone.LocationDisplayType? = null,

    @field:JsonProperty("ownerTenantId") val ownerTenantId: kotlin.Long? = null
) {

    /**
    * 电话类型 (MOBILE，\"手机\"),(LANDLINE，\"固话\"),(UNFIXED_CALL，\"无主叫\"),(VOIP_DEVICE，\"网关设备\"), (CS_SEAT，\"人工外呼\"),(MESSAGE，\"短信\"),(CALL_POLICY_GROUP，\"外呼策略组\")
    * Values: mOBILE,lANDLINE,uNFIXEDCALL,vOIPDEVICE,cSSEAT,mESSAGE,cALLPOLICYGROUP
    */
    enum class PhoneType(val value: kotlin.String) {
    
        @JsonProperty("MOBILE") mOBILE("MOBILE"),
    
        @JsonProperty("LANDLINE") lANDLINE("LANDLINE"),
    
        @JsonProperty("UNFIXED_CALL") uNFIXEDCALL("UNFIXED_CALL"),
    
        @JsonProperty("VOIP_DEVICE") vOIPDEVICE("VOIP_DEVICE"),
    
        @JsonProperty("CS_SEAT") cSSEAT("CS_SEAT"),
    
        @JsonProperty("MESSAGE") mESSAGE("MESSAGE"),
    
        @JsonProperty("CALL_POLICY_GROUP") cALLPOLICYGROUP("CALL_POLICY_GROUP");
    
    }

    /**
    * 呼入计费方式 (MONTHLY，\"按月租计费\"),(CHAT_TIME，\"按通话时长(分钟)计费\")
    * Values: mONTHLY,cHATTIME
    */
    enum class CallInBillMode(val value: kotlin.String) {
    
        @JsonProperty("MONTHLY") mONTHLY("MONTHLY"),
    
        @JsonProperty("CHAT_TIME") cHATTIME("CHAT_TIME");
    
    }

    /**
    * 线路归属地显示方式（DEFAULT，\"默认显示配置归属地\"）,（RANDOM，\"全国随机显示\"）,（NO_DISPLAY，\"不显示\"）
    * Values: dEFAULT,rANDOM,nODISPLAY
    */
    enum class LocationDisplayType(val value: kotlin.String) {
    
        @JsonProperty("DEFAULT") dEFAULT("DEFAULT"),
    
        @JsonProperty("RANDOM") rANDOM("RANDOM"),
    
        @JsonProperty("NO_DISPLAY") nODISPLAY("NO_DISPLAY");
    
    }

}


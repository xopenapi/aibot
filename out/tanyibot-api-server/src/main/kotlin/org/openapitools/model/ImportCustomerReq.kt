package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param phoneNumber 客户电话
 * @param callRecordDup 是否已呼列表去重 默认false
 * @param name 客户名称
 * @param gender 性别
 * @param properties 话术中自定义的语句内容
 */
data class ImportCustomerReq(

    @get:NotNull 
    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long,

    @get:NotNull 
    @field:JsonProperty("phoneNumber") val phoneNumber: kotlin.String,

    @field:JsonProperty("callRecordDup") val callRecordDup: kotlin.Boolean? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("gender") val gender: ImportCustomerReq.Gender? = null,

    @field:JsonProperty("properties") val properties: kotlin.Any? = null
) {

    /**
    * 性别
    * Values: mALE,fEMALE
    */
    enum class Gender(val value: kotlin.String) {
    
        @JsonProperty("MALE") mALE("MALE"),
    
        @JsonProperty("FEMALE") fEMALE("FEMALE");
    
    }

}


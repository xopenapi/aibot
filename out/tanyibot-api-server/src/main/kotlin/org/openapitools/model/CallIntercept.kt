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
 * @param tenantCallInterceptId 拦截组Id
 * @param name 拦截组名称
 * @param callOutRestrict 是否开启外呼上限设置(YES 开启 NO 不开启)
 * @param callOutCount 外呼次数上限限制
 * @param callOutDays 外呼次数天数内限制
 * @param notExistDays 空号天数限制 0为取消
 * @param notServiceDays 停机天数限制 0为取消
 * @param type 生效范围 ALL 全网 TENANT 公司内部
 * @param source 拦截组来源 SYSTEM 系统规则 CUSTOM 自定义规则
 * @param defaultStatus 是否默认规则
 */
data class CallIntercept(

    @field:JsonProperty("tenantCallInterceptId") val tenantCallInterceptId: kotlin.Long? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("callOutRestrict") val callOutRestrict: kotlin.String? = null,

    @field:JsonProperty("callOutCount") val callOutCount: kotlin.Int? = null,

    @field:JsonProperty("callOutDays") val callOutDays: kotlin.Int? = null,

    @field:JsonProperty("notExistDays") val notExistDays: kotlin.Int? = null,

    @field:JsonProperty("notServiceDays") val notServiceDays: kotlin.Int? = null,

    @field:JsonProperty("type") val type: CallIntercept.Type? = null,

    @field:JsonProperty("source") val source: CallIntercept.Source? = null,

    @field:JsonProperty("defaultStatus") val defaultStatus: kotlin.Boolean? = null
) {

    /**
    * 生效范围 ALL 全网 TENANT 公司内部
    * Values: aLL,tENANT
    */
    enum class Type(val value: kotlin.String) {
    
        @JsonProperty("ALL") aLL("ALL"),
    
        @JsonProperty("TENANT") tENANT("TENANT");
    
    }

    /**
    * 拦截组来源 SYSTEM 系统规则 CUSTOM 自定义规则
    * Values: sYSTEM,cUSTOM
    */
    enum class Source(val value: kotlin.String) {
    
        @JsonProperty("SYSTEM") sYSTEM("SYSTEM"),
    
        @JsonProperty("CUSTOM") cUSTOM("CUSTOM");
    
    }

}


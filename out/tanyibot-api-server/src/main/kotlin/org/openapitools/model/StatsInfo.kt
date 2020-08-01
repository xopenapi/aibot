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
 * @param completedTask 已完成的任务总量
 * @param totalTask 任务总数
 * @param answeredTask 接通电话总量
 * @param ablevelCustomer AB类客户数量
 */
data class StatsInfo(

    @field:JsonProperty("robotCallJobId") val robotCallJobId: kotlin.Long? = null,

    @field:JsonProperty("completedTask") val completedTask: kotlin.Long? = null,

    @field:JsonProperty("totalTask") val totalTask: kotlin.Long? = null,

    @field:JsonProperty("answeredTask") val answeredTask: kotlin.Long? = null,

    @field:JsonProperty("ablevelCustomer") val ablevelCustomer: kotlin.Long? = null
) {

}


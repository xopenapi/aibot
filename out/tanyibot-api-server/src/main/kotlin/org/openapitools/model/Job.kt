package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.RobotCallJob
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * Job
 * @param concurrencyQuota 并发数 开启一线多并发时可比robotCount大，不开启一线多并发是与robotCount相同（线路类型为手机号的时候可不传）
 * @param jobPhoneNumberIdList 通过获取外呼线路接口获取 tenant_phone_number_id,当类型是手机号的时候他的size代表机器人的个数，当类型非手机号的时候他的size只能是1；如果外呼方式选择的是外呼策略组，则里面内容为外呼策略组的id（size只能为1）
 * @param transferPhoneNumber 转人工号码,触发转人工时轮训号码列表
 * @param robotCallJob 
 */
data class Job(

    @field:JsonProperty("concurrencyQuota") val concurrencyQuota: kotlin.Int? = null,

    @field:JsonProperty("jobPhoneNumberIdList") val jobPhoneNumberIdList: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("transferPhoneNumber") val transferPhoneNumber: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("robotCallJob") val robotCallJob: RobotCallJob? = null
) {

}


/*
 * aibot open api
 *
 * aibot api
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package aibot
// Job Job
type Job struct {
	// 并发数 开启一线多并发时可比robotCount大，不开启一线多并发是与robotCount相同（线路类型为手机号的时候可不传）
	ConcurrencyQuota int32 `json:"concurrencyQuota,omitempty"`
	// 通过获取外呼线路接口获取 tenant_phone_number_id,当类型是手机号的时候他的size代表机器人的个数，当类型非手机号的时候他的size只能是1；如果外呼方式选择的是外呼策略组，则里面内容为外呼策略组的id（size只能为1）
	JobPhoneNumberIdList []int64 `json:"jobPhoneNumberIdList,omitempty"`
	// 转人工号码,触发转人工时轮训号码列表
	TransferPhoneNumber []string `json:"transferPhoneNumber,omitempty"`
	RobotCallJob RobotCallJob `json:"robotCallJob,omitempty"`
}
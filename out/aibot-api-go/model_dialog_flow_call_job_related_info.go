/*
 * aibot open api
 *
 * aibot api
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package aibot
// DialogFlowCallJobRelatedInfo struct for DialogFlowCallJobRelatedInfo
type DialogFlowCallJobRelatedInfo struct {
	// 响应码
	Code int32 `json:"code,omitempty"`
	// 请求id
	RequestId string `json:"requestId,omitempty"`
	// 响应说明
	ResultMsg string `json:"resultMsg,omitempty"`
	ErrorStackTrace string `json:"errorStackTrace,omitempty"`
	// 是否有变量名
	PlaceholderExist bool `json:"placeholderExist,omitempty"`
	// 是否转人工标识
	JumpToHumanServiceExist bool `json:"jumpToHumanServiceExist,omitempty"`
	// 是否有人工介入标识
	HumanInterventionExist bool `json:"humanInterventionExist,omitempty"`
}

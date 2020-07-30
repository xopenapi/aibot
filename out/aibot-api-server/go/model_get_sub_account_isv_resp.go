/*
 * AIBot open api
 *
 * aibot api
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// GetSubAccountIsvResp - 
type GetSubAccountIsvResp struct {

	// 响应码
	Code int32 `json:"code,omitempty"`

	// 请求Id
	RequestId string `json:"requestId,omitempty"`

	// 响应说明
	ResultMsg string `json:"resultMsg,omitempty"`

	// 客户签名
	TenantSign string `json:"tenantSign,omitempty"`

	AppKey string `json:"appKey,omitempty"`

	AppSecret string `json:"appSecret,omitempty"`
}
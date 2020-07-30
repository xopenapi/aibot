/*
 * AIBot open api
 *
 * aibot api
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// GetPhoneListResp - 
type GetPhoneListResp struct {

	// 响应码
	Code int32 `json:"code,omitempty"`

	// 电话id
	TenantPhoneNumberId int64 `json:"tenantPhoneNumberId,omitempty"`

	// 电话号码
	PhoneNumber string `json:"phoneNumber,omitempty"`

	// 电话号码名称
	PhoneName string `json:"phoneName,omitempty"`

	// (MOBILE, \"手机\"),(LANDLINE, \"固话\"),(UNFIXED_CALL, \"无主叫固话\")
	PhoneType string `json:"phoneType,omitempty"`

	// 本地话费（单位：厘）
	LocalBillRate string `json:"localBillRate,omitempty"`

	// 外地话费（单位：厘）
	OtherBillRate string `json:"otherBillRate,omitempty"`

	// (FINANCE, \"金融\"),(OTHER, \"其他\")
	CallOutIndustry string `json:"callOutIndustry,omitempty"`

	// 归属地区号
	AreaCode string `json:"areaCode,omitempty"`

	// 归属地省
	Province string `json:"province,omitempty"`

	// 归属地市
	City string `json:"city,omitempty"`

	// 无法外呼地区
	DeadArea string `json:"deadArea,omitempty"`
}
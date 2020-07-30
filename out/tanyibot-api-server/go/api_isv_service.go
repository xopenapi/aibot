/*
 * AIBot open api
 *
 * aibot api
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"errors"
)

// IsvApiService is a service that implents the logic for the IsvApiServicer
// This service should implement the business logic for every endpoint for the IsvApi API. 
// Include any external packages or services that will be required by this service.
type IsvApiService struct {
}

// NewIsvApiService creates a default api service
func NewIsvApiService() IsvApiServicer {
	return &IsvApiService{}
}

// GenSubAccountIsv - 通过此接口可生成子账号的ISV账号
func (s *IsvApiService) GenSubAccountIsv(body GetSubAccountIsvReq) (interface{}, error) {
	// TODO - update GenSubAccountIsv with the required logic for this service method.
	// Add api_isv_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.
	return nil, errors.New("service method 'GenSubAccountIsv' not implemented")
}
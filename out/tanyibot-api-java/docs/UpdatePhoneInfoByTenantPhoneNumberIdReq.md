

# UpdatePhoneInfoByTenantPhoneNumberIdReq


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantPhoneNumberId** | **Long** | 用户线路ID（代表绑给用户的虚拟线路） |  [optional]
**areaCode** | **String** | 线路归属地 |  [optional]
**province** | **String** | 线路归属地省 |  [optional]
**city** | **String** | 线路归属地市 |  [optional]
**callOutIndustry** | [**CallOutIndustryEnum**](#CallOutIndustryEnum) | (FINANCE, \&quot;金融\&quot;),(OTHER, \&quot;其他\&quot;) |  [optional]
**deadArea** | [**UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea**](UpdatePhoneInfoByTenantPhoneNumberIdReqDeadArea.md) |  |  [optional]



## Enum: CallOutIndustryEnum

Name | Value
---- | -----
FINANCE | &quot;FINANCE&quot;
OTHER | &quot;OTHER&quot;




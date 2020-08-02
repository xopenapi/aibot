

# Phone

Phone
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantPhoneNumberId** | **Long** | 用户线路ID（代表绑给用户的虚拟线路） |  [optional]
**phoneNumber** | **String** | 电话号码 |  [optional]
**phoneName** | **String** | 电话号码名称 |  [optional]
**phoneType** | [**PhoneTypeEnum**](#PhoneTypeEnum) | 电话类型 (MOBILE，\&quot;手机\&quot;),(LANDLINE，\&quot;固话\&quot;),(UNFIXED_CALL，\&quot;无主叫\&quot;),(VOIP_DEVICE，\&quot;网关设备\&quot;), (CS_SEAT，\&quot;人工外呼\&quot;),(MESSAGE，\&quot;短信\&quot;),(CALL_POLICY_GROUP，\&quot;外呼策略组\&quot;) |  [optional]
**localBillRate** | **Integer** | 本地话费（单位：厘） |  [optional]
**otherBillRate** | **Integer** | 外地话费（单位：厘） |  [optional]
**callOutIndustry** | **String** | (FINANCE, \&quot;金融\&quot;),(OTHER, \&quot;其他\&quot;) |  [optional]
**areaCode** | **String** | 归属地区号 |  [optional]
**province** | **String** | 归属地省 |  [optional]
**city** | **String** | 归属地市 |  [optional]
**deadArea** | [**List&lt;PhoneDeadArea&gt;**](PhoneDeadArea.md) | 无法外呼地区 |  [optional]
**tenantId** | **Long** |  |  [optional]
**concurrency** | **Integer** |  |  [optional]
**phoneNumberId** | **Integer** | 线路ID（代表实际的线路） |  [optional]
**accountFare** | **Integer** | 账户余额，单位（厘） |  [optional]
**enabledStatus** | **Integer** | 是否启用，1为启用，0为禁用 |  [optional]
**monthlyBillRate** | **Integer** | 呼入月租费率，单位（厘） |  [optional]
**callInLocalBillRate** | **Integer** | 呼入本地通话费用，单位（厘） |  [optional]
**callInOtherBillRate** | **Integer** | 呼入外地通话费用，单位（厘） |  [optional]
**callInBillMode** | [**CallInBillModeEnum**](#CallInBillModeEnum) | 呼入计费方式 (MONTHLY，\&quot;按月租计费\&quot;),(CHAT_TIME，\&quot;按通话时长(分钟)计费\&quot;) |  [optional]
**lastHeartBeatTime** | **String** | 最后外呼时间 |  [optional]
**concurrenceLimit** | **Integer** | 并发数限制 |  [optional]
**remark** | **String** | 备注 |  [optional]
**sipAccount** | **String** | SIP账号 |  [optional]
**ownerName** | **String** | 归属公司名称 |  [optional]
**locationDisplayType** | [**LocationDisplayTypeEnum**](#LocationDisplayTypeEnum) | 线路归属地显示方式（DEFAULT，\&quot;默认显示配置归属地\&quot;）,（RANDOM，\&quot;全国随机显示\&quot;）,（NO_DISPLAY，\&quot;不显示\&quot;） |  [optional]
**ownerTenantId** | **Long** | 归属公司ID |  [optional]



## Enum: PhoneTypeEnum

Name | Value
---- | -----
MOBILE | &quot;MOBILE&quot;
LANDLINE | &quot;LANDLINE&quot;
UNFIXED_CALL | &quot;UNFIXED_CALL&quot;
VOIP_DEVICE | &quot;VOIP_DEVICE&quot;
CS_SEAT | &quot;CS_SEAT&quot;
MESSAGE | &quot;MESSAGE&quot;
CALL_POLICY_GROUP | &quot;CALL_POLICY_GROUP&quot;



## Enum: CallInBillModeEnum

Name | Value
---- | -----
MONTHLY | &quot;MONTHLY&quot;
CHAT_TIME | &quot;CHAT_TIME&quot;



## Enum: LocationDisplayTypeEnum

Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
RANDOM | &quot;RANDOM&quot;
NO_DISPLAY | &quot;NO_DISPLAY&quot;




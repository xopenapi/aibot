

# CheckAllRspAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**robotCallJobId** | **String** | 任务id |  [optional]
**robotCallJobName** | **String** | 任务名 |  [optional]
**createTime** | **String** | 创建时间 |  [optional]
**createUserName** | **String** | 任务创建人 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | 任务状态，NOT_STARTED(0, \&quot;未开始\&quot;),IN_PROCESS(1, \&quot;进行中\&quot;)，COMPLETED(2, \&quot;已完成\&quot;),RUNNABLE(3, \&quot;可运行\&quot;),USER_PAUSE(4, \&quot;用户暂停\&quot;),SYSTEM_SUSPENDED(5, \&quot;系统暂停\&quot;)，TERMINATE(6, \&quot;已终止\&quot;),IN_QUEUE(7, \&quot;排队中\&quot;),SYSTEM_HANG_UP(10, \&quot;系统挂起\&quot;),WAITING_FOR_REDIAL(11, \&quot;等待重呼\&quot;),ACCOUNT_DISABLE(12, \&quot;账户禁用\&quot;),MAINTAIN(13, \&quot;系统维护\&quot;); |  [optional]
**hangUpType** | [**HangUpTypeEnum**](#HangUpTypeEnum) | 系统挂起类型 ACCOUNT_DEBT(0, \&quot;账户欠费\&quot;, \&quot;使用的线路账户已欠费\&quot;),NO_ROBOT_AVAILABLE(1, \&quot;没有可用坐席\&quot;, \&quot;当前没有可用坐席\&quot;),PHONE_UNBIND(2, \&quot;线路已解绑\&quot;, \&quot;使用的线路已解绑\&quot;),LINE_BREAKDOWN(3, \&quot;线路故障\&quot;, \&quot;使用的线路状态均为故障\&quot;),AVAILABLE_ROBOT_NOT_ENOUGH(4,\&quot;有效坐席数不足\&quot;,\&quot;有效坐席数不足，请检查有效AI坐席数量！\&quot;); |  [optional]
**hangUpReason** | **String** | 系统挂起原因 |  [optional]
**completedTask** | **Long** | 已完成的任务总量 |  [optional]
**totalTask** | **Long** | 任务总数 |  [optional]
**answeredTask** | **Long** | 接通电话总量 |  [optional]
**ablevelCustomer** | **Long** | AB类客户数量 |  [optional]
**msg** | **String** | 信息 |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
NOT_STARTED | &quot;NOT_STARTED&quot;
IN_PROCESS | &quot;IN_PROCESS&quot;
COMPLETED | &quot;COMPLETED&quot;
RUNNABLE | &quot;RUNNABLE&quot;
USER_PAUSE | &quot;USER_PAUSE&quot;
SYSTEM_SUSPENDED | &quot;SYSTEM_SUSPENDED&quot;
TERMINATE | &quot;TERMINATE&quot;
IN_QUEUE | &quot;IN_QUEUE&quot;
SYSTEM_HANG_UP | &quot;SYSTEM_HANG_UP&quot;
WAITING_FOR_REDIAL | &quot;WAITING_FOR_REDIAL&quot;
ACCOUNT_DISABLE | &quot;ACCOUNT_DISABLE&quot;
MAINTAIN | &quot;MAINTAIN&quot;



## Enum: HangUpTypeEnum

Name | Value
---- | -----
ACCOUNT_DEBT | &quot;ACCOUNT_DEBT&quot;
NO_ROBOT_AVAILABLE | &quot;NO_ROBOT_AVAILABLE&quot;
PHONE_UNBIND | &quot;PHONE_UNBIND&quot;
LINE_BREAKDOWN | &quot;LINE_BREAKDOWN&quot;
AVAILABLE_ROBOT_NOT_ENOUGH | &quot;AVAILABLE_ROBOT_NOT_ENOUGH&quot;




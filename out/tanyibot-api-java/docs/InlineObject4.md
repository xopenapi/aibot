

# InlineObject4

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) | 操作类型，必填 PAUSE:暂停 START:开始 | 
**robotCallJobIdSet** | **List&lt;String&gt;** | 任务id集合 |  [optional]
**statusSet** | [**StatusSetEnum**](#StatusSetEnum) | 任务状态，NOT_STARTED(0, \&quot;未开始\&quot;),IN_PROCESS(1, \&quot;进行中\&quot;)，COMPLETED(2, \&quot;已完成\&quot;),RUNNABLE(3, \&quot;可运行\&quot;),USER_PAUSE(4, \&quot;用户暂停\&quot;),SYSTEM_SUSPENDED(5, \&quot;系统暂停\&quot;)，TERMINATE(6, \&quot;已终止\&quot;),IN_QUEUE(7, \&quot;排队中\&quot;),SYSTEM_HANG_UP(10, \&quot;系统挂起\&quot;),WAITING_FOR_REDIAL(11, \&quot;等待重呼\&quot;),ACCOUNT_DISABLE(12, \&quot;账户禁用\&quot;),MAINTAIN(13, \&quot;系统维护\&quot;); |  [optional]
**name** | **String** | 任务名称 |  [optional]
**beginCreateDate** | **String** | 开始任务创建日期 |  [optional]
**endCreateDate** | **String** | 结束任务创建日期 |  [optional]



## Enum: OperationEnum

Name | Value
---- | -----
PAUSE | &quot;PAUSE&quot;
START | &quot;START&quot;



## Enum: StatusSetEnum

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




function save(successCallback) {
	$.post("quartzAddJob", {
		"jobClass" : $('#jobClass').val(),
		"jobGroup" : $('#jobGroup').val(),
		"jobName" : $('#jobName').val(),
		"triggerGroupName" : $('#triggerGroupName').val(),
		"triggerName" : $('#triggerName').val(),
		"cronExpression" : $('#cronExpression').val()
	}, function(data, status) {
		if (successCallback && typeof (successCallback) == 'function') {
			successCallback();
		}
	});
}
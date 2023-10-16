package com.purbarun.informatica.wf.process;

import com.purbarun.informatica.wf.model.WorkflowConfig;

public interface WorkflowSession {
	void preSql();

	void transform();

	void postSql();

	void process(WorkflowConfig workflowConfig);
}

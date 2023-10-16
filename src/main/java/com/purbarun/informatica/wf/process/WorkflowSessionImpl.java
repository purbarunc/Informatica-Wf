package com.purbarun.informatica.wf.process;

import com.purbarun.informatica.wf.model.WorkflowConfig;

public abstract class WorkflowSessionImpl implements WorkflowSession {
	@Override
	public void process(WorkflowConfig workflowConfig) {
		preSql();
		transform();
		postSql();
	}
}

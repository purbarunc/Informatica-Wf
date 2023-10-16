package com.purbarun.informatica.wf.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.purbarun.informatica.wf.process.WorkflowSessionImpl;
import com.purbarun.informatica.wf.utils.Constants;

public class PreProcess extends WorkflowSessionImpl {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void preSql() {
		logger.debug(Constants.LOGGER_MSG, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void transform() {
		logger.debug(Constants.LOGGER_MSG, Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void postSql() {
		logger.debug(Constants.LOGGER_MSG, Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}

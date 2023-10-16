package com.purbarun.informatica.wf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.purbarun.informatica.wf.process.WfExecutionManager;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private WfExecutionManager wfExecMgr;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		SpringApplication.exit(ctx, () -> 0);
	}

	@Override
	public void run(String... args) {
		ClassLoader classLoader = this.getClass().getClassLoader();
		wfExecMgr.executeWorkflow(classLoader);
	}
}

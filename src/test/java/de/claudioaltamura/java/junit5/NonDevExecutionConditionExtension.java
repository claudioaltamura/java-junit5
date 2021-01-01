package de.claudioaltamura.java.junit5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class NonDevExecutionConditionExtension implements ExecutionCondition {

	private static final String propertyFilePath = System.getProperty("user.dir")+
		"/src/test/resources/condition.properties";

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(
		ExtensionContext context)  {

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(propertyFilePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String environment = prop.getProperty("environment");
		if (environment.equals("DEV")) {
			return ConditionEvaluationResult.disabled("Test disabled on DEV environment.");
		}

		return ConditionEvaluationResult.enabled(
			"Test enabled on TEST environment");
	}

}

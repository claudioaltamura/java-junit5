package de.claudioaltamura.java.junit5;

import org.junit.jupiter.api.extension.*;

public class TestLifeCycleExtensions
    implements TestInstancePostProcessor,
        BeforeAllCallback,
        BeforeEachCallback,
        BeforeTestExecutionCallback,
        AfterTestExecutionCallback,
        AfterEachCallback,
        AfterAllCallback {

  @Override
  public void postProcessTestInstance(Object testInstance, ExtensionContext context) {
    log("TestInstancePostProcessor");
  }

  @Override
  public void beforeAll(ExtensionContext context) {
    log("BeforeAllCallback");
  }

  @Override
  public void beforeEach(ExtensionContext context) {
    log("BeforeEachCallback");
  }

  @Override
  public void beforeTestExecution(ExtensionContext context) {
    log("BeforeTestExecutionCallback");
  }

  @Override
  public void afterTestExecution(ExtensionContext context) {
    log("AfterTestExecutionCallback");
  }

  @Override
  public void afterEach(ExtensionContext context) {
    log("AfterEachCallback");
  }

  @Override
  public void afterAll(ExtensionContext context) {
    log("AfterAllCallback");
  }

  private void log(String logText) {
    System.out.println(logText);
  }
}

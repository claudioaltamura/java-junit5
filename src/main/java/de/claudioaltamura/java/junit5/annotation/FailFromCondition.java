package de.claudioaltamura.java.junit5.annotation;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.AnnotationUtils;
import org.opentest4j.AssertionFailedError;

import java.time.LocalDate;

public class FailFromCondition implements ExecutionCondition {
    private static final ConditionEvaluationResult ENABLED = ConditionEvaluationResult.enabled(
            "@FailFrom not present or date not yet reached");

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {

        final var annotation = AnnotationUtils.findAnnotation(context.getElement(), FailFrom.class);
        if(annotation.isPresent()) {
            final var failFrom =annotation.get();
            if(LocalDate.parse(failFrom.date())
                    .isBefore(LocalDate.now())) {
                throw new AssertionFailedError("Date passed: " + failFrom.date() + ". " + failFrom.reason());
            }
        }

        return ENABLED;
    }
}

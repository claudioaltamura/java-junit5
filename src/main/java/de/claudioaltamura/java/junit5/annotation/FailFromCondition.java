package de.claudioaltamura.java.junit5.annotation;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.AnnotationUtils;

import java.time.LocalDate;

public class FailFromCondition implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {

        var annotation = AnnotationUtils.findAnnotation(context.getElement(), FailFrom.class);
        if(annotation.isPresent()) {
            var failFrom =annotation.get();
            if(LocalDate.parse(failFrom.date())
                    .isBefore(LocalDate.now())) {
                System.out.println(annotation.get().date());
                System.out.println(annotation.get().reason());
                throw new JUnitException("Date passed: " + failFrom.date() + ". " + failFrom.reason());
            }
        }
        return null;
    }
}

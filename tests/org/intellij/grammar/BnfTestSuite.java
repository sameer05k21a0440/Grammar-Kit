package org.intellij.grammar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.intellij.grammar.expression.ExpressionParserTest;

/**
 * @author gregsh
 */
public class BnfTestSuite extends TestCase {
  public static Test suite() {
    final TestSuite testSuite = new TestSuite();
    testSuite.addTestSuite(BnfParserTest.class);
    testSuite.addTestSuite(BnfGeneratorTest.class);
    testSuite.addTestSuite(ExpressionParserTest.class);
    testSuite.addTestSuite(BnfAttributeDescriptionTest.class);
    testSuite.addTestSuite(BnfFirstNextTest.class);
    testSuite.addTestSuite(BnfCompletionTest.class);
    testSuite.addTestSuite(BnfInspectionTest.class);
    testSuite.addTestSuite(BnfInlineRuleTest.class);
    testSuite.addTestSuite(BnfIntroduceRuleTest.class);
    testSuite.addTestSuite(BnfFlipChoiceIntentionTest.class);
    return testSuite;
  }
}

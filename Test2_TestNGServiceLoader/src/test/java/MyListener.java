import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MyListener implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        TestMethodInfo anno = method.getTestMethod()
                .getConstructorOrMethod()
                .getMethod()
                .getAnnotation(TestMethodInfo.class);

        System.out.printf("%s %s %s%n", anno.priority(), anno.author(), anno.lastModified());
    }
}

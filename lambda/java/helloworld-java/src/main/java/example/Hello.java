package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
// import org.apache.logging.log4j.Logger;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class Hello implements RequestHandler<String, String> {
    // final static Logger logger = Logger.getLogger(Hello.class);

    @Override
    public String handleRequest(String input, Context context) {
	final LambdaLogger logger = context.getLogger();
	logger.log("Received : " + input); 
	String output = "Hello, " + input + "!";
	return output;
    }
}

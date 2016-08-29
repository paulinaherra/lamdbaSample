package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Basic lambda function that returns input or hello world.
 * @author pherra on 8/29/16.
 */
public class EventHandler implements RequestHandler<String, String> {

    private static final String HELLO_WORLD = "Hello World!";

    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     *
     * @return The Lambda Function output
     */
    public String handleRequest(String input, Context context) {
        LambdaLogger logger = context.getLogger();

        logger.log("Input: " + input);

        if(input != null && !input.equals("")){
            logger.log("Returning input: " + input);
            return input;
        }else{
            logger.log("Returning default: " + HELLO_WORLD);
            return HELLO_WORLD;
        }
    }
}

package com.dnyanesh.aws.lambda;

import java.util.Collections;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaJavaApi implements RequestHandler<Object, ResponseObject> {

	@Override
	public ResponseObject handleRequest(Object input, Context context) {

		System.out.println("Executin Lambda Java Api - AWS Request id " + context.getAwsRequestId());
		return new ResponseObject("Welcome Dnyanesh!", 200, Collections.singletonMap("Project-By", "Mr Dnyanesh"),
				false);
	}

}

package com.dnyanesh.aws.lambda;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseObject {

	private String body;
	private Integer statusCode;
	private Map<String, String> header;
	private Boolean isBase64Encoded;

}

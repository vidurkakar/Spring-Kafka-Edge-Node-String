package com.codenotfound.kafka.edgeNode1;

import com.codenotfound.kafka.model.Request;
import com.codenotfound.kafka.model.Response;

public class ProcessRequest {
    public Response requestProcess (Request request){
        Response response = new Response();
        response.setResult(request.getRequestValue() + " Edge Node1 SpecialKey{en001}");
        response.setProcessedBy("EdgeNode1");
        response.setSendingTo(request.getResponseGivenBackTo());
        response.setRequestNumber(request.getRequestNumber());
        return response;
    }
}

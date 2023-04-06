package ch.swc.awsgpt.gtp.boundary;

import ch.swc.bounary.model.AsyncGptRequestCreatedResponse;
import ch.swc.bounary.model.AsyncGptStatusResponse;
import ch.swc.bounary.model.GptResponse;
import ch.swc.boundary.api.AsyncApi;

public class AsyncGptResource implements AsyncApi {


    @Override
    public AsyncGptStatusResponse getProcessingStatus(String requestId) {
        return null;
    }

    @Override
    public GptResponse sendQuestionToGpt(AsyncGptRequestCreatedResponse asyncGptRequestCreatedResponse) {
        return null;
    }
}

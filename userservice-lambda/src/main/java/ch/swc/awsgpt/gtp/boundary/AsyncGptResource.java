package ch.swc.awsgpt.gtp.boundary;

import ch.swc.generated.boundary.api.AsyncApi;
import ch.swc.generated.boundary.model.AsyncGptRequestCreateRequest;
import ch.swc.generated.boundary.model.AsyncGptRequestCreatedResponse;
import ch.swc.generated.boundary.model.AsyncGptStatusResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name = "async")
public class AsyncGptResource implements AsyncApi {


    @Override
    public AsyncGptStatusResponse getProcessingStatus(String requestId) {
        return null;
    }

    @Override
    public AsyncGptRequestCreatedResponse sendQuestionToGpt(AsyncGptRequestCreateRequest asyncGptRequestCreateRequest) {
        return null;
    }

}

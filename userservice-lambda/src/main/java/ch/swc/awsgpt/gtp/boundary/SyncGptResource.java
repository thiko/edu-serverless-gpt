package ch.swc.awsgpt.gtp.boundary;

import ch.swc.awsgpt.gtp.control.GptSyncService;
import ch.swc.generated.boundary.api.SyncApi;
import ch.swc.generated.boundary.model.GptResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;

@Tag(name = "sync")
public class SyncGptResource implements SyncApi {

    @Inject
    GptSyncService gptSyncService;

    @Override
    public GptResponse getAnswerFromGpt(String question) {

        return gptSyncService.getAnswerFromGpt(question);
    }
}

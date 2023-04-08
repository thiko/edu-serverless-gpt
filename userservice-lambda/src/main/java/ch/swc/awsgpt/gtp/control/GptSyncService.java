package ch.swc.awsgpt.gtp.control;

import ch.swc.generated.boundary.model.GptResponse;
import ch.swc.generated.boundary.model.GptSource;
import ch.swc.llama.control.GptApi;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@ApplicationScoped
public class GptSyncService {

    @RestClient
    @Inject
    LlamaSyncApiClient llamaApi;


    public GptResponse getAnswerFromGpt(String gptRequest) {

        var llamaGptResponse = llamaApi.askGptGptGet(gptRequest);

        return new GptResponse()
                .summary(llamaGptResponse.getSummary())
                .sources(List.of(
                        new GptSource()
                                .documentId("1")
                                .sourceText("dgdfg")
                                .similarityScore(new BigDecimal("12.243"))
                ));
    }
}

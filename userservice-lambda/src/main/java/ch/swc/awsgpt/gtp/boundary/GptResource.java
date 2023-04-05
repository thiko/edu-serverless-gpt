package ch.swc.awsgpt.gtp.boundary;

import ch.swc.bounary.model.GptResponse;
import ch.swc.bounary.model.GptSource;
import ch.swc.boundary.api.SyncApi;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;

import java.math.BigDecimal;
import java.util.List;

@Tag(name = "sync")
@Tags(value = @Tag( name="sync"))
public class GptResource implements SyncApi {

    @Override
    public GptResponse getAnswerFromGpt(String question) {
        return new GptResponse()
                .summary("Testsummary")
                .sources(List.of(
                        new GptSource()
                                .documentId("1")
                                .sourceText("dgdfg")
                                .similarityScore(new BigDecimal("12.243"))
                ));
    }
}

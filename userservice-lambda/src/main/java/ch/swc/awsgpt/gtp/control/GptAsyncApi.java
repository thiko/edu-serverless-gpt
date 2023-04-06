package ch.swc.awsgpt.gtp.control;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GptAsyncApi {

    /**
     * Send the question request to the GTP Service using async mechanisms.
     * Returns a <b>request ID</b> for subsequent status polling of this request.
     * @return the created request ID
     */
    public String sendQuestionRequest(String questionForGpt) {
        // HTTP 202 + Location header with status endpoint
        return "";
    }

    public String getStatusOfRequest(String requestId) {
        // 200 - if operation is still in progress + Retry-after HTTP header
        // 302 (Found) - if operation completed
        return "N/A";
    }



    // https://learn.microsoft.com/en-us/azure/architecture/patterns/async-request-reply
}

package ch.swc.awsgpt.gtp.control;

import ch.swc.llama.control.GptApi;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Path;

/**
 * Llama Sync rest API client
 * The whole point of this interface is to add @RegisterRestClient to the generated GptApi.
 * There are better ways in doing this by configuring the generator plugin appropriately...
 */
@Path("/gpt") // Looks like a bug. Need to specify it again even-though its already part of GptApi
@RegisterRestClient
public interface LlamaSyncApiClient extends GptApi {
}

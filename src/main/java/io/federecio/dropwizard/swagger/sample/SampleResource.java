package io.federecio.dropwizard.swagger.sample;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Federico Recio
 */
@Path("/sample")
@Api("/sample")
public class SampleResource {

    @GET
    @ApiOperation("Sample endpoint")
    public Response get() {
        return Response.ok(new SamplePojo("Federico", 1234)).build();
    }
}

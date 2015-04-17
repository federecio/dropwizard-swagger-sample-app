package io.federecio.dropwizard.swagger.sample;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;

/**
 * @author Federico Recio
 */
public class SampleApplication extends Application<SampleConfiguration> {

    public static void main(String...args) throws Exception {
        new SampleApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<SampleConfiguration>());
    }

    @Override
    public void run(SampleConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new SampleResource());
    }
}

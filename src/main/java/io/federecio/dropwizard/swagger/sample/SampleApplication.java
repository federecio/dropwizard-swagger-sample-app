package io.federecio.dropwizard.swagger.sample;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerDropwizard;

/**
 * @author Federico Recio
 * @author Trifon Trifonov
 */
public class SampleApplication extends Application<SampleConfiguration> {

	private final SwaggerDropwizard<SampleConfiguration> swaggerDropwizard = new SwaggerDropwizard<SampleConfiguration>();

	public static void main(String... args) throws Exception {
		new SampleApplication().run(args);
	}

	@Override
	public void initialize(Bootstrap<SampleConfiguration> bootstrap) {
		swaggerDropwizard.onInitialize(bootstrap);

		// Serve anything under /web-assets inside my JAR file under the URL pattern /,
		// with "index.html" as the default file. This bundle will be named "static-bundle", but name can be changed to whatever name you like.
		bootstrap.addBundle(new AssetsBundle("/web-assets", "/", "index.html", "static-bundle"));    // In order to work properly: environment.jersey().setUrlPattern("/api/*");
	}

	@Override
	public void run(SampleConfiguration configuration, Environment environment) throws Exception {
		//   Asset bundles not able to be served from root path.
		// - https://github.com/dropwizard/dropwizard/issues/661
		environment.jersey().setUrlPattern( "/api/*" );

		environment.jersey().register(new SampleResource());
		swaggerDropwizard.onRun(configuration, environment, "localhost");
	}
}
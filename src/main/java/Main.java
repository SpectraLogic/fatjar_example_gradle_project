import com.spectralogic.ds3client.Ds3Client;
import com.spectralogic.ds3client.Ds3ClientBuilder;
import com.spectralogic.ds3client.commands.GetServiceRequest;

import java.io.IOException;
import java.security.SignatureException;

public class Main {
    public static void main(final String[] args) throws IOException, SignatureException {
        System.out.println("Test");

        final Ds3Client client = Ds3ClientBuilder.fromEnv().withHttps(false).build();

        client.getService(new GetServiceRequest());
    }
}

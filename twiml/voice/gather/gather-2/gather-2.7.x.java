import com.twilio.twiml.Gather;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.Method;


public class Example {
    public static void main(String[] args) {
        Gather gather = new Gather.Builder().build();
        VoiceResponse response = new VoiceResponse.Builder().gather(gather)
            .build();

        try {
            System.out.println(response.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }
}

import com.twilio.twiml.Pause;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.Say;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.Method;


public class Example {
    public static void main(String[] args) {
        Say say = new Say.Builder("I will pause 10 seconds starting now!")
            .build();
        Say say2 = new Say.Builder("I just paused 10 seconds").build();
        Pause pause = new Pause.Builder().length(10).build();
        VoiceResponse response = new VoiceResponse.Builder().say(say)
            .pause(pause).say(say2).build();

        try {
            System.out.println(response.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }
}

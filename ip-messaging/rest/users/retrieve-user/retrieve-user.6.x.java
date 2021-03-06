import com.twilio.sdk.TwilioIPMessagingClient;
import com.twilio.sdk.resource.instance.ipmessaging.Service;
import com.twilio.sdk.resource.instance.ipmessaging.User;
import com.twilio.sdk.resource.list.ipmessaging.ServiceList;
import com.twilio.sdk.resource.list.ipmessaging.UserList;

public class TwilioTest {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static final String SERVICE_SID = "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String USER_SID = "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  
    public static void main(String args[]) throws TwilioRestException {
        // Initialize the client
        TwilioIPMessagingClient client = new TwilioIPMessagingClient(ACCOUNT_SID, AUTH_TOKEN);

        // Retrieve the service
        Service service = client.getService(SERVICE_SID);

        // Retrieve the user
        User user = service.getUser(USER_SID);
        System.out.println(user);
    }
}
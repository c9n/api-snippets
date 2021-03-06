using Twilio.TwiML;


class Example
{
    static void Main()
    {
        var response = new VoiceResponse();
        var gather = new Gather(action: "/completed", input: "speech");
        gather.Say("Welcome to Twilio, please tell us why you're calling");
        response.Gather(gather);

        System.Console.WriteLine(response.ToString());
    }
}

require "http"
require 'twilio-ruby'

# Initialize the client
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'
ip_messaging_client = Twilio::REST::IpMessagingClient.new(account_sid, auth_token)

# Update the credential
credential = ip_messaging_client.credentials.get('CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX')
puts credential.update(sid:'NEW_SID')

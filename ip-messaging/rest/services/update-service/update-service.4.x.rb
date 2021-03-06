require "http"
require 'twilio-ruby'

# Initialize the client
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'
ip_messaging_client = Twilio::REST::IpMessagingClient.new(account_sid, auth_token)

# Update the service
service = ip_messaging_client.services.get('FRIENDLY_NAME')
response = service.update(friendly_name: 'NEW_SID')
puts response

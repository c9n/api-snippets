# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioRestClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
auth_token  = "your_auth_token"
client = TwilioRestClient(account_sid, auth_token)

# A list of ip_access_control_list objects with the properties described above
ip_access_control_lists = client.sip.ip_access_control_lists.list()

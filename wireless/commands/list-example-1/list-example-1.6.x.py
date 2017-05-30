# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import Client

# required for all twilio access tokens
account_sid = 'ACxxxxxxxxxxxx'
api_secret = 'xxxxxxxxxxxxxx'

client = Client(account_sid, auth_token)

commands = client.preview.wireless.commands('DCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA')\
            .read()

print(commands)
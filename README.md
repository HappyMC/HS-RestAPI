# HappyShop REST-API
## Schema
```json
{
  "message": "..." // message,
  "code": "200" // http status code,
  "data": {} // optional - can be array or object
}
```

* [message]: message sent by the server.
* [code]: HTTP status code
* [data]: Not always available, must be checked first. can be an object or an array.

## Error Codes
Below is the list of mistakes you should remember to handle your requests.\
Depending on the request it may return a different HTTP code, but they are the ones that return the most by default.
* 200 - OK
* 400 - Bad Request
* 500 - Internal Server Error

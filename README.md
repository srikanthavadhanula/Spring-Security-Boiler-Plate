# Spring-Security-Boiler-Plate
This Repository has all the boilerplate code for Spring Security

### Features

- Basic Authentication
- JWT Authorization
- Google OAuth

## Basic Authentication

- In the repository Basic Auth Configuration annotation is commented, please uncomment if you want to use Basic Auth


## JWT Authentication

- JWT token creation is done in JwtSecurityController
- /authenticate is permitted to call without token
- Rest of the HttpRequests are added for authentication in filter chain
- You can find JWT configuration in JwtSecurityConfiguration

## JWT Verification Steps

> Since authenticate is permitted, we can use that to fetch the token

![Authentication](/images/authenticate.png)


> Use the token from the previous call and use that in the REST API calls

![Get](/images/get.png)


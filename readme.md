# Spring Security Process:

### Root Class Setup

- First Create a class that extend **WebSecurityConfigurerAdapter** and it will be annotated with **@EnableWebSecurity**


- Now we need to override methods from the WebSecurityConfigurerAdapter class.


- **configure(AuthenticationManagerBuilder auth)** this method is responsible for the user authentication. We use **AuthenticationManagerBuilder** to configure our authentication. We can handle user authentication on different way, like inMemoryAuthentication, jdbcAuthentication, or jpa based authentication.


- And **configure(HttpSecurity http)** this method is responsible for the user authorization by using **HttpSecurity**. We assign our roles for different uris. One rule for uri authorization is that the most secure uri must in higher position and chaining to less secure uri.


#### JPA Based Authentication

###### How Authentication Works
1. We have **AuthenticationManagerBuilder** which talks authentication providers which is talks to **UserDetailsService**. The UserDetailsService service has one method that is gets the users information based on the username - the method is loadUserByUsername(). 
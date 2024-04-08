
# Spring Boot Okta Integration

This is a Spring Boot application that demonstrates integration with Okta for SAML-based single sign-on (SSO). It provides a simple secured endpoint and uses Okta as the identity provider for authentication.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven
- Okta developer account (for SAML configuration)

### Installation
1. Clone the repository:
```bash
  git clone https://github.com/abhishekshah2905/spring-okta-integration.git
```
2. Navigate to the project directory:
```bash
  cd spring-okta-integration
```
3. Build the project:
```bash
  mvn clean install
```
4. Run the application:
```bash
  mvn spring-boot:run
```
5. Access the Application:
- Open a web browser and navigate to https://localhost:8443/secured.
- You should be redirected to the Okta login page. Enter your credentials to authenticate.
- After successful authentication, you should see the home page with a welcome message.

### Usage
- '/': Home page with a welcome message.
- '/secured': Secured page that requires authentication.

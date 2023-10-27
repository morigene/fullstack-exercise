package rw.bk.fullstackexercise.fullstackexercise.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "MUTUYIMANA Origene",
                        email ="orisoft52@gmail.com",
                        url="https://www.linkedin.com/in/origenemutuyimana/"
                ),
                description = "OpenAPI Documentation for BK fullstack  exercise",
                title = "OpenApi Specification - morigene",
                version = "1.0",
                license =  @License(
                        name = "License name",
                        url = "xx.com"
                ),
                termsOfService = "Only purpose for demo"
        ),

        servers ={
                @Server(
                        description = "Local ENV",
                        url="http://localhost8080"
                ),
                @Server(
                        description = "Test ENV",
                        url="http://testenvironment.com"
                ),

                @Server(
                        description = "PROD ENV",
                        url="http://prodenvironment.com"
                )
        },
        security = @SecurityRequirement(
                name = "bearerAuth"
        )
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenAPiConfig {
}

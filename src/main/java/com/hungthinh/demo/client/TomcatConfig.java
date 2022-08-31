package com.hungthinh.demo.client;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.ajp.AjpNioProtocol;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class TomcatConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory>
//{
//    @Value( "${tomcat.ajp.secret}" )
//    String ajpSecret;
//
//    @Value( "${tomcat.ajp.port}" )
//    int ajpPort;
//
//    @Override
//    public void customize( TomcatServletWebServerFactory factory )
//    {
//        factory.addAdditionalTomcatConnectors( ajpConnector() );
//    }
//
//    private Connector ajpConnector()
//    {
//        Connector connector = new Connector( "AJP/1.3" );
//        AjpNioProtocol protocol = (AjpNioProtocol) connector.getProtocolHandler();
//        protocol.setSecret( ajpSecret );
//        connector.setPort( ajpPort );
//        connector.setScheme("http");
//        connector.setSecure( true );
//
//        return connector;
//    }
//}
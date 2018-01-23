# apache-cxf-jax-ws-demo
A basic web service using Apache CXF as web service framework and JAX-WS specification as front-end with SOAP over HTTP as protocol binding. There is a client for the web service here: [apache-cxf-jax-ws-demo-client](https://github.com/niclasek/apache-cxf-jax-ws-demo-client).

## Apache CXF Maven Archetype
1. Generating a Maven Archetype CXF project: 
mvn archetype:generate -Dfilter=org.apache.cxf.archetype:
1. The HelloWorld WSDL link:
http://localhost:8080/apache-cxf-jax-ws-demo/HelloWorld?wsdl

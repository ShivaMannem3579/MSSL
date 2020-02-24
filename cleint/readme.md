MSSL
----
Traditionally, most of us are familiar with SSL. In this form, the server presents its certificate to the client and the client adds it to its list of trusted certificate. And so, the client can talk to the server.
 2 way SSL(Mutual SSL) is the same principle but both ways. i.e. both the client and the server has to establish trust between themselves using a trusted certificate. In this way of a digital handshake, the server needs to present a certificate to authenticate itself to client and client has to present its certificate to server.


What we are using:
----
Java 1.8
Spring Boot 2.1.2
keytool — this comes already with jdk installation.


We will create 2 Spring Boot applications.  We can call it client and server.

Create A Self Signed Client Cert
----

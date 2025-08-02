### JWT
```
A JSON Web Token (JWT) is Base64Url encoded.

A JWT consists of three parts: the header, the payload, and the signature.

To create the signature part you have to take the encoded header, the encoded payload, a secret, the algorithm
specified in the header, and sign that.

Each of these parts is individually Base64Url encoded before being concatenated with dots (.) to form the final
JWT string.

This Base64Url encoding (slightly different from Base64 encoding) ensures that the JWT is safe to transmit in
environments like HTTP headers and URLs, as it converts binary data into an ASCII string format that avoids
characters that might cause issues in these contexts.

Base64Url encoding is not encryption; it is simply an encoding scheme that makes the data URL-safe and compact.

Header & Payload that are based64url encoded was not meant to be hidden.
```

### JWT Use Cases
```
The most common scenario for using JWT is the HTTP header "Authorization", in the format of "Bearer <jwt_string>".

JWT is more compact than SAML.

SWT (Simple Web Tokens) can only be symmetrically signed by a shared secret. 
Both JWT and SAML tokens can use a public/private key pair in the form of an X.509 certificate for signing.
Signing XML with an XML Digital Signature without introducing obscure security holes is very difficult compared
to the simplicity of signing a JSON.

```

### Validating and Verifying a JWT
```
JWT validation generally refers to checking the structure, format, and content of the JWT.
JWT verification involves confirming the authenticity and integrity of the token.

```

### JWT general information
[Introduction to JSON Web Tokens](https://www.jwt.io/introduction)
